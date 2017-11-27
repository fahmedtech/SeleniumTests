package pomPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestVerifyLogin {

	/*Using TestNG to test*/
	
	@Test
	public void checkValidUser() {
		
		WebDriver driver = BrowserPageFactory.startBrowser("chrome", "https://www.fb.com/");
		
		LoginPagePF loginPageObj = PageFactory.initElements(driver, LoginPagePF.class);
		
		loginPageObj.loginFb("abc987@hotmail.com", "123456");
		
	}
	
}
