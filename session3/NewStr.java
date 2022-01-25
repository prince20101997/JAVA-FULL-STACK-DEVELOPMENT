package session3;

import java.util.*;
public class NewStr {
	
	public static void main(String args[])
	{
		String s= new String("Hello world");
		System.out.println(s.length());
		System.out.println(s.charAt(4));
		System.out.println(s.startsWith("Hello"));
		System.out.println(s.length());
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your passwoed");
		String pwd=sc.nextLine();
		if(s.equalsIgnoreCase(pwd))
		
			System.out.println("authenticated");

		else
			System.out.println("incorrect password");


	}

}
