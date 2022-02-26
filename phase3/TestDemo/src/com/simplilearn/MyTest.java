package com.simplilearn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
class MyTest {

	@BeforeEach
	void init()
	{
		System.out.println("Before Each test");
	}
	@Test
	void myTest()
	{
		System.out.println("Test case executed");
	}
	@AfterAll
	static void tearDownAll()
	{
		System.out.println("After All");
	}
	@AfterEach
	void tearDown()
	{
		System.out.println("After Each test");
	}
}