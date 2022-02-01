package com.sl.Inheritance;

public interface Second {

	default void show()
	{
		System.out.println("Default method of second");
	}
}
