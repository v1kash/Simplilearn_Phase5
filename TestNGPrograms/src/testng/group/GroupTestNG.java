package testng.group;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTestNG {

	WebDriver driver;
	
	String title = "ToolsQA - Demo Website For Automation";
	
	@Test(groups= {"demo"})
	public void starting_point() {
		System.out.println("This is the starting point of the test");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikash\\Desktop\\FR Training\\Simplilearn\\Phase-5\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://demoqa.com/");
	}
	
	@Test(groups= {"demo"})
	public void checkTitle() {
		String testTitle = "ToolsQA";
		String originalTitle = driver.getTitle();
		Assert.assertEquals(originalTitle, testTitle);
	}
	
	@Test(groups= {"demo"})
	public void click_element() {
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a")).click();
		System.out.println("Home Page heading is displayed");
		driver.close();
	}
	

	
//WebDriver driver;
//	
//	@Test(groups = {"demo"},priority = 1)
//	public void start_point() {
//		
//	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\naman\\Downloads\\chromedriver_win32\\chromedriver.exe");
//
//		driver=new ChromeDriver();
//		
//		driver.get("https://demoqa.com");
//	}
//	
//	
//	@Test(groups = {"demo"},priority = 2)
//	public void checkTitle() {
//		
//	 String title = "ToolsQA";
//	 Assert.assertEquals(title, driver.getTitle());
//	 
//	}
//	
//	
//	@Test(groups = {"demo"},priority = 3)
//	public void e_checkTitle() {
//		
//	 System.out.println("Inside second function");
//	 driver.close();
//	}
//	

}
