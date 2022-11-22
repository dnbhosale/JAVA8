package MethodReference;

import java.util.function.Function;

public class MthodReferenceWithFunction {

	static Function<String, String> functionWithLambda = (s) -> s.toUpperCase();
	static Function<String, String> functionWithMethodReference = String::toUpperCase;

	public static void main(String[] args) {

		System.out.println("functionWithLambda :-> " + functionWithLambda.apply("dnyaneshwar bhosale"));
		System.out
				.println("functionWithMethodReference :-> " + functionWithMethodReference.apply("dnyaneshwar bhosale"));

		System.out.println(
				"Why Method reference ........!! \n Method reference is the best simple way to impliment the functional interface rather creating a anonymous classes..");

	}

}
