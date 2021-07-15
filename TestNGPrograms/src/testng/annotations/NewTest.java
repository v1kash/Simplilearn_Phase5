package testng.annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class NewTest {
	WebDriver driver;
	
  @Test
  public void f() {
	  String baseUrl="https://www.toolsqa.com/";
	  System.out.println("Launching Google Chrome browser");
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikash\\Desktop\\FR Training\\Simplilearn\\Phase-5\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get(baseUrl);
	  String testTitle="Free QA Automation Tools Tutorial for Beginners with Examples";
	  String originalTitle = driver.getTitle();
	  System.out.println("title of the web page: "+originalTitle);
	  Assert.assertEquals(originalTitle, testTitle);
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Starting Test On Chrome browser");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Finished test on Chrome browser");
  }

}
