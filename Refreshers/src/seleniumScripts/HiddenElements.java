package seleniumScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HiddenElements {

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
		
		((JavascriptExecutor) driver).executeScript("scroll(0,500)");
		Thread.sleep(3000);
	}
	
	@Test
	public void hiddenElement() throws InterruptedException {
		driver.findElement(By.id("hide-textbox")).click();
		
		int x = driver.findElement(By.xpath("//*[@id=\"displayed-text\"]")).getLocation().getX();
		int y = driver.findElement(By.xpath("//*[@id=\"displayed-text\"]")).getLocation().getY();
		
		System.out.println("("+ x + "," + y + ")");
		
		if(x!=0) {
			driver.findElement(By.xpath("//*[@id=\"displayed-text\"]")).sendKeys("YaYY!");
		}
		else {
			driver.findElement(By.xpath("//*[@id=\"show-textbox\"]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"displayed-text\"]")).sendKeys("YaYY!");
		}
	}
}

