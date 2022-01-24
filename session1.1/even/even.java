package com.simplilearn.even;
import java.util.Scanner;
public class even {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		//int n2=sc.nextInt();
		if(n1%2==0)
		{
			System.out.println("NUMBER IS EVEN");
		}
		else
			
			System.out.println("NUMBER IS odd");
	}
	
}
