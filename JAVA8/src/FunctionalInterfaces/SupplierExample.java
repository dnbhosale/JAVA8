/**
 * 
 */
package FunctionalInterfaces;

import java.util.List;
import java.util.function.Supplier;

import Data.Student;
import Data.StudentDataBase;

public class SupplierExample {

	static Supplier<List<Student>> s = () -> StudentDataBase.getAllStudents();

	public static Supplier<String> s2 = () -> {
		return "DNYAN";
	};
	public static Supplier<int[]> s3 = () -> {
		int[] a = new int[5];
		for (int i = 0; i < 5; i++)
			a[i] = i;
		return a;
	};

	public static void main(String[] args) {

		System.out.println("Supplier interface -> " + s.get());
		System.out.println(s2.get());
		System.out.println(s3.get());

	}

}
