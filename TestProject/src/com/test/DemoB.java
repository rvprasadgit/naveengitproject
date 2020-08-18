package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB 
{

	
	@Test
	public void run() 
	
	{
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rvpra\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Reporter.log("the browser is opened now");
	driver.manage().window().maximize();
	Reporter.log("the browser is maximized");
	driver.get("https://www.google.co.in");
	Reporter.log("the google website is opened");
	driver.findElement(By.name("q")).sendKeys("Bye");
	Reporter.log("The data \"HI\"is Entered");
		
		
		
	}
}
