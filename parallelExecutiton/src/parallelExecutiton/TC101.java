package parallelExecutiton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC101 {

	WebDriver driver;
	
	@Test
	public void openFF() throws Exception {
		driver.navigate().to("http://183.82.125.5/nareshit/login.php");
		Reporter.log("Opened HRMS application in Firefox Browser");
		Thread.sleep(5000);
	}
	
	@Parameters({"browser"})
	@BeforeMethod
	public void setUp(String browser) {
		if(browser.equals("Firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browser.equals("IE")) {
			driver=new InternetExplorerDriver();
		}
		else if(browser.equals("Chrome")) {
			driver=new ChromeDriver();
		}
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
