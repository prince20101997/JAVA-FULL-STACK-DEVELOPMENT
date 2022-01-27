package com.simplilearn.exception;
import java.util.Scanner;
public class Unchecked2 {
	
	public static void main(String args[])
	{
		String name=null;
		if(name.equals("admin"))
				{
					System.out.println("valid user");
				
				}
		else
		{
			System.out.println("invalid user");
		}
	}

}
