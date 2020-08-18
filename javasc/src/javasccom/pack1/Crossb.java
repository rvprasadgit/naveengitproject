package javasccom.pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossb {
      WebDriver driver;
	@Test
	@Parameters("browser")

		public void Crb(String ibr) {
		if(ibr.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rvpra\\Downloads"
					+ "\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();
			
			}
		   driver.get("https://www.facebook.com/");

			
			
		}
}


