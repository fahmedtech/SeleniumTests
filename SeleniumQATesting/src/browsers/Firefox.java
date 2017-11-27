package browsers;

//importing for Firefox & Chrome jar files
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	//MAIN METHOD
	public static void main(String[] args) {

		/*
		//F I R E F O X BROWSER
		System.setProperty("webdriver.gecko.driver", 
						   "C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		*/

		//C H R O M E BROWSER
		System.setProperty("webdriver.chrome.driver", 
				   "C:\\Users\\sadaf\\OneDrive\\Documents\\qa_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

}
