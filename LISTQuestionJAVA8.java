package JAVA8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class LISTQuestionJAVA8 {
	public static void main(String[] args) {
		List<Employee> e = Arrays.asList(new Employee("John", 30, 80000, "IT", "Developer", false),
				new Employee("Alice", 25, 60000, "HR", "HR Specialist", false),
				new Employee("Bob", 35, 90000, "Finance", "Manager", true),
				new Employee("Eva", 28, 750000, "IT", "Tester", false),
				new Employee("Mike", 40, 120000, "Finance", "Director", true),
				new Employee("Sophie", 22, 50000, "HR", "Intern", false),
				new Employee("David", 32, 95000, "IT", "Architect", true),
				new Employee("Grace", 29, 70000, "Finance", "Analyst", false),
				new Employee("John", 40, 120000, "Finance", "Director", true),
				new Employee("reacher", 444, 120000, "IT", "Intern", true));

		// 1-Find the Highest-Paid Manager:
		Optional<Employee> hpm = e.stream().filter(Employee::isManager)
				.max(Comparator.comparingDouble(Employee::getSalary));
		hpm.ifPresent(employee -> System.out.println("Highest Paid Manager: " + employee.toString()));
		// 2-Calculate the Average Salary for Each Department:
		Map<String, Double> ased = e.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(ased);
		// 3-Check if All Employees Are Managers:
		boolean iaerm = e.stream().allMatch(Employee::isManager);
		System.out.println(iaerm);
		// 4-Find the Employee with the Longest Name:
		Optional<Employee> eln = e.stream().max(Comparator.comparingInt(temp -> temp.getName().length()));
		eln.ifPresent(temp -> System.out.println(eln.toString()));
		// 5-Determine if Any Employee Earns More Than the Average Salary:
		boolean eetas = e.stream()
				.anyMatch(temp -> temp.getSalary() > e.stream().mapToDouble(Employee::getSalary).average().orElse(0));
		System.out.println(eetas);
		// 6-Group Employees by Department and Then by Designation:
		Map<String, Map<String, List<Employee>>> ee = e.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.groupingBy(Employee::getDesignation)));
		ee.forEach((department, designationMap) -> {
			System.out.println("Department: " + department);
			designationMap.forEach((designation, employees) -> {
				System.out.println("  Designation: " + designation);
				employees.forEach(System.out::println);
			});
		});

		// 7-Find the Oldest Employee in Each Department:
		Map<String, Optional<Employee>> oee = e.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.maxBy(Comparator.comparingInt(Employee::getAge))));
		oee.forEach((a, b) -> {
			System.out.println(a);
			b.ifPresent(t -> System.out.println(t));
		});

		// 8-Check if Any Employee Is Not Assigned to a Department:
		boolean temp1 = e.stream().anyMatch(t -> t.getDepartment() == null || t.getDepartment().isEmpty());
		System.out.println(temp1);

		// 9-Concatenate Names of Employees in a Single String, Separated by "/":
		String temp2 = e.stream().map(Employee::getName).collect(Collectors.joining(" / "));
		System.out.println(temp2);
		// 10-Count the Number of Non-Manager Employees in Each Department:
		Map<String, Long> temp3 = e.stream().filter(temp -> !temp.isManager())
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(temp3);
		// 11-Find the Top N Earners:
		List<Employee> temp4 = e.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(2)
				.collect(Collectors.toList());
		System.out.println(temp4);
		// 12-Calculate the Age Distribution:
		Map<Integer, Long> temp5 = e.stream().collect(Collectors.groupingBy(Employee::getAge, Collectors.counting()));
		temp5.forEach((a, b) -> System.out.println(a + " " + b));
		// 13- Calculate the Age Distribution:by range basis
		Map<String, Long> temp6 = e.stream().collect(Collectors.groupingBy(temp -> {
			int a = temp.getAge();
			if (a > 10 && a <= 30)
				return "10-30";
			else if (a > 30 && a <= 50)
				return "30-50";
			else
				return "50+";
		}, Collectors.counting()));
		temp6.forEach((a, b) -> System.out.println(a + " " + b));
		// 14-Determine the Highest-Paid Employee in Each Department:
		Map<String, Optional<Employee>> temp7 = e.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
		temp7.forEach((a, b) -> System.out.println(a + " " + b));
		// 15-Find the Department with the Highest Average Salary:
		Optional<Map.Entry<String, Double>> temp8 = e.stream()
				.collect(
						Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)))
				.entrySet().stream().max(Map.Entry.comparingByValue());
		// 16- Group Employees by Age Range:
		Map<String, List<Employee>> employeesByAgeRange = e.stream().collect(Collectors.groupingBy(temp -> {
			if (temp.getAge() < 25)
				return "Under 25";
			else if (temp.getAge() < 35)
				return "25-34";
			else
				return "35 and above";
		}));
		// 17-Calculate the Total Salary for Each Designation:
		e.stream().collect(
				Collectors.groupingBy(Employee::getDesignation, Collectors.summingDouble(Employee::getSalary)));
		// 18-Find the Employees with a Salary Increase of at Least 10% from the
		// Previous Year:

		// 19-Partition Employees into Managers and Non-Managers:
		Map<Boolean, List<Employee>> temp9 = e.stream().collect(Collectors.partitioningBy(Employee::isManager));
		temp9.forEach((a, b) -> System.out.println(a + " " + b));
		// 20-Find the Employee with the Highest Salary Increase Percentage:

	}

	public static class Employee {
		private String name;
		private int age;
		private double salary;
		private String department;
		private String designation;
		private boolean isManager;

		public Employee(String name, int age, double salary, String department, String designation, boolean isManager) {
			this.name = name;
			this.age = age;
			this.salary = salary;
			this.department = department;
			this.designation = designation;
			this.isManager = isManager;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public boolean isManager() {
			return isManager;
		}

		public void setManager(boolean isManager) {
			this.isManager = isManager;
		}

		@Override
		public String toString() {
			return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", department=" + department
					+ ", designation=" + designation + ", isManager=" + isManager + "]";
		}

	}
}
