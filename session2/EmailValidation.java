package com.simplilearn.EmailValidation;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class EmailValidation {
	public static boolean isValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
                              
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
  
    public static void main(String[] args)
    {
        ArrayList<String> address = new ArrayList<>();
            
          address.add("richardswilliam@gmail.com");
          address.add("raudread123@gmail.com");
          address.add("pk.paliwal@gmail.com");
          address.add("newemailid@gmail.com");
          address.add("princepk@gmail.com");
          address.add("simplilearn@gmail.com");
          address.add("companyemail@gmail.com");
            
        for(String i : address){
            if (isValid(i))
                System.out.println(i + " - Yes");
            else
                System.out.println(i + " - No");
        }
    }

}
