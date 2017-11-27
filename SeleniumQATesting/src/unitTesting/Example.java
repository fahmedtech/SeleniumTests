package unitTesting;

//Control + Shift + O -- to remove unwanted libraries

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example {

	//initializing the public variable
	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", 
				   "C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.fb.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
	}

	@Test
	public void test() throws InterruptedException{
		//fail("Not yet implemented");
		/*driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Faizan Ahmed");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Password");
		driver.findElement(By.xpath("//*[@id='u_0_2']")).click();*/
		
		String x = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div/div[2]/h2")).getText();
		System.out.println(x);
		
		//working with dropdowns
		WebElement dropElem = driver.findElement(By.xpath(".//*[@id='month']"));
		Select s1 = new Select(dropElem);
		s1.selectByVisibleText("Nov");
			
		List<WebElement> monthList = s1.getOptions();
		
		for(WebElement we : monthList) {
			System.out.print(we.getText() + " ");
		}
		
		Thread.sleep(3000);
		
		//selecting dropdown values with index and value
		s1.selectByValue("6"); //Jun
		Thread.sleep(3000);
		s1.selectByIndex(12); //Dec		
		Thread.sleep(3000);
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}