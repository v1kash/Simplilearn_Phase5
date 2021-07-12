package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day1Assignment1 {
      
	public static void main(String[] args) throws InterruptedException{
		
		// step1: load the chrome driver\
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikash\\Desktop\\FR Training\\Simplilearn\\Phase-5\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vikash\\Desktop\\FR Training\\Simplilearn\\Phase-5\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		
		//step2: open the url
		driver.get("https://www.gmail.com/");
		
		//step3: make full screen of window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//step4: use the id web locater
		driver.findElement(By.id("identifierId")).sendKeys("testemail.com");
		
		Thread.sleep(4000);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(3000);
		
		String at = driver.getTitle();
		System.out.println("driver title:"+at);
		String st="gmail";
		driver.close();
		
		if(at.equalsIgnoreCase(st))
			System.out.println("test successfull");
		else
			System.out.println("Not successfull");	
		
	}
}
