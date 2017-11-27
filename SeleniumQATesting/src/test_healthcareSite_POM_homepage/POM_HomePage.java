package test_healthcareSite_POM_homepage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import test_healthcareSite_page.HomePage;

public class POM_HomePage {
	
  /*PAGE OBJECT MODEL*/
	
	//variables
	WebDriver driver;
	
  @Test (priority = 0, enabled = true)
  public void testPrimaryCare() {
	  HomePage.primaryCare(driver);
	  HomePage.primaryCareClick(driver);
  }
  
}
