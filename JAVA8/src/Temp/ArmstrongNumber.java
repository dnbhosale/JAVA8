package Temp;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=153;
		System.out.println(isArmstrong(153)==num);

	}
	
	public static int isArmstrong(int n) {
		
		if(n<=0)return 0;
		return (n%10)*(n%10)*(n%10)+isArmstrong(n/10);
	}

}
