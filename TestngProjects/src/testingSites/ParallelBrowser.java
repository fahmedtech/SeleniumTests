package testingSites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelBrowser {

	//variables
	WebDriver driver;
	
	@Test
	@Parameters ("browsers")
	public void verifyTitle(String browserName) throws Exception {

		if(browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", 
					   "C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");
			
			driver = new ChromeDriver();
		}
		
		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", 
					   "C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\geckodriver.exe");
			
			driver = new FirefoxDriver();
		}
		
		//getting the title from the FaceBook website
		driver.get("https://www.fb.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}//end of verifyTitle()
	
}//end of Class
