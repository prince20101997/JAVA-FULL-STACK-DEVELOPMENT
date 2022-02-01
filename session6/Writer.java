package com.simplilearn.FileHandling;


	import java.io.FileWriter;
	import java.io.IOException;
	public class Writer {
	    public static void main(String[] args) {
	        try {
	            FileWriter writer = new FileWriter("D:\\Mphasis\\practice\\new.txt", true);
	            writer.write("Hello World");
	            writer.write("\r\n");   // write new line
	            writer.write("Good Bye!");
	            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	 
	    }
	 
	}


