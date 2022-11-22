package Lambda;

import java.util.Comparator;

public class ComparatorLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comparator<Integer> c1=(a,b)-> a.compareTo(b);
		System.out.println("Comparing 100 10 :"+c1.compare(100, 10));
		System.out.println("Comparing 10 100 :"+c1.compare(10, 100));
		System.out.println("Comparing 100 100 :"+c1.compare(100, 100));
		
		System.out.println("\nPrior to JAVA-8.0");
		
		Comparator<Integer> c2=new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return a.compareTo(b);
			}
			
		};
		
		System.out.println("Comparing 10 100 :>"+ c2.compare(10, 100));
		
		System.out.println("Creating own method by using comparator class");
		
		/*static public int compareTwoInteger(Comparator<Integer> c2,int a,int b) {
			
			return c2.compare(a, b);
		}
		
		
		
		
		System.out.println(compareTwoInteger(c1,10,10));*/
		
		

	}

}
