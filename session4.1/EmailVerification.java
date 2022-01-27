package com.EmailVerification;
import java.util.regex.*;
import java.util.*;

public class EmailVerification {

	public static void main(String args[])
	{
		ArrayList<String>  emails=new ArrayList<String>();
		emails.add("abhishek567@gmail.com");
		emails.add("naveenkumar1223@gmail.com");
		emails.add("princekumar2010@gmail.com");
		emails.add("vijaypal@gmail.com");
		emails.add("RajaTpoint@domain.com");
		emails.add("visakdddd@gmail.com");
		emails.add("rohitbasu@gmail.com");
		emails.add("viratkohli@gmail.com");
		
		String regex="^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern=Pattern.compile(regex);
		
		for(String email:emails)
		{
			Matcher matcher=pattern.matcher(email);
			System.out.println(email + ":" + matcher.matches()+"\n");
		}
	}
}
