package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Loginpage extends TestBase

{    //page factory - OR (Object Repository)
     @FindBy(xpath="//input[@name='email']")
     WebElement username;
     
     @FindBy(xpath="//input[@id='pass']")
     WebElement password;
     
     @FindBy(xpath="//input[@id='u_0_b']")
	 WebElement loginbtn;
     
		
     @FindBy(xpath="//a[contains(text(),'Sign Up')]")
     WebElement signupbtn;
		  
     @FindBy(xpath="//a[@class='navbar-brand']//img[@class='img-responsive']")
	 WebElement crmlogo;
		 
     
    
     
     //Initializing the page objects:
     
     public Loginpage(){
    	 PageFactory.initElements(driver,this);
    	 
     }
	// Actions:
     public String validateloginpagetitle()  {
    	
    	 return driver.getTitle();
    	 
     }
    public HomePage login(String un , String pwd)  {
    
    	username.sendKeys(un);
    	password.sendKeys(pwd);
    	loginbtn.click();
    	return new HomePage();
    }
	
	
}
