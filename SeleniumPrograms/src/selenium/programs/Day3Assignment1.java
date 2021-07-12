package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day3Assignment1 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vikash\\Desktop\\FR Training\\Simplilearn\\Phase-5\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demoqa.com/nestedframes");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		int countIframesInPage = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of frames in the page: "+countIframesInPage);
		Thread.sleep(2000);
		
		WebElement frame1 = driver.findElement(By.id("frame1"));
		
		driver.switchTo().frame(frame1);
		Thread.sleep(2000);
		
		String frame1Text = frame1.getText();
		System.out.println("Frame 1 is: "+frame1Text);
		
		int countIframesInFrame1 =  driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of frame in frame1: "+countIframesInFrame1);
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		

	}

}
