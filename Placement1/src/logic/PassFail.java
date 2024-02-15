package logic;

import java.util.Scanner;

public class PassFail {
	public static void main(String args[]) {
		System.out.println("Enter the marks");
		Scanner sc = new Scanner (System.in);
		int marks = sc.nextInt();
		
		if(marks < 35) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Pass");
		}
	}
}
