package FunctionalInterfaces;
import java.util.function.*;

public class FunctionExample {
	
	static Function <String,String> upperCase=(name)-> name.toUpperCase();
	static Function <String,String> addSomething =(name)-> name.toUpperCase().concat("Default");
	static Function <String,Integer> stringLength=(name)-> name.length();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Uppercase conversion :-> "+upperCase.apply("Dnyaneshwar") );
		System.out.print("UpperCase and adding something :-> " + upperCase.andThen(addSomething).apply("Bhosale"));
		System.out.println("\nUppercase and compose :-> "+ upperCase.compose(addSomething).apply("DNAYN"));
		System.out.println("\nFind the String Length :-> "+stringLength.apply("DNYAN"));
		Function<String,String> as=Function.identity();
		System.out.println("Indentity function :-> "+as.apply("DNYAN"));
	}

}
 