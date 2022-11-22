package FunctionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

import Data.Student;
import Data.StudentDataBase;

public class ConsumerExample {

	static Consumer<Student> c1 = data -> System.out.println(data);
	static Consumer<Student> c2 = name -> System.out.println(name.getName().toUpperCase());
	static Consumer<Student> c3 =temp -> System.out.println(temp.getName().concat(":") +" ->"+ temp.getGpa());

	public static void printData() {
		List<Student> plist = StudentDataBase.getAllStudents();
		plist.forEach(c1);
	}

	public static void printName() {
		List<Student> name = StudentDataBase.getAllStudents();
		System.out.println("\nPrinting all name values here  ");
		name.forEach(c2);
		 
	}
	
	public static void printBestGPA() {
		List<Student> temp=StudentDataBase.getAllStudents();
		System.out.println("\nprinting conditional data -> whose GPA is greater than the 3.5 ");
		temp.forEach((s)-> {if(s.getGpa() >=3.5) c3.accept(s);});
	}

	public static void main(String[] s) {
		printData();   
		printName();
		printBestGPA();

	}

}
