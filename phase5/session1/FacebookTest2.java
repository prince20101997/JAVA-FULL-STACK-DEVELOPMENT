package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest2 {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	WebElement email= driver.findElement(By.id("email"));
	WebElement pass=driver.findElement(By.id("pass"));
	
	email.sendKeys("princepalliwal@gmail.com");
	pass.sendKeys("prince@123");
	
	
	WebElement login=driver.findElement(By.name("login"));
	login.submit();
	
	}

}
