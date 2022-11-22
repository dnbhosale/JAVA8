package FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
	

  static Predicate<Integer> p1=(a)-> a==2;
  static Predicate<Integer>p2=(a)-> a>=a;
  static Predicate<Integer>p3=(a)-> a%2==0;
  
  public static boolean predicateAnd() {
	  System.out.print("  return p1.and(p2).test(10):-> ");
	  return p1.and(p2).test(10);
  }
  
  public static boolean predicateEqual() {
	  System.out.print("  return p1.equals(p3):-> ");
	  return p1.equals(p3);
  }
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(predicateAnd());
		System.out.println(predicateEqual());

	}

}
