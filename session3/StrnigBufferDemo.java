package com.simplilearn.String;

public class StrnigBufferDemo {
	public static void main(String args[])
	{
	StringBuffer str= new StringBuffer("Hello World");	
		
		
		System.out.println(str.charAt(4));
		System.out.println(str.length());
		
		System.out.println(str.replace(0,5,"welcome"));
		System.out.println(str.reverse());
	}
	}

