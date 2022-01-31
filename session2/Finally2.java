package com.simplilearn.ExceptionHandling;

import java.util.Scanner;
public class Finally2 {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
	try {
		System.out.println("enter number");
		String value=sc.nextLine();
		int num=Integer.parseInt(value);
		System.out.println("enter name");
		String name=sc.nextLine();
		
		System.out.println("Id: "+num+"Name: "+name);
	}
	catch(NumberFormatException e)
	{
		System.out.println(e);
	}
	finally
	{
		sc.close();
		System.out.println("Scanner closed");
	}
		
	}

}
