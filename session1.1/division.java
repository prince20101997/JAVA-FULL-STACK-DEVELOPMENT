package com.simplilearn.vote;

import java.util.Scanner;
public class vote {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		if(n1>=70 && n1<=100)
		{
			System.out.println("DISTINCTION");
		}
		else if(n1>=50 && n1<70)
		{
			System.out.println("FIRST DIV");
		}
		
		else if(n1>=35 && n1<49)
		{
			System.out.println("SECOND DIV");
		}
		else if(n1<0 && n1>100)
		{
			System.out.println("FIRST DIV");
		}
		
	}
}
