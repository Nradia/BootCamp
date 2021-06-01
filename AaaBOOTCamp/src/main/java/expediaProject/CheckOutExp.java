package expediaProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutExp {
	
			WebDriver driver;
	@FindBy(xpath=("//*[@aria-label='Continue to checkout']")) WebElement checkOutButton;
public CheckOutExp (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
	
public void checkoutButtonClick() {
	checkOutButton.click();
}
	
}//
