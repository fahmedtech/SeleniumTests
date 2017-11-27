package locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", 
				   "C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://letskodeit.teachable.com/p/practice");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//implementation of the new code -- works when you open a new tab or window
		String parentHandle = driver.getWindowHandle();
		
		WebElement ele = driver.findElement(By.xpath(".//*[@id='openwindow']"));
		ele.click();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		int count = allWindows.size();
		System.out.println("count Value: " + count);
		
		for(String childWindow : allWindows) {
			if(!parentHandle.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				
				driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div[2]/div/div[1]/a/div/div[2]")).click();
				
				Thread.sleep(3000);
				driver.close();
			}
		}
		Thread.sleep(5000);
		
		driver.switchTo().window(parentHandle);
		driver.quit();
	}
}