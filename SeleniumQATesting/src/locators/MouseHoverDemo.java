package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", 
				   "C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.capitalone.com");
		
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath(".//*[@id='personal-nav']/div/div/ul[2]/li[1]/ul/li[3]/a"));
		
		//creating Actions Interface
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		//ele.click();
		
		Thread.sleep(3000);
		
		WebElement subEle = driver.findElement(By.xpath(".//*[@id='personal-nav']/div/div/ul[2]/li[1]/ul/li[3]/div/div[1]/div/ul/li[3]/a"));
		
		//creating the second Actions Interface
		Actions act2 = new Actions(driver);
		act2.moveToElement(subEle).build().perform();
		subEle.click();
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}//end of class