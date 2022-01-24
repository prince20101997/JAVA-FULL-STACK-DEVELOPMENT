package com.ArrayList;
import java.util.*;

public class ClassList {
	public static void main(String args[])
	{
		LinkedList<Integer> list=new LinkedList<Integer>();

		list.add(12);
		list.add(122);
		list.add(124);
		System.out.println("Size "+list.size());
		list.add(67);
		System.out.println("Size "+list.size());
		list.add(2,78);
		System.out.println(list);
		list.removeFirst();
		list.removeLast();
	}

}
