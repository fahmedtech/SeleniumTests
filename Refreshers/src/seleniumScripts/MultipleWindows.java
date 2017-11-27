package seleniumScripts;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindows {

	static WebDriver driver;
	
	//using TestNG
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://letskodeit.teachable.com/p/practice");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void windowHandles() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"openwindow\"]")).click();
		
		String parentWindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		
		Iterator<String> iter = s1.iterator();
		
		while(iter.hasNext()) {
			String childWindow = iter.next();
			
			if(!parentWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//*[@id=\"search-courses\"]")).sendKeys("hello java");
				
				Thread.sleep(3000);
				
				driver.close(); //getting out of child window
			}
		}
		
		driver.switchTo().window(parentWindow);
		
		System.out.println(driver.getCurrentUrl().toString());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
