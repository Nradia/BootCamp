package CompanyName.AaaBOOTCamp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {
	WebDriver driver;
	
	@FindBy(id="email") WebElement emailField;
	@FindBy(id="password-input-field") WebElement pwField ;
	@FindBy(id="zipCode") WebElement zipcodeField;
	@FindBy(id="phone") WebElement phoneField ;
	@FindBy(xpath="//span[text()='Create an Account']") WebElement createButton;
	
	public CreateAccount(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void emailField(String email) {
		emailField.sendKeys(email);
	}
	
	public void pwField(String pw) {
		pwField.sendKeys(pw);
	}
	public void zipField(String zipcode) {
		 zipcodeField.sendKeys(zipcode);	
	}
	
	public void phoneField(String phone) {
		phoneField.sendKeys(phone);	
	}
	public void creatButton() {
		createButton.click();	
	}
	
	/*home.MyAccountClick();
	  home.RegisterClick();
	  creCont.SelectNcontinueCick();
	  creAcct.emailfieldentry(email);
	  creAcct.passwordfieldentry(pw);
	  creAcct.zipcodefieldentry(zip);
	  creAcct.phonefieldentry(phone);
	  creAcct.CreatebuttonClick();*/
	
	
	
	
	
	
	
	
	
	
	
	
	
}
