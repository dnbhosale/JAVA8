package StreamInterface;

import java.util.List;
import java.util.stream.Collectors;

import Data.Student;
import Data.StudentDataBase;

public class StreamsFilterExample {

	public static List<Student> printFilterByGPAAndGender() {

		List<Student> list = StudentDataBase.getAllStudents().stream().filter(temp -> temp.getGpa() > 3)
				.filter(temp2 -> temp2.getGender().equals("female")).collect(Collectors.toList());
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Print by Filtering data :-> " + printFilterByGPAAndGender());

	}

}
