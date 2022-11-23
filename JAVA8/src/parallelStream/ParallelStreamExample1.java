package parallelStream;

import java.util.List;
import java.util.stream.Collectors;

import Data.StudentDataBase;
import Data.Student;

public class ParallelStreamExample1 {
	
	   public static List<String> sequentialStream(){

	       long start = System.currentTimeMillis();
	        List<String> studentActivities = StudentDataBase.getAllStudents()
	                .stream() 
	                .map(Student::getActivities) //Stream<List<String>>
	                .flatMap(List::stream) //<Stream<String>
	                .collect(Collectors.toList());

	       long duration = System.currentTimeMillis()-start;
	       System.out.println("Duration in sequential stream : "+ duration);

	        return studentActivities;
	    }

	    public static List<String> parallelStream(){

	        long start = System.currentTimeMillis();
	        List<String> studentActivities = StudentDataBase.getAllStudents()
	                .parallelStream()
	                .map(Student::getActivities) //Stream<List<String>>
	                .flatMap(List::stream) //<Stream<String>
	                .collect(Collectors.toList());

	        long duration = System.currentTimeMillis()-start;
	        System.out.println("Duration in parallel stream : "+ duration);

	        return studentActivities;

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("sequentialStream : " + sequentialStream());

	        System.out.println("parallelStream : " + parallelStream());


	}

}
