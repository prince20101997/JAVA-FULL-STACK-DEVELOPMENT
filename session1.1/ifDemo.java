package com.simplilearn.conditional;

import java.util.Scanner;
public class ifDemo {
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		if(num1>num2)
		{
			System.out.println("FIRST IS LARGER");
		}
		else
			System.out.println("SECOND IS LARGE");
	}
}
