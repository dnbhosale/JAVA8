package JAVA8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class MapQuestionJAVA8 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("anil", 1000);
		map.put("ankit", 1200);
		map.put("bhavna", 1200);
		map.put("james", 1200);
		map.put("jadu", 1000);
		map.put("tom", 1300);
		map.put("daniel", 1309);
		map.put("Dnay", 1232);

		// Program 1: Find the average salary
		System.out.println(
				"Avegerage salary " + map.values().stream().mapToDouble(Integer::doubleValue).average().orElse(0.0));

		// Program 2: Find the employee with the highest salary

		// Program 3: Group employees by salary
		System.out.println("sal->match_emp " + map.entrySet().stream().collect(Collectors
				.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList()))));

		System.out.println(
				"sal -> count " + map.values().stream().collect(Collectors.groupingBy(i -> i, Collectors.counting())));

		// Program 4: Find the sum of salaries

		System.out.println("sum of salary " + map.values().stream().mapToInt(Integer::intValue).sum());

		// Program 5: Increase all salaries by 10%
		System.out.println("sal inc 10% "
				+ map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, i -> i.getValue() * 1.1)));

		// Program 6: Find the employee with the lowest salary

		// Program 7: Count employees with a salary greater than 1100

		System.out.println("count of sal" + map.values().stream().filter(i -> i > 1100).count());
		// Program 8: Double the salary of employees with a salary less than 1200

		System.out.println("double for >1200 " + map.entrySet().stream().filter(i -> i.getValue() < 1200)
				.collect(Collectors.toMap(Map.Entry::getKey, i -> i.getValue() * 2)));
		// Program 9: Find the distinct salary values

		System.out.println("dsv " + map.values().stream().distinct().collect(Collectors.toList()));
		// Program 10: Concatenate names of employees with salary 1200
		System.out.println("concat name and salary "
				+ map.entrySet().stream().map(i -> i.getKey() + i.getValue()).collect(Collectors.toList()));
		//11-  Find the employee(s) with the highest salary
			Optional< Map.Entry<String,Integer>> temp1=map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue));
			System.out.println("Max salary -"+temp1.orElse(null));
	// 12-Group employees by first letter of their name
			Map<Object, List<Entry<String, Integer>>> temp2=map.entrySet().stream().collect(Collectors.groupingBy(e->e.getKey().charAt(0)));
			System.out.println(temp2);
   // 13 - Find the employee with the lowest salary
			map.entrySet().stream().min(Comparator.comparing(Map.Entry::getValue));;
			//14 - Count employees with a salary less than or equal to 1100
			map.values().stream().filter(s->s >=1000).count();
			//15 - Multiply salary by 1.2 for employees with a salary greater than 1200
   map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, e->e.getValue() >=1000 ?e.getValue()*1.2:(double)e.getValue()));
	// 16-Find the employee with the longest name
      map.entrySet().stream().max(Comparator.comparing(t->t.getKey().length()));
      // 17-Find the sum of salaries for employees whose name starts with a vowel
      map.entrySet().stream().filter(e->"aeoiuAEOIU".indexOf(e.getKey().charAt(0)) !=-1).mapToInt(Map.Entry::getValue).sum();
      
 //17- Find the employee(s) with the second highest salary
//      List<Map.Entry<String, Integer>> sortedEmployeesBySalary = map.entrySet().stream()
//              .sorted(Comparator.comparing(Map.Entry::getValue).reversed()).collect(Collectors.toList());
//      Map.Entry<String, Integer> secondHighestSalaryEmployee = sortedEmployeesBySalary.stream()
//              .skip(1).findFirst().orElse(null);
      
      //18- Remove employees with a salary less than 1000
      map.entrySet().removeIf(entry -> entry.getValue() < 1000);
      
      //19-Check if all employees have a salary greater than 1000
      boolean allSalariesAbove1000 = map.values().stream().allMatch(salary -> salary > 1000);
      
	}
}
