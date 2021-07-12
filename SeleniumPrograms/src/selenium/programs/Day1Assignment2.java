package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Day1Assignment2 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vikash\\Desktop\\FR Training\\Simplilearn\\Phase-5\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("pen drive");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("16 GB")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("SanDisk Cruzer Blade")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		
		

	}

}
