package com.simplilearn.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class cwh_111_file {
public static void main(String args[])
{
	File myFile=new File("C:\\mphpractice");
	try {
		myFile.createNewFile();
	}
	catch(IOException e)
	{
		System.out.println("unable to create this file");
		e.printStackTrace();
	}
	//code to write to a file
	try {
	FileWriter fileWriter=new FileWriter("C:\\mphpractice");
	fileWriter.write("this is my first file from this java handling");
	fileWriter.close();
	}catch(IOException e)
	{
		e.printStackTrace();
	}
	
	
}
}
