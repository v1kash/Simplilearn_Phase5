package selenium.assistedPractices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssistedPractice5 {

	public static void main(String[] args)  throws InterruptedException{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikash\\Desktop\\FR Training\\Simplilearn\\Phase-5\\chromedriver_win32\\chromedriver.exe");
		 WebDriver  driver = new ChromeDriver();
		 
			
		 // Handling external popups
//		 driver.switchTo().alert().accept();
//		 
//		 driver.switchTo().alert().dismiss();
//		 
//		 driver.switchTo().alert().getText();
//		 
//		 driver.switchTo().alert().sendKeys("text");
//		 
//		 //driver.switchTo().alert().close();
//		 
//		 
//		 // Handling new tabs and windows
//		 
//		 WebDriver driver1 = new ChromeDriver();
//		 driver1.findElement(By.id("xyz")).sendKeys(Keys.CONTROL + "t");
//		 
//		 driver1.findElement(By.id("xyz")).sendKeys(Keys.CONTROL + "w");
		 
//		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vikash\\Desktop\\FR Training\\Simplilearn\\Phase-5\\geckodriver-v0.29.1-win64\\geckodriver.exe");
//			WebDriver driver = new FirefoxDriver();
			
			driver.get("http://demo.automationtesting.in/Alerts.html");
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			//driver.findElement(By.xpath("//button[contains(text(), 'click the button to display an  alert box')]")).click();
			driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
			
			Thread.sleep(1000);
			
			Alert act = driver.switchTo().alert();
			System.out.println(act.getText());
			act.accept();
			Thread.sleep(1000);
			
			
			driver.findElement(By.xpath("//a[contains(text(), 'Alert with OK & Cancel ')]")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
			Thread.sleep(1000);
			
			act = driver.switchTo().alert();
			System.out.println(act.getText());
			act.dismiss();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//a[contains(text(), 'Alert with Textbox ')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
			Thread.sleep(1000);
			
			act = driver.switchTo().alert();
			System.out.println(act.getText());
			act.sendKeys("Vikash Kumar");
			Thread.sleep(1000);
			act.accept();








	}

}
