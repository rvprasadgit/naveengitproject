package com.js;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.io.Files;

public class FluentWait {
static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rvpra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver =new ChromeDriver();
		  driver.manage().deleteAllCookies();
	      driver .manage().window().maximize();
	       
	      driver.get("http://demo.guru99.com/V4/");		
	      screenshot("guruwebsite");
	  
	      }
	
	
	public static void screenshot(String filename) throws IOException {
		
	     File srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     
	    
	      

			Fileutils.copyFiles(srcfile, new File("C:\\Users\\rvpra\\OneDrive\\Desktop\\Screenshot\\"+filename+".png"));
		
	}

}
