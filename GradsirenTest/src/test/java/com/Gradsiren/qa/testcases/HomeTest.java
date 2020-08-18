package com.Gradsiren.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Gradsiren.qa.base.TestBase;
import com.Gradsiren.qa.pages.HomePage;
import com.Gradsiren.qa.pages.Loginpage;

public class HomeTest extends TestBase{

	HomePage homepage;
	Loginpage loginpage;
	
	public HomeTest() {
		
		super();
	}
		@BeforeMethod
		public void setup() throws InterruptedException {
			
			intialisation();
			homepage = new HomePage();
		}	
			@Test
			public void clickfindjobsbutton() {
				
				homepage.login();
				
			}
			
			@AfterMethod
			public void  teardown() {
				
				driver.quit();
				
			}
		
	}


