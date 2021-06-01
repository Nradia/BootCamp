package expediaProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReturnFlight {
	WebDriver driver;
	@FindBy(xpath=("//*[text()='Select and show fare information for United flight, departing at 10:31am from New York, Landing at 10:53pm in New York for an additional $90 and total $416']")) WebElement returnFlight;
	@FindBy(xpath=("//*[@aria-label='Select']")) WebElement selectButton;
public ReturnFlight(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void returnFlightClik() {
	returnFlight.click();
}

public void selectButtonClick() {
	selectButton.click();
}

}//
