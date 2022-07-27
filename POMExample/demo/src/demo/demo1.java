package demo; 

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

//import tstng.NewTest;

public class demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Logger log = Logger.getLogger(demo1.class);
		PropertyConfigurator.configure("log4j.properties");
		log.info("chrome opened");
		System.setProperty("webdriver.chrome.driver","D:\\chrome for selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		log.info("AM opened");
		driver.get("https://am-qa.sonet.com.au/login");
		Thread.sleep(5000);
		log.info("window maximized");
		driver.manage().window().maximize();
		log.info("login details");
		driver.findElement(By.id("username")).sendKeys("Lm_admin");
		driver.findElement(By.id("password")).sendKeys("12345678");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//a[@href=\"/admin\"]")).click();
		Thread.sleep(20000);
		//Select Lm_admin= new Select(driver.findElement(By.xpath("//li[@class=\"dropdown open\"]")));
		//Lm_admin.selectByVisibleText("Logout");
		driver.findElement(By.xpath("//body/div[@id='page-content']/div[1]/div[4]/ul[2]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='page-content']/div[1]/div[4]/ul[2]/li[2]/ul[1]/li[8]/a[1]")).click();
		//By username = By.name("email");
		log.info("logout");
		//@FindBy("");
		//public static
		
		
	
		
		
		
		
		
		
		
	}

}
