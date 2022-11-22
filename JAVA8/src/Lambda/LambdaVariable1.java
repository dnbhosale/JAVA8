package Lambda;

import java.util.function.Consumer;

public class LambdaVariable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0; // Repeated varibale name not allowed
		//see here
		// Consumer<Integer> c1 = (i) -> {
		Consumer<Integer> c11 = (a) -> {
			// int i=0;
			
		 
			System.out.println(i);
			System.out.println(a);
			 
		};
		c11.accept(10);
		
	}

}
