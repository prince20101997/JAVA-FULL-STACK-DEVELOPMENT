package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookTest3 {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		
List<WebElement> list= driver.findElements(By.tagName("input"));
		
		for(WebElement w:list)
		{
			System.out.println(w.getAttribute("name"));
		}
	}
}
