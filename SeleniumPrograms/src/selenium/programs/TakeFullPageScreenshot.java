package selenium.programs;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TakeFullPageScreenshot {

	public static void main(String[] args) throws IOException{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vikash\\Desktop\\FR Training\\Simplilearn\\Phase-5\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demoqa.com");
		
		Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(2000)).takeScreenshot(driver);
		ImageIO.write(s.getImage(), "PNG", new File("C:\\Users\\Vikash\\Desktop\\FR Training\\Simplilearn\\Phase-5\\Codes\\fullPageScreenshot.png"));
		driver.close();

	}

}
