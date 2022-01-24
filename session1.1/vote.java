package com.simplilearn.vote;

import java.util.Scanner;
public class vote {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("YOU ARE ELIGIBLE FOR VOTE");
		}
		else
		{
			System.out.println("YOU ARE NOT ELIGIBLE FOR VOTE");	
		}
	}
}
