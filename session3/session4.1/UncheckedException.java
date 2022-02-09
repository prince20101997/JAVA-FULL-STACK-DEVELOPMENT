package com.simplilearn.exception;
import java.util.Scanner;

public class UncheckedException {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int result=n1/n2;
		System.out.println(result);
	}
}
