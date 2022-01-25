package com.simplilearn.Array;

import java.util.Scanner;

public class Array {

	public static void main(String args[])
	{
		int array[]= {11,12,23,34,4,565,757};
		System.out.println("access element"+array[3]);
		
		//print all ele
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		//another method to declare array
		int a[]=new int[5];
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter your rollno");
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
	}
}
}
