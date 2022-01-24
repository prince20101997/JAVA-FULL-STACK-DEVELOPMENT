package com.ArrayList;
import java.util.*;
public class VectorClass {
	public static void main(String args[])
	{
		
	Vector<String> vector=new Vector<String>();
	vector.add("apple");
	vector.add("banana");
	vector.add("kiwi");
	System.out.println(vector.get(2));
	System.out.println("Size:"+vector.size());
	System.out.println(vector);
}
}
