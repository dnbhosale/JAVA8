package StreamInterface;

import Data.Student;
import Data.StudentDataBase;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {
	
	
	public static List<String> printAllStudentActivities(){
		List<String> list=StudentDataBase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).collect(Collectors.toList());
				
				return list;
	}
	
	 public static List<String> printUniqueStudentActivities() {
		 
		 List<String> list=StudentDataBase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).distinct().sorted().collect(Collectors.toList());
		 return list;
	 }
	 
	 public static int printCountOfActivities() {
		int listCount=(int) StudentDataBase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).distinct().count();
		 return listCount;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Student Activities List :-> "+printAllStudentActivities());
		System.out.println("Printing Unique Student Activities :-> "+printUniqueStudentActivities());
		System.out.println("Print the count of unique activities count :-> "+printCountOfActivities());

	}

}
