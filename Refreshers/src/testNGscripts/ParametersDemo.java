package testNGscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {

	/*Cross Browser Testing
	  after writing complete code
	  right click on class file and go to TestNG
	  and click "Convert to TestNG" to get xml file
	 */
	
	WebDriver driver;
	
	@Test 
	@Parameters("browser")
	public void openBrowser(String browserName) {
		
		if(browserName.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", 
					   "C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\geckodriver.exe");
			
			driver = new FirefoxDriver();
		}
		
		else if(browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", 
					   "C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");
			
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.fb.com");
		
		System.out.println("Website Title: " + driver.getTitle().toString());
		
		driver.quit();
	}
	
}
