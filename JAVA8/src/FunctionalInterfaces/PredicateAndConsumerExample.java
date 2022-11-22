package FunctionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import Data.Student;
import Data.StudentDataBase;

public class PredicateAndConsumerExample {
	
	static Predicate<Student> gl=(p)->p.getGradeLevel()>=3;
	static Predicate<Student> gpa=(p)->p.getGpa()>=3.1;
	
	static BiConsumer<String,List<String>> bc=(a,b)->System.out.println(a +" :-> "+b);
	static Consumer<Student> c=(a)->{
		
		if(gl.and(gpa).test(a)) {bc.accept(a.getName(), a.getActivities());}
	};
	
	
	static Consumer<Student> nameConsumer=(a)-> {
		if(gl.or(gpa).test(a))
		System.out.println("Here is student name :-> "+a.getName());};
		
		public static void printName() {
			List<Student> dl=StudentDataBase.getAllStudents();
			
			Consumer<Student> nc=(a)->{
				if(gl.and(gpa).test(a))
					 System.out.println("name :-> "+a.getName());
				
					
			};
			dl.forEach(nc);
		}

	public static void main(String[] args) {
		 
		List<Student> l=StudentDataBase.getAllStudents();
		System.out.println("Calling the predicate -consumer-biconsumer-who gpa and gl is best");
		l.forEach(c);
		System.out.println("Calling the predicate-consumer-who gpa and gl is best");
		l.forEach(nameConsumer);
		 
		System.out.println("Calling the prinatStudent ------");
		printName();
		

	}

}
