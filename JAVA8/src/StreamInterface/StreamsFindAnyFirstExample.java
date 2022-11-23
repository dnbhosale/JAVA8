package StreamInterface;

import java.util.Optional;

import Data.Student;
import Data.StudentDataBase;

public class StreamsFindAnyFirstExample {
	
	public static Optional<Student> findAnyMethod() {
		return StudentDataBase.getAllStudents().stream().filter(s->s.getGpa()>=4).findAny();
		
	}
	
	public static Optional<Student> findFirstExample() {
		
		return StudentDataBase.getAllStudents().stream().filter(s->s.getGpa()>=4).findFirst();
	}

	public static void main(String[] args) {

		
		Optional<Student> temp=findAnyMethod();
		if(temp.isPresent())System.out.println("DATA :-> "+temp.get());
		else System.out.println("Records not found !!");
		
		Optional<Student> temp2=findFirstExample();
		if(temp2.isPresent())System.out.println("Data :-> "+temp2.get());
		else System.out.println("Record not found");

	}

}
