package com.Gradsiren.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Gradsiren.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		
		prop =new Properties();
		FileInputStream fi = null;
		try {
			fi = new FileInputStream("C:\\Users\\rvpra\\OneDrive\\Desktop\\rv\\GradsirenTest\\src\\main\\"
					+ "java\\com\\Gradsiren\\qa\\config\\config.properties");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			prop.load(fi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void intialisation() throws InterruptedException 
	{
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\rvpra\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITLY_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGELOAD_TIMEOUT, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.get(prop.getProperty("url"));
		
		
		}
		
	}

}
