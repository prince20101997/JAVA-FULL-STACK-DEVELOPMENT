package ExceptionHandling;

public class ExceptionalHandling2 {
	
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
		String s="test";
		int num=Integer.parseInt(s);
	}

	public static void main(String args[])
	{
		ExceptionalHandling2 obj=new ExceptionalHandling2();
		try {
			obj.divide();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmatic exception:"+e);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Arithmatic exception:"+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Arithmatic exception:"+e);
		}
		catch(Exception e)
		{
			System.out.println("general exception");
		}
	}
}
