package StreamInterface;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {
	
	public static Optional<Integer> limitTest(List<Integer> temp) {
		
		return temp.stream().limit(2).reduce((a,b)->a+b);
	}
	
	public static Optional<Integer> skipTest(List<Integer>temp) {
		
		return temp.stream().skip(4).reduce((a,b)-> a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(1,2,23,4,55,5);
		System.out.println("Limit test :-> "+limitTest(list));
		System.out.println("Skip test :-> "+skipTest(list));

	}

}
