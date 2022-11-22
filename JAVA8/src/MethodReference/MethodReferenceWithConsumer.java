package MethodReference;

import java.util.List;
import java.util.function.Consumer;

import Data.Student;
import Data.StudentDataBase;

public class MethodReferenceWithConsumer {
	
	
	
	static Consumer<Student>c=(data)->System.out.println(data.getActivities());// byLambda
	static Consumer<Student> c1=System.out::println;
	static Consumer<Student> c2=(student->student.printListOfActivities());
	static Consumer<Student> c3=Student::printListOfActivities;
	static Consumer<Student> c4=System.out::println;
	static Consumer<Student> c5=Student::getActivities;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 	StudentDataBase.getAllStudents().forEach(c4); System.out.println(c4);
		List<Student> list=StudentDataBase.getAllStudents();
		list.forEach(c5);
	/*	StudentDataBase.getAllStudents().forEach(c3);
		StudentDataBase.getAllStudents().forEach(c4);
		StudentDataBase.getAllStudents().forEach(c5);
		StudentDataBase.getAllStudents().forEach(c);  */
        
	}

}
