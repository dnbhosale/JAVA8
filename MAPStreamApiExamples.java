package JAVA8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MAPStreamApiExamples {

    public static void main(String[] args) {
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("anil", 1000);
        map2.put("ankit", 1200);
        map2.put("bhavna", 1200);
        map2.put("james", 1200);
        map2.put("micael", 1000);
        map2.put("tom", 1300);
        map2.put("daniel", 1300);

        // Program 1: Find the average salary
        double averageSalary = map2.values().stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0);
        
        System.out.println("Average Salary: " + averageSalary);

        // Program 2: Find the employee with the highest salary
        String highestSalaryEmployee = map2.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println("Employee with Highest Salary: " + highestSalaryEmployee);

        // Program 3: Group employees by salary
        Map<Integer, Long> salaryGroupCount = map2.values().stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        System.out.println("Salary Group Count: " + salaryGroupCount);

        // Program 4: Find the sum of salaries
        int totalSalary = map2.values().stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Total Salary: " + totalSalary);

        // Program 5: Increase all salaries by 10%
        Map<String, Double> increasedSalaries = map2.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue() * 1.1));
        System.out.println("Increased Salaries: " + increasedSalaries);

        // Program 6: Find the employee with the lowest salary
        String lowestSalaryEmployee = map2.entrySet().stream()
                .min(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println("Employee with Lowest Salary: " + lowestSalaryEmployee);

        // Program 7: Count employees with a salary greater than 1100
        long countAbove1100 = map2.values().stream()
                .filter(salary -> salary > 1100)
                .count();
        System.out.println("Count of Employees with Salary > 1100: " + countAbove1100);

        // Program 8: Double the salary of employees with a salary less than 1200
        Map<String, Integer> doubledSalaries = map2.entrySet().stream()
                .filter(entry -> entry.getValue() < 1200)
                .collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue() * 2));
        System.out.println("Doubled Salaries for Employees with Salary < 1200: " + doubledSalaries);

        // Program 9: Find the distinct salary values
        long distinctSalariesCount = map2.values().stream()
                .distinct()
                .count();
        System.out.println("Distinct Salary Values Count: " + distinctSalariesCount);

        // Program 10: Concatenate names of employees with salary 1200
        String namesWithSalary1200 = map2.entrySet().stream()
                .filter(entry -> entry.getValue() == 1200)
                .map(Map.Entry::getKey)
                .collect(Collectors.joining(", "));
        System.out.println("Names of Employees with Salary 1200: " + namesWithSalary1200);
    }
}
