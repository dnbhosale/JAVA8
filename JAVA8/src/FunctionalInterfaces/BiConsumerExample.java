package FunctionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import Data.Student;
import Data.StudentDataBase;
public class BiConsumerExample {
	
	static BiConsumer<String ,List<String>> biConsumer=(name,activities)-> System.out.println(name +" - "+ activities);
	public static void printNameAndeActivities() {
		
		List<Student> data=StudentDataBase.getAllStudents();
		data.forEach((s)-> biConsumer.accept(s.getName(),s.getActivities())) ;
	}
	

	public static void main(String[] args) {  
		// TODO Auto-generated method stub
		 
		printNameAndeActivities();
		System.out.println("------------------------------------------");
		BiConsumer<String,String> twoString=(a,b)->System.out.println("your a and b String is : -> "+a +" "+b);
		twoString.accept("Dnyaneshwar", "Bhosale");
		System.out.println("------------------------------------------");
		BiConsumer<Integer,Integer> multiplication=(a,b)->System.out.println("Multiplication is :-> "+(a*b));
		BiConsumer<Integer,Integer> addition=(a,b)->System.out.println("Addition is :-> "+(a+b));
		BiConsumer<Integer,Integer> subtraction=(a,b)->System.out.println("Subtraction is :-> "+(a-b));
		System.out.println("\nCalling all three BiConsumer Interfaces :-> ");
		multiplication.andThen(subtraction).andThen(addition).accept(100, 50);
		
		

	}

}
