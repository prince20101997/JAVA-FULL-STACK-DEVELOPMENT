package com.InnerClass;

public class InnerClaa {
	private int a=10;
	class Inner
	{
		void Display()
		{
			System.out.println("welcome");
			System.out.println("value of"+a);
		}
	}
	
public static void main(String args[])
{
	InnerClaa outer=new InnerClaa();
	InnerClaa.Inner inner =outer.new Inner();
	
	inner.Display();
}
}
