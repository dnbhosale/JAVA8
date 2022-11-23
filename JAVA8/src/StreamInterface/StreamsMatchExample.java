package StreamInterface;

import Data.Student;
import Data.StudentDataBase;

public class StreamsMatchExample {
	
	public static boolean allMatchCheckTest() {
		
		boolean b=StudentDataBase.getAllStudents().stream().allMatch(s->s.getGpa()>33);
		return b;
		
	}
	
	public static boolean matchAnyChekcTest() {
		
		boolean b=StudentDataBase.getAllStudents().stream().anyMatch(s->s.getGpa()>2);
		return b;
	}
	
	public static boolean noMatchCheckTest() {
		
		boolean b=StudentDataBase.getAllStudents().stream().noneMatch(s->s.getGpa()>2);
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Checking all match for GPA greater than Three :-> "+allMatchCheckTest());
		System.out.println("Checking any match for GPA greater than Three :-> "+matchAnyChekcTest());
		System.out.println("Checking no match for GPA a conditional :->"+noMatchCheckTest());

	}

}
