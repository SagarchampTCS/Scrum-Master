package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class R {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kadus\\Downloads\\chromedriver_win32\\chromedriver.exe");
     
		WebDriver driver = new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   TakesScreenshot ts = (TakesScreenshot) driver;
		   File src = ts.getScreenshotAs(OutputType.FILE);
		   File dest = new File ("D:\\Velocity - SQL\\f.jpg");
		   Files.copy(src, dest);
	}

}
