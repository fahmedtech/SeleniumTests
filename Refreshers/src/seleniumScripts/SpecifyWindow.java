package seleniumScripts;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecifyWindow {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");
	
		driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/");
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//implementation
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/font[3]/b/a")).click();
		
		String parent = driver.getWindowHandle();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		ArrayList<String> multiTabs = new ArrayList<>(allWindows);
		
		//parent window - multiTabs.get(0); 
		//second window - multiTabs.get(1);
		
		driver.switchTo().window(multiTabs.get(1));
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.close();
		
		//on parent window
		driver.switchTo().window(parent);
		
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/input")).click();
		Thread.sleep(3000);
		
		System.out.println(allWindows.size());
		
		driver.quit();
	}

}
