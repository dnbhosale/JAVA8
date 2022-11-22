package ConstructorReference;

import java.util.function.Function;
import java.util.function.Supplier;

import Data.Student;

public class ConstructorReferenceExample {

	static Supplier<Student> s = Student::new;
	static Function<String, Student> f = Student::new;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(s.get());
		System.out.println(f.apply("Dnyaneshwar Bhosale"));

	}

}
