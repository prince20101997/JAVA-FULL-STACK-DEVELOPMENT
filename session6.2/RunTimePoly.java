package com.simpliearn.oops;

public class RunTimePoly extends Parent{
	void test()
	{
		System.out.println("hello child");
		super.test();
	}
	public static void main(String args[])
	{
		RunTimePoly child=new RunTimePoly();
		child.test();
	}

}
