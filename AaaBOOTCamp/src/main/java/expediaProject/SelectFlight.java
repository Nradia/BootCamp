package expediaProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlight {
	
	
WebDriver driver;
	
	@FindBy(xpath=("/html/head/body/div/div/div/div/div/div/section/main/ul/li/div/div/div/button")) WebElement flightSelected;
	@FindBy(xpath=("//*[text()='Select']")) WebElement selectButton;
	
	
public SelectFlight(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

public void departSelectButtonClick(){
	flightSelected.click();
	}
public void flightSelectedClick(){
	selectButton.click();
	}

}
