package com.simplilearn.first;

public class first {

	public static void main(String args[])
	{
		System.out.println("implicit type casting");
		char a='A';
		int b=a;
		//System.out.println("welcome to the world of java");
		System.out.println(b);
		float c=a;
		System.out.println(c);
		long d=a;
		System.out.println(d);
		double e=a;
		System.out.println(e);
		double x=89.80;
		int y=(int) x;
		System.out.println(y);
		//explicit type casting
		float p=45.0f/7;
		System.out.println("the value of p:"+p);
	}
}
