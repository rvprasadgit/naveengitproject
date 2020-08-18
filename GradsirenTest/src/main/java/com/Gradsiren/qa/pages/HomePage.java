package com.Gradsiren.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Gradsiren.qa.base.TestBase;

public class HomePage extends TestBase{

	@FindBy (xpath="//div[@class='d-none d-lg-block jobseekerLoginFocus ng-star-inserted']"
			+ "//span[contains(text(),'LOG IN')]")
	WebElement loginbtn;
	@FindBy(xpath="//div[@class='gradSignup d-none d-lg-block ng-star-inserted']//span[contains(text(),'SIGN UP')]")
	WebElement signupbtn;
	@FindBy (className ="btn btn-gradsuccess btn-block ng-star-inserted")
	WebElement Findjobsbtn;
	
	//Initializing page objects
	public HomePage() 
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public Loginpage login() {
		//loginbtn.click();
		Findjobsbtn.click();
		return login();
		
		
		
		
	}
	
	
}
