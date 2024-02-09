package logic;

public class InterchangeNumbers {
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		int t = a;
		a=b;
		b=c;
		c=t;
		
		System.out.println(a +" "+ b+" "+c);
	}
}
