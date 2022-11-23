package StreamInterface;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsOfGenerateIterateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Stream<String> s=Stream.of("RAM","RAM","RAM","RAM","RAM");
		s.forEach( System.out::println);
		
		List<Integer> list=(List<Integer>) Stream.iterate(1, x->x*2).limit(10).collect(Collectors.toList());
		System.out.println("Iterating :-> "+list);
		
		Supplier<Integer> s1= new Random()::nextInt;
		List<Integer> list1=Stream.generate(s1).limit(10).collect(Collectors.toList());
		System.out.println("Generate :-> "+list1);
		

	}

}
