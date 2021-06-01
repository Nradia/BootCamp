package CompanyName.AaaBOOTCamp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAndContinue {
	
	public WebDriver driver;
	
@FindBy(xpath="(//*[text()='Select & Continue'])[1]") WebElement selctCont;
	
	public CreateAndContinue(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	public void selctContClick() {
		selctCont.click();
	}
}
