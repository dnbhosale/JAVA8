package StreamInterface;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsvsStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names=new ArrayList< >();
		names.add("RAM");
		names.add("SITA");
		names.add("LAKSHIMAN");
		names.add("RAVAN");
		
		Stream<String> s=names.stream();
		
		names.forEach(System.out::println);
		 
		 
		

	}

}
