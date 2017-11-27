package pomWOpagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*This class will store all locators and methods of login page*/
/*Usually pages are in separate packages*/

public class FbLoginPage {

	WebDriver driver;
	
	By username = By.id("email");
	By password = By.xpath("//*[@id=\"pass\"]");
	By loginButton = By.xpath("//input[@value='Log In']");
	
	//constructor
	public FbLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//methods
	public void enterUsername() {
		driver.findElement(username).sendKeys("xyz@gmail.com");
	}
	
	//overloading method enterUsername()
	public void enterUsername(String email) {
		driver.findElement(username).sendKeys(email);
	}
	
	public void enterPassword() {
		driver.findElement(password).sendKeys("123456");
	}
	
	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}
	
}
