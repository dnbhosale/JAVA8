package MethodReference;

import java.util.function.Predicate;

import Data.Student;
import Data.StudentDataBase;

public class MethodReferenceWithPredicate {
	
	static Predicate<Student> p=(s)-> s.getGpa()>3;
	static Predicate<Student> p2=MethodReferenceWithPredicate::ptest;
	
	
	public static boolean ptest(Student s) {
		return s.getGpa()>3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
           System.out.println(p.test(StudentDataBase.studentSupplier.get()));
           System.out.println(p2.test(StudentDataBase.studentSupplier.get()));
           
           System.out.println("it is not mandatory to replace all lambda by MR because its dose not fit everywhere");

	}

}
