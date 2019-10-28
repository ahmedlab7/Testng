package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
;


public class BrowserFactory {

	// Global, usable by all methods
	static WebDriver driver;

	public static WebDriver startBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\TESTING\\projects_exam\\TestNG_Q3-master\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("http://techfios.com/test/101/");
		
		return driver;
	}
}
