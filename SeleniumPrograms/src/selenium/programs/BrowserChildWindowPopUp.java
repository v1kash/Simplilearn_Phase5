package selenium.programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserChildWindowPopUp {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vikash\\Desktop\\FR Training\\Simplilearn\\Phase-5\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/popup.php");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		Thread.sleep(1000);
		
		String MainWindow = driver.getWindowHandle();
		System.out.println("Current Window Handle: "+MainWindow);
		
		Thread.sleep(1000);
		
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		
		while(i1.hasNext()) {
			String ChildWindow = i1.next();
			System.out.println("Current Child Window handle: "+ChildWindow);
			Thread.sleep(1000);
			if(!MainWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				Thread.sleep(1000);
				driver.findElement(By.name("emailid")).sendKeys("test@email.com");
				Thread.sleep(1000);
				driver.findElement(By.name("btnLogin")).click();
				Thread.sleep(1000);
				
				driver.close();
			}
		}
		
		Thread.sleep(1000);
		driver.switchTo().window(MainWindow);
		driver.close();
		
	}
}
