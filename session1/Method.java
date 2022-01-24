package com.simplilearn.Method;

import java.util.*;

public class Method {
	
	public void display()
	{
		System.out.println("welcome");
		
	}
	
	public int add(int a,int b)
	{
		int num1=a+b;
		int num2=a*b;
		return num1+num2;
	}
	public boolean valid(int age)
	{
		if(age>18)
		return true;
		else
			return false;
	}
	public String fullName(String fname,String lname)
	{
		return fname+ " "+lname;
	}
public static void main(String args[])
{
	Method s=new Method();
	s.display();
	int result=s.add(2, 4);
	System.out.println(result);
	System.out.println(s.valid(67));
	System.out.println(s.fullName("prince","kumar"));
	
	
}
}
