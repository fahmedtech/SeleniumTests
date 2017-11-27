package pomPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPagePF {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"email\"]") WebElement username;
	@FindBy(how=How.XPATH, using="//*[@id=\"pass\"]") WebElement password;
	@FindBy(how=How.XPATH, using="//input[@value='Log In']") @CacheLookup WebElement loginButton;

	//constructor
	public LoginPagePF(WebDriver driver) {
		this.driver = driver;
	}
	
	public void loginFb(String email, String pass) {
		username.sendKeys(email);
		password.sendKeys(pass);
		loginButton.click();
	}
}
