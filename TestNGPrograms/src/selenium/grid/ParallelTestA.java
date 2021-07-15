package selenium.grid;

import java.net.MalformedURLException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTestA {
	
	public static RemoteWebDriver driver;
	public static String appURL = "http://www.google.com";
	
	@BeforeClass
	@Parameters({ "browser" })
	public void setUp(String browser) throws MalformedURLException {
		System.out.println("*******************");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikash\\Desktop\\FR Training\\Simplilearn\\Phase-5\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vikash\\Desktop\\FR Training\\Simplilearn\\Phase-5\\geckodriver-v0.29.1-win64\\geckodriver.exe");

		driver = Browser.getDriver(browser);
		driver.manage().window().maximize();
	}
	
	@Test
	public void testGooglePageTitleInFirefox() {
		// timeout 
		driver.navigate().to(appURL);
		String strPageTitle = driver.getTitle();
		Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page title doesn't match");
	}

	@AfterClass
	public void tearDown() {
		if(driver!=null) {
			System.out.println("Closing browser..Firefox");
			driver.quit();
		}
	}
	
}
