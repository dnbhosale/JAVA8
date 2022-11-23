package StreamInterface;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import Data.Student;
import Data.StudentDataBase;

public class StreamsComparatorExample {
	
	public static BiConsumer<String, Integer> bc=(name, gpa) ->  System.out.println(name +" "+gpa);
	
	public static List<String> printStudentNameBySortedOrder(){
		  return StudentDataBase.getAllStudents().stream().map(Student::getName).sorted().collect(Collectors.toList());
	  	}

	public static List<Student> printStudentDataBySorted(){
		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
	}
	
	public static void printNameAndGPSbySortedGPA( ){
		System.out.println("printNameAndGPSbySortedGPA calling ");
		Predicate<Student> p= (temp)->temp.getGpa()>=3;
	 	BiConsumer<String, Integer> bc=(a,b)->{System.out.println(a +":-> "+b);};
		  Consumer<Student> c=(temp)->{
			if(p.test(temp)) {bc.accept(temp.getName(), (int) temp.getGpa());}
		};
		
		List<Student> list=StudentDataBase.getAllStudents();
		list.forEach(c);
		
		 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Student names in Ordered format :-> "+printStudentNameBySortedOrder());
		System.out.println("Student data sorted by name :-> "+printStudentDataBySorted());
		
		List<Student> list=StudentDataBase.getAllStudents();
		list.forEach((s)->bc.accept(s.getName(), (int) s.getGpa()));
		printNameAndGPSbySortedGPA( );

	}

}
