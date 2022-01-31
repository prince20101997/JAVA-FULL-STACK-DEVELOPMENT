package ExceptionHandling;

public class ExceptionalHandling1 {
	public static void divide()
	{
		try {
			int result=45/0;
			
		} catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String args[])
	{
		divide();
	}

}
