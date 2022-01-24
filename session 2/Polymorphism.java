package com.simplilearn.Polymorphism;

import java.util.*;

public class Polymorphism {

	public int add(int a,int b)
	{
		return a+b;
	}
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public float add(float a,float b)
	{
		return a+b;
	}
	public float add(float a,float b,float c)
	{
		return a+b+c;
	}
	public double add(double a,double b,double c)
	{
		return a+b+c;
	}
	public static void main(String args[])
	{
		Polymorphism m=new Polymorphism();
		System.out.println(m.add(3,7));
		System.out.println(m.add(3,7,10));
	
		System.out.println(m.add(3.0f,7.0f));
		System.out.println(m.add(2.5,4.7,3.6));
	}
}
