package ascen.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AscenHomePage {

public static WebElement element = null;
	
	public static WebElement goToAscenOrg (WebDriver driver){
		element = driver.findElement(By.xpath("html/body/header/nav[1]/ul[1]/li/a"));
		return element;
	}
	
	public static WebElement billPay (WebDriver driver){
		element = driver.findElement(By.xpath("html/body/header/nav[1]/ul[2]/li[1]/a"));
		return element;
	}
	
	public static WebElement patientResources (WebDriver driver){
		element = driver.findElement(By.xpath("html/body/header/nav[1]/ul[2]/li[2]/a"));
		return element;
	}
	
	public static WebElement appointment (WebDriver driver){
		element = driver.findElement(By.xpath("html/body/header/nav[1]/ul[2]/li[3]/a"));
		return element;
	}
	
	public static WebElement contact (WebDriver driver){
		element = driver.findElement(By.xpath("html/body/header/nav[1]/ul[2]/li[4]/a"));
		return element;
	}
	
	public static void navBack (WebDriver driver){
		driver.navigate().back();
	}
	
	public static void navForward (WebDriver driver){
		driver.navigate().forward();
	}
	
}
