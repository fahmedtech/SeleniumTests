package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingWindow {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", 
				   "C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://letskodeit.teachable.com/p/practice");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//scrolling down on the window
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		jse.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,250)", "");
		
		Thread.sleep(3000);

		//scrolling up on the window
		jse.executeScript("scroll(0,-250)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollTo(0, document.body.scrollTop)");
				
		driver.quit();
	}
	
}
