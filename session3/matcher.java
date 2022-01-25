package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class matcher {


	public static void main(String args[]) {
			
			String pattern="[A-Za-z0-9]{6}";
		Pattern p=Pattern.compile(pattern);
		
		Matcher match=p.matcher("sonam1");
		System.out.println(match.matches());
		
		String pattern1="[789]{1}[0-9]{9}";
	Pattern p1=Pattern.compile(pattern);
		
		Matcher match1=p1.matcher("60229934");
		System.out.println(match1.matches());
	}

	}

