package Lambda;

public class RunnableLambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r1=new Runnable() {
			
			public void run() {
				System.out.println("Runnable before the 8.0");
				System.out.println("-----------------------------");
			}
		};
		new Thread(r1).start();
		
		
		Runnable r2=()-> System.out.println("Runnable with  8.0 ");
		new Thread(r2).start();
		
		new Thread(()-> System.out.println("Short runnable with 8.0")).start();

	}

}
