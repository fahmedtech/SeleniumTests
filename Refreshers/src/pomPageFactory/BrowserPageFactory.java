package pomPageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserPageFactory {

	static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName, String urlString) {
		
		if(browserName.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", 
					   "C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\geckodriver.exe");
			
			driver = new FirefoxDriver();
		}
		
		else if(browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", 
					   "C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");
			
			driver = new ChromeDriver();
		}
		
		driver.get(urlString);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
	
}
