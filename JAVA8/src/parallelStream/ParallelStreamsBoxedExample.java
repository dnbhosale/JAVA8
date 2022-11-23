package parallelStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamsBoxedExample {
	
	public static int parallelTest(List<Integer> list) {
		long start=System.currentTimeMillis();
		
		int res=list.parallelStream().reduce(0,(x,y)->x+y);
		System.out.println("Parallel Stream test :-> "+(System.currentTimeMillis()-start));
		
		return res;
	}
	
	public static int sequentialTest(List<Integer> list) {
		long start=System.currentTimeMillis();
		int res=list.stream().reduce(0, (x,y)->x+y);
System.out.println("Sequntial Stream test :-> "+(System.currentTimeMillis()-start));
		
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());
		System.out.println("Paralle test :-> "+parallelTest(list));
		System.out.println("-------------------------------------------------");
		System.out.println("Sequntial test :-> "+sequentialTest(list));

	}

}
