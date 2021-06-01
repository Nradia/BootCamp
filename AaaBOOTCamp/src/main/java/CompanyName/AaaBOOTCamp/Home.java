package CompanyName.AaaBOOTCamp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	
	@FindBy(xpath="(//*[text()='My Account'])[1]") WebElement myAccount;
	@FindBy(xpath="//*[text()='Register']") WebElement register;
	
	public Home(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		
	}
	
	public void myAccountClick() {
	myAccount.click();
	}
	
	public void registerClick() {
		register.click();
		}
}


