package com.InnerClass;

public class Annoympus {
	public static void main(String args[])
	{
		Car c=new Car()
				{
			public void stop()
			{
				System.out.println("stop");
			}
			public void start()
			{
			
					System.out.println("start");
				
			}
				};
				c.start();
				c.stop();
	}

}
