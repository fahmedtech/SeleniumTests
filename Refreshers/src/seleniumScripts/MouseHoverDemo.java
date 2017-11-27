package seleniumScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseHoverDemo {

	static WebDriver driver;
	
	//Using TestNG

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.capitalone.com");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void actionsMouse() throws InterruptedException {
		
		WebElement mouseHoverButton = driver.findElement(By.xpath("//a[@href='https://www.capitalone.com/credit-cards/' and text()='Credit Cards']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(mouseHoverButton).build().perform();
		
		Thread.sleep(5000);
		
		//going over the Mouse hover contents
		WebElement compareCardsLink = driver.findElement(By.xpath("//*[@id=\"personal-nav\"]/div[1]/div/ul[2]/li[1]/ul/li[2]/div/div[1]/div/ul/li[3]/a"));
		
		compareCardsLink.click();
		
		Thread.sleep(4000);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
