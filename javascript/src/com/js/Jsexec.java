package com.js;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Jsexec {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rvpra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver =new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  //Creating the JavascriptExecutor interface object by Type casting		
	        JavascriptExecutor js = (JavascriptExecutor)driver;		
	        		
	        //Launching the Site.		
	       
	        driver.get("http://demo.guru99.com/V4/");			
	        		
	     //   driver.findElement(By.name("uid")).sendKeys(Keys.F5);
	        
	     // String ele=  driver.findElement(By.name("uid")).getAttribute("name");
	    //  System.out.println(ele);
	      driver.manage().deleteAllCookies();
	      driver .manage().window().maximize();
	    //  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	      
	      
	      WebDriverWait wait =new WebDriverWait(driver, 5);
	      wait.until(ExpectedConditions.elementToBeClickable(By.name("uid")));
	        		
	        //Login to Guru99 		
	       driver.findElement(By.name("uid")).sendKeys("mngr34926");
	      
	        //driver.findElement(By.name("password")).sendKeys("amUpenu");	
	        //WebElement button =driver.findElement(By.name("btnLogin"));
	        		
	        //Perform Click on LOGIN button using JavascriptExecutor		
	     //  js.executeScript("arguments[0].click();", button);
	                                
	        //To generate Alert window using JavascriptExecutor. Display the alert message 			
	      
	       driver.quit();
	}

}
