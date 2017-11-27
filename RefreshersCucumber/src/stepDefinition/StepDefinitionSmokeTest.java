package stepDefinition;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionSmokeTest {
	
	WebDriver driver;
	
	@Given("^Open chrome/firefox and start application$")
	public void Open_chrome_firefox_and_start_application() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.fb.com");
	}

	@When("^I enter valid user and valid password$")
	public void I_enter_valid_user_and_valid_password() throws Throwable {

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abczara@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("password");
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}

	@Then("^have access to his/her account$")
	public void have_access_to_his_her_account() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}

}
