package Lambda;

import java.util.function.Consumer;

public class LambdaVariable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<Integer> c1=(num)-> System.out.println("Addition is :- "+(num+num));
		Consumer<Integer> c2=(num)-> System.out.println("Multiplication is :- "+(num*num));
		 
		c1.accept(10);
		c2.accept(20);
		System.out.println("------------------");
		c1.andThen(c2).accept(21);
		System.out.println("------------------");
		c1.andThen(c1).accept(21);
		
		 // outPut -> 12 122

	}

}
