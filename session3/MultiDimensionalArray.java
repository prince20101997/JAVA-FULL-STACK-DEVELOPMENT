package com.simplilearn.Array;

import java.util.Scanner;
public class MultiDimensionalArray {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int array[][]=new int[3][3];
		for(int row=0;row<3;row++)
		{
			for(int col=0;col<3;col++)
			{
			System.out.println("enter elements");
			array[row][col]=sc.nextInt();
			
			}
		}
		System.out.println("lets print element");
		for(int row=0;row<3;row++)
		{
			for(int col=0;col<3;col++)
			{
			System.out.print(array[row][col]+"\t");
	       }
			System.out.println();		

}
	}
}
