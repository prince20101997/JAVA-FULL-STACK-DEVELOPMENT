package com.InnerClass;

public class MethodLocalInnerClass {
	public void Display()
	{
		class Inner
		{
			void MyMethod()
			{
				System.out.println("method local inner class");
				
			}
		}
		Inner inner =new Inner();
		inner.MyMethod();
	}
	public static void main(String args[])
	{
		MethodLocalInnerClass mlic=new MethodLocalInnerClass();
		
		mlic.Display();
	}

}
