package parallelStream;

import java.lang.StackWalker.Option;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {
	
	
	
	public static long performanceCheckTest(Supplier<Integer> sum,int rep) {
		
		long start=System.currentTimeMillis();
		for(int i=0;i<rep;i++) {
			sum.get();
		}
		
		long end=System.currentTimeMillis();
		return end-start;
	}

	 public static int parallelStream() {
		 int tot=IntStream.rangeClosed(1, 10000).parallel().sum();
		 return tot;
	 }
	 
	 public static int sequentialStream() {
		 int tot=IntStream.rangeClosed(1,10000).sum();
		 return tot;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("AvailableProcessors :->"+ Runtime.getRuntime().availableProcessors());
		System.out.println("----------------------------------------------------------------");
		long parallelDuration=performanceCheckTest(ParallelStreamExample::parallelStream, 20);
	     System.out.println("parallelDuration in MilliSeconds: " + parallelDuration);
		//System.out.println("parallelDuration Stream test :-> "+performanceCheckTest(ParallelStreamExample::parallelStream, 20));
		System.out.println("----------------------------------------------------------------");
		
		
		//System.out.println("Sequential stream test :-> "+performanceCheckTest(ParallelStreamExample::sequentialStream, 20));
        long sequentialDuration=performanceCheckTest(ParallelStreamExample::sequentialStream, 20);
		System.out.println("sequentialDuration in MilliSeconds: " + sequentialDuration);
		System.out.println("----------------------------------------------------------------");
		
		 
		

	}

}
