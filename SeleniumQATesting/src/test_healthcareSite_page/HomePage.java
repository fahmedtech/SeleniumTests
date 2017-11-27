package test_healthcareSite_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	//variables
	public static WebElement element = null;
	
	//methods
	public static WebElement primaryCare (WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/header/nav[2]/ul/li[1]/button"));
		return element;
	}
	
	public static void primaryCareClick (WebDriver driver) {
		element = primaryCare(driver);
		element.click();
	}
	
	//or
	public static void primaryCareClick2 (WebDriver driver) {
		element = driver.findElement(By.xpath(""));
		element.click();
	}
	
}
