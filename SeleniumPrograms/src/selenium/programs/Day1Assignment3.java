package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Day1Assignment3 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vikash\\Desktop\\FR Training\\Simplilearn\\Phase-5\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("John");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Cena");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("222, home, city, State - pin code");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("testEmail@email.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("0123456789");
		Thread.sleep(1000);
		
		driver.findElement(By.name("radiooptions")).click();
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("msdd")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("English")).click();
		driver.findElement(By.linkText("Hindi")).click();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]")).click();
		Thread.sleep(1000);
		
		WebElement testDropDown = driver.findElement(By.id("Skills")); 
		Select dropdown = new Select(testDropDown);  
		dropdown.selectByIndex(5);  
		
		WebElement testDropDown2 = driver.findElement(By.id("countries")); 
		Select dropdown2 = new Select(testDropDown2);  
		dropdown2.selectByValue("India");
		
		WebElement countryDropDown = driver.findElement(By.id("select2-country-container")); 
		Select country = new Select(countryDropDown);  
		country.selectByValue("India");
		Thread.sleep(1000);
		
//		driver.findElement(By.id("select2-country-container")).click();
//		driver.findElement(By.linkText("India")).click();
		
		Thread.sleep(1000);
	
		
		WebElement testDropDown4 = driver.findElement(By.id("yearbox")); 
		Select dropdown4 = new Select(testDropDown4);  
		dropdown4.selectByValue("2000");
		
		WebElement testDropDown3 = driver.findElement(By.xpath("//select[@placeholder='Month']")); 
     	Select dropdown3 = new Select(testDropDown3);  
		dropdown3.selectByValue("March");  
		
		WebElement testDropDown5 = driver.findElement(By.id("daybox")); 
		Select dropdown5 = new Select(testDropDown5);  
		dropdown5.selectByValue("25");
		
		Thread.sleep(1000);
		driver.findElement(By.id("firstpassword")).sendKeys("Vikash");
		driver.findElement(By.id("secondpassword")).sendKeys("Vikash");
		
		
		Thread.sleep(2000);
		driver.findElement(By.id("submitbtn")).click();

	}

}
