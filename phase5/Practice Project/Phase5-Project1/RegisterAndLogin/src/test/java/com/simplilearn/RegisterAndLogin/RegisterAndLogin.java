package com.simplilearn.RegisterAndLogin;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class RegisterAndLogin {
	WebDriver driver=null;
  
  @BeforeMethod
  public void beforeMethod() {
	 
		  System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver_win32\\chromedriver.exe");
	      driver = new ChromeDriver();
	      
	  
  }

  @AfterMethod
  public void afterMethod() {
  }
  @Test
 public void login() {
	  
      
	  driver.get("https://demo.wpjobmanager.com/my-account/");
	  driver.findElement(By.id("reg_email")).sendKeys("princekumar201019@gmail.com");
	  driver.findElement(By.id("reg_password")).sendKeys("Prince890@123");
	  driver.findElement(By.name("register")).click();
	  driver.findElement(By.xpath("//*[@id=\"post-65\"]/div/div/div/p[1]/a")).click();
	  //Login
	  driver.findElement(By.id("username")).sendKeys("princekumar201019@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("Prince890@123");
	  driver.findElement(By.name("login")).click();
	  }
	  }