package CompanyName.AaaBOOTCamp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Usability {
  
	WebDriver driver;
	
  @BeforeTest
  public void beforeTest() {
	
	
		  driver = new ChromeDriver(); 
		 
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\radia\\eclipse-workspace\\AaaBOOTCamp\\Drivers\\chromedriver.exe");
		  driver.get("https://homedepot.com");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		  
	  }
  

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
