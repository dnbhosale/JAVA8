package numericstreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Sum of Range :-> "+IntStream.rangeClosed(1, 10).sum());
        OptionalInt max = IntStream.rangeClosed(1,50).max();
        System.out.println(max.isPresent());
        System.out.println(max.getAsInt());

        OptionalLong min = LongStream.rangeClosed(1,50).min();
        System.out.println(min.getAsLong());

        OptionalDouble avg = IntStream.rangeClosed(1,50).average();
        System.out.println(avg.getAsDouble());

	}

}
  