package selenium.assistedPractices;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
//import com.sun.jna.platform.FileUtils;
 
public class AssistedPractice6 {
	 public static void main(String[] args ) throws IOException
	    {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikash\\Desktop\\FR Training\\Simplilearn\\Phase-5\\chromedriver_win32\\chromedriver.exe");
		 WebDriver  driver = new ChromeDriver();
	       driver.get("https://www.flipkart.com/");
	       driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	       WebElement upload =  driver.findElement(By.xpath("//*[@type='text']"));
	       upload.click();
	       TakesScreenshot ts = (TakesScreenshot)driver;
	       File scr = ts.getScreenshotAs(OutputType.FILE);
	       FileUtils.copyFile(scr, new File("test.png"));
	       
	       driver.close();
	    }
}

