package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day2Assignment2 {
	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vikash\\Desktop\\FR Training\\Simplilearn\\Phase-5\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
	    WebElement w = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[7]"));
	    System.out.println(w.getText());
			   

	}

}
