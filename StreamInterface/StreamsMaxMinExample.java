package StreamInterface;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMaxMinExample {
	
	
	public static Optional<Integer> getMaxValue(List<Integer> temp) {
		
		return temp.stream().reduce(Integer::max);
		 
	}
	
	public static Optional<Integer> getMinValue(List<Integer> temp) {
		return temp.stream().reduce((a,b)-> (a>b)?b:a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList();
		//System.out.println(getMaxValue(list));
		Optional<Integer> temp=getMaxValue(list);
		
		 int max= (temp.isPresent())? temp.get():-1;
		 System.out.println("maX VALUE :-> "+max);
		 
		
		
		

	}

}
