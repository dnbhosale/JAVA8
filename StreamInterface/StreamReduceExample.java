package StreamInterface;

import java.util.List;
import java.util.Optional;

import Data.Student;
import Data.StudentDataBase;

import java.util.Arrays;

public class StreamReduceExample {
	
	
	public static Optional<Integer> printMultiplication(List<Integer> value) {
		return value.stream().reduce((a,b)->a*b);
	}
	
		
		//Integer sum = integers.reduce(0, (a, b) -> a+b);
	    //Integer sum = integers.reduce(0, Integer::sum);
	
	public static Optional<String> combineStudentName() {
		
		return StudentDataBase.getAllStudents().stream().map(Student::getName).distinct().reduce((a,b)->a.concat("-").concat(b));
	}
    
	
	public static Optional<Integer> printAdditionOfNumberInList(List<Integer> values) {
		return values.stream().reduce((a,b)->(a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubX
		
		List<Integer> numberList=Arrays.asList(1,2,3,4,5,12,324,242,4);
		System.out.println("Multiplication :-> "+printMultiplication(numberList));
		System.out.println("Concating all students names :-> "+combineStudentName());
		System.out.println("Printing the addition of List Number:-> "+printAdditionOfNumberInList(numberList));

	}

}
