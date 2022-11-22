package StreamInterface;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import Data.Student;
import Data.StudentDataBase;

public class StreamsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Student> p= (s)-> s.getGradeLevel()>3;
		
		Map<String,List<String>> studentmapping=StudentDataBase.getAllStudents()
				.stream().filter(p).collect(Collectors.toMap(Student::getName, Student::getActivities));
		
		     System.out.println("Student Mapping data :-> "+studentmapping);
		     
		     
		     List<String> studentActivities=StudentDataBase.getAllStudents().
		    		 stream().map(Student::getActivities) .flatMap(List::stream).distinct().collect(Collectors.toList());
		     System.out.println("Activities :-> "+studentActivities);
		     
		     List<String> nameList=StudentDataBase.getAllStudents()
		    		 .stream().peek((student -> {
		                    System.out.println(student);
		                })).map(Student::getName).peek(System.out::println).collect(Collectors.toList());
		     System.out.println("nameList :-> "+nameList);
		     
		     //
		     System.out.println("Here tetsing");
		     List<String> nameList2=StudentDataBase.getAllStudents()
		    		 .stream(). map(Student::getName).peek(System.out::print).collect(Collectors.toList());
		     System.out.println("nameList :-> "+nameList2);
	}

}
