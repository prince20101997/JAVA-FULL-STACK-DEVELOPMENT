package com.simplilearn.Calculator;

import java.util.Scanner;

public class Calculator {
	public static void main(String args[])
	{
		char operator;
		Double n1,n2;
		Double  sum,difference,product,division;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("choose an operator:");
		operator=sc.next().charAt(0);
		
		System.out.println("enter first number:");
		 n1=sc.nextDouble();
		
		System.out.println("enter second number");
	   n2=sc.nextDouble();
		switch(operator) {
		case '+':
			sum=n1 + n2;
			System.out.println("sum is:"+sum);
			break;
			
		case '-':
			difference=n1 - n2;
			System.out.println("differene is:"+difference);
			break;
			
		case '*':
			product=n1 * n2;
			System.out.println("product is:"+product);
			break;
			
		case '/':
			division=n1/n2;
			System.out.println("division is:"+(division));
			break;
			
			default:
				System.out.println("invalid operation");
				
				
		}
		
	}

}
