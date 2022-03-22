package com.selenium.session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	
	WebElement button3=driver.findElement(By.name("promptalertbox12"));
	
	button3.click();
	driver.switchTo().alert().sendKeys("Yes");
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	}
}
