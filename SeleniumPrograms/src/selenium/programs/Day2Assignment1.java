package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2Assignment1 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vikash\\Desktop\\FR Training\\Simplilearn\\Phase-5\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Watches");
		
		Thread.sleep(1000);
		WebElement categoryDropDown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select category = new Select(categoryDropDown);  
		category.selectByIndex(12);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Sony")).click();
		
		Thread.sleep(1000);

	}

}
