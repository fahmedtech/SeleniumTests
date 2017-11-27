package locators;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUps {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", 
				   "C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//code implementation
		WebElement popLink = driver.findElement(By.linkText("Come & Go Test"));
		popLink.click();
		
		String mainWindow = driver.getWindowHandle();
		
		//all popup windows
		Set<String> windowsHandle = driver.getWindowHandles();
		int setSize = windowsHandle.size();
			
		for(String x : windowsHandle) {
			if(!mainWindow.equalsIgnoreCase(x)) {
				driver.switchTo().window(x);
				
				Thread.sleep(3000);
				driver.close();
			}
		}
			
		//switching to the main window and clicking back link
		driver.switchTo().window(mainWindow);
		
		driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td/form/input")).click();
		
		Thread.sleep(3000);
		
		//switching back to the main window and closing the browser
		driver.switchTo().window(mainWindow);
		
		driver.quit();
		
	}//end of main method
}//end of class