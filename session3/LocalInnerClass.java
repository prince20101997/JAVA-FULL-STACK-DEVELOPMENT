package com.InnerClass;

public class LocalInnerClass {

	void Validate(int age)
	{
		if(age>=18)
		{
			class Inner{
				void test()
				{
					System.out.println("now authenticate using aadhar");
					
				}
			}
			Inner inner=new Inner();
			inner.test();
		}
		else
		{
			System.out.println("not able to vote");
		}
	}
	public static void main(String args[])
	{
		LocalInnerClass local=new LocalInnerClass();
		local.Validate(45);
	}
}
