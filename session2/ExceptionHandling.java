package ExceptionHandling;

public class ExceptionHandling {
	
	public static void main(String args[])
	{
		int sum=0;
		for(int i=0;i<args.length;i++)
		{
			try {
			sum=sum+ Integer.parseInt(args[i]);
		}
			catch(NumberFormatException e)
			{
		
		System.out.println("error occur"+args[i] + "cant change to int");
	}

}
		System.out.println("sum is :"+sum);
	}
	}
