package com.polym;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class file {

	public static void main(String[] args) {
     
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rvpra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver =new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  
		  driver.get("http://tinyupload.com/");

	driver.findElement(By.name("uploaded_file")).sendKeys("C:\\Users\\rvpra\\Downloads\\Renuka Vara Prasad _ CV_ Automation Test Associate..pdf");
	
		  
	}

}
