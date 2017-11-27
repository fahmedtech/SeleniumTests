package seleniumScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScrollJavascript {

	//using TestNG 
	static WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.fb.com");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void scrollPageDown() throws InterruptedException {
		//scroll(horizontal, vertical)
		((JavascriptExecutor) driver).executeScript("scroll(0,400)");
		
		Thread.sleep(3000);
		
		((JavascriptExecutor) driver).executeScript("scroll(400,0)");
	}
}
