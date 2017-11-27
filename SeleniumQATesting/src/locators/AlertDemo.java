package locators;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	
	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver", 
				   "C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/delete_customer.php");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//operations on the website
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		
		//focusing on the Alert
		Alert aleEle = driver.switchTo().alert();
		
		System.out.println(aleEle.getText());
		Thread.sleep(3000);
		
		aleEle.accept();
		
		//close the other alert - right away
		/*usually we check for Alerts through boolean method
		  such as isAlertPresent() and return true or false with the 
		  try and catch block with NoAlertPresentException */
		Alert aleEle2 = driver.switchTo().alert();
		System.out.println(aleEle2.getText());
		aleEle2.dismiss();
		
		/*
		//creating window handle to switchto and close browser
		String windowHandle = driver.getWindowHandle();
		driver.switchTo().window(windowHandle);*/
		
		driver.quit();
	}

}
