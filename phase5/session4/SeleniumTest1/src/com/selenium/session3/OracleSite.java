package com.selenium.session3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OracleSite {

	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		
		WebElement email=driver.findElement(By.id("email"));
		WebElement pass=driver.findElement(By.id("pass"));
		WebElement ReTypePass=driver.findElement(By.id("ReTypePass"));
		WebElement Country=driver.findElement(By.id("Country"));
		WebElement FirstName=driver.findElement(By.id("First Name"));
		WebElement LastName=driver.findElement(By.id("Last Name"));
		
		WebElement JobTitle=driver.findElement(By.id("JobTitle"));
		WebElement WorkPhone=driver.findElement(By.id("WorkPhone"));
		WebElement CompanyName=driver.findElement(By.id("Company Name"));
		WebElement Address=driver.findElement(By.id("address"));
		WebElement City=driver.findElement(By.id("City"));
		WebElement State=driver.findElement(By.id("State"));
		WebElement PostalCode=driver.findElement(By.id("PostalCode"));
		
		//WebElement email=driver.findElement(By.id("email"));
		
	email.sendKeys("prince@gmail.com");
	pass.sendKeys("Singer890@123");
	ReTypePass.sendKeys("Singer890@123");
	WebElement login=driver.findElement(By.name("login"));
	login.submit();
	 
	 
	 }
}
