package StreamInterface;

import java.util.function.Predicate;

import Data.Student;
import Data.StudentDataBase;

public class StreamsFilterMapReduceExample {
	
	public static Predicate<Student> pGender=temp-> {
		
		return temp.getGender().equals("male");
	};
	
	public static Predicate<Student> pGrade=temp2->{
		
		return temp2.getGpa()>=4.0;
	};
	
	public static int totalNoOfNoteBook() {
		
		int temp=StudentDataBase.getAllStudents().stream().filter(pGender).filter(pGrade).map(Student::getNoteBooks).reduce(0,Integer::sum);
		return temp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("get Notebook count via filters data :-> "+totalNoOfNoteBook());
	}

}
