package selenium.programs;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoITFileUpload {

	public static void main(String[] args) throws IOException, InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vikash\\Desktop\\FR Training\\Simplilearn\\Phase-5\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://smallpdf.com/pdf-converter");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"__cond-24\"]/div/div/div/div/div/div/form/label/div/div[2]/div/button[1]/span")).click();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("C:\\Users\\Vikash\\Desktop\\FR Training\\Simplilearn\\Phase-5\\Codes\\AutoITFileUpload.exe");
		Thread.sleep(8000);
		System.out.println("Converted from doc to pdf");
		Thread.sleep(8000);
		//driver.close();

	}

}
