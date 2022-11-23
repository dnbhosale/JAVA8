package StreamInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.stream.Collectors;

import Data.Student;
import Data.StudentDataBase;

public class StreamsMapExample {
	
	
	public static List<String> getNamesAsUppercase(List<Student> temp){
		List<String> list=temp.stream().map(Student::getName).map(String::toUpperCase).collect(Collectors.toList());
		return list;
	}
	
	public static Set<String> setNamesAsUpperCase(List<Student> temp){
		
		Set<String> set=temp.stream().map(Student::getName).map(String::toUpperCase).collect(Collectors.toSet());
		return set;
	}
	
	public static Map<String,Integer> mappingNamesAndLength(ArrayList<String> temp){
		
		Map<String,Integer> map=temp.stream().collect(Collectors.toMap(String::toString,String::length));
		return map;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("getting names as uppercase Format :->"+getNamesAsUppercase(StudentDataBase.getAllStudents()));
		System.out.println("Set ing names as uppercase Format :-> "+setNamesAsUpperCase(StudentDataBase.getAllStudents()));
		
		ArrayList<String> al=new ArrayList<>();
		al.add("RAM");
		al.add("SHAM");
		al.add("SHITA");
		
		System.out.println("mapping names and Length of the names :->"+mappingNamesAndLength(al));
		
		
		

	}

}
