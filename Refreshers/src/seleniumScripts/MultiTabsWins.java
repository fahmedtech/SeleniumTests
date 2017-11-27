package seleniumScripts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiTabsWins {

	static WebDriver driver; 
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://letskodeit.teachable.com/p/practice");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		//implementation
		String parent = driver.getWindowHandle();
		
		//opening new tab
		driver.findElement(By.xpath("//*[@id=\"opentab\"]")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		int countWindows = allWindows.size();
		System.out.println("Total Windows "+ countWindows);
		
		//switching to child - 
		//fact - very useful code in closing pop-ups
		for(String child: allWindows) {
			if(!parent.equalsIgnoreCase(child)) {
				
				driver.switchTo().window(child);
				driver.findElement(By.xpath("//*[@id=\"search-courses\"]")).sendKeys("hello child tab");
				
				Thread.sleep(3000);
				
				driver.close();
			}
		}
		
		driver.switchTo().window(parent);
		
	}

}
