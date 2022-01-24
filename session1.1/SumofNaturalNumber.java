package com.simplilearn.SumOf;
import java.util.Scanner;

public class SumofNaturalNumber {

	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER A NATURAL NUMBER:");
		int n=sc.nextInt();
		int sum=(n*(n+1))/2;
		System.out.println("SUM OF NATURAL NUMBER IS:"+sum);
	}
	
}
