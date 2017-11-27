package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByID {

	//private variables
	private static WebDriver driver;

	//MAIN METHOD
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				   "C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.fb.com/");
	
		//--maximizing the window of the browser
		driver.manage().window().maximize();
	
		//--specifying the implicit wait time for the code execution
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//--specifying the explicit wait time 3sec(s) for the code execution || throws InterruptedException
		Thread.sleep(3000);
		
		/*FINDING ELEMENTS BY ID*/
		
		/*
		//--used Firebug to find the element id on FireFox browser || Email Field
		driver.findElement(By.id("email")).sendKeys("test-faze@fakeEmail.com");
		Thread.sleep(3000);
		
		//--used Firebug to find the element id on FireFox browser || Password Field
		driver.findElement(By.id("pass")).sendKeys("TESTPASS");
		Thread.sleep(3000);

		//--used Firebug to find the element id on FireFox browsers || Login Button
		driver.findElement(By.id("u_0_0")).click();
		Thread.sleep(3000);
		*/
		
		/*FINDING ELEMENTS BY XPATH*/
		/*driver.findElement(By.xpath("//*[@id='email']")).sendKeys("test-faze@fakeEmail2.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("TESTPASS2");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='u_0_0']")).click();
		Thread.sleep(3000);*/
		
		/*FINDING ELEMENTS BY LINKTEXT*/
		/*driver.findElement(By.linkText("Log In")).click();
		Thread.sleep(3000);*/
		
		/*FINDING ELEMENTS BY PARTIAL LINK*/
		driver.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(3000);
		
		WebElement fblogIn = driver.findElement(By.partialLinkText("Log"));
		fblogIn.click();	
	}
}
