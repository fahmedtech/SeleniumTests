package testNGscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//code implementation - for class level Listeners - uncomment next line for results
//@Listeners(testNGscripts.ITestListenerDemo.class)

/*
 For suite level Listener - which is recommended
 we create the xml file for this class
 */

public class ITestListenerDemoCase {
	
	@Test
	public void googleTileVerify() {
		
		System.setProperty("webdriver.chrome.driver", 
				   "C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		System.out.println("Title: " + driver.getTitle());
		
		driver.quit();
	}
}
