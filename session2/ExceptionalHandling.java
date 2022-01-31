package com.simplilearn.ExceptionHandling;

public class ExceptionalHandling {
	
	public int divide()
	{
		return 45/0;
	}
	public void add()
	{
		int a[]=new int[3];
		a[3]=78;
	}
	public void convert()
	{
		String s="prince";
		int num=Integer.parseInt(s);
	}
	
	public static void main(String args[])
	{
	
		ExceptionalHandling obj=new ExceptionalHandling();
		try {
			obj.convert();
			obj.add();
		}
		catch(ArithmeticException e)
		{
	System.out.println("ArithmaticException:"+ e);		
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
	System.out.println("ArithmaticException:"+ e);		
		}
		catch(NumberFormatException e)
		{
	System.out.println("Number format issue:"+ e);		
		}
		catch(Exception e)
		{
	System.out.println("General Exception:"+ e);		
		}
	}

}
