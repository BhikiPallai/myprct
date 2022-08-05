package Common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	private WebDriver driver;
	
	 public WebDriver getDriver() {
		return driver;
		
	}
	
	public void setDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
