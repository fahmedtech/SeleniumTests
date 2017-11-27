package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrames {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", 
				   "C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://letskodeit.teachable.com/p/practice");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//checking total number of iframes on sites
		int framesCount = driver.findElements(By.tagName("iframe")).size();
		System.out.println(framesCount);
		
		//switching to the frame - inspect element through firebug
		driver.switchTo().frame("courses-iframe"); //ID
		
		//performing action on the frame
		WebElement inputSearch = driver.findElement(By.id("search-courses"));
		inputSearch.sendKeys("Java Selenium Tutorials");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//*[@id='search-course-button']")).click();
	
		//switching back to the main page and closing browser
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		driver.quit();
	
	}	
}