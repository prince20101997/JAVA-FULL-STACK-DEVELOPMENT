package com.ssimplilearn.OddUpto50;

import java.util.*;

public class OddUpto50 {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER:");
	    int n=sc.nextInt();
	    
	    for(int i=1;i<=n;i++)
	    {
	    if(i%2==0)
	    {
	    	continue;
	    }
	    else
	    	
	    {
	    	System.out.print("odd number are:");
	    	System.out.println(i);
	    }
	    }
	}
}
