package expediaProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Usabiltyex {
	WebDriver driver;
	 @Parameters({"browser","website"})
 @BeforeTest
 public void beforeTest(String browser, String website) {
	  String path=System.getProperty("user.dir");
	  if(browser.equalsIgnoreCase("Chrome")){
		  driver = new ChromeDriver(); 
		  System.setProperty("webdriver.chrome.driver",path+"\\Drivers\\chromedriver.exe");
		 
		  //System.setProperty("webdriver.chrome.driver","C:\\Users\\radia\\git\\repositoryRad\\AaBootCamp\\drivers\\chromedriver.exe");
		  driver.get(website);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  }
		  
		  else if (browser.equalsIgnoreCase("firefox")){
			  driver = new FirefoxDriver(); 
			  System.setProperty("webdriver.gecko.driver",path+"\\Drivers\\geckodriver.exe");
			  driver.get(website);
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }
 }

 @AfterTest
 public void afterTest() {
	  driver.close();
 }


}
