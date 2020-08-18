package projpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\rvpra\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://www.rediff.com/");
		
		dr.findElement(By.xpath("//a[@class='signin']")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//input[@name='proceed']")).click();
		
		org.openqa.selenium.Alert pop=dr.switchTo().alert();
		String text=pop.getText();
		
		pop.accept();
		
		System.out.println(text);
		if(text.equals("Please enter a valid user name")) 
		{
			
			 System.out.println("TC-PASSED");
		}else
			System.out.println("TC-FAILED");
	}

}
