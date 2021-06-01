package expediaProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class  BookingInfo {

	WebDriver driver;
	
	@FindBy(id=("firstname[0]")) WebElement firstNameFiedl;
	@FindBy(xpath=("//*[@data-tealeaf-name='middleName']")) WebElement middleNameFiedl;
	@FindBy(id=("lastname[0]")) WebElement lastNameFiedl;
	@FindBy(xpath=("//*[@aria-label='Country/Territory Code']")) WebElement country;
	@FindBy(id=("phone-number[0]")) WebElement phoneFiedl;
	@FindBy(id=("gender_female[0]")) WebElement gender;
	
	@FindBy(id=("date_of_birth_month0")) WebElement dOb;
	@FindBy(id=("date_of_birth_day[0]")) WebElement dayOb;
	@FindBy(id=("date_of_birth_year[0]")) WebElement yearOb;
	@FindBy(id=("yes_insurance")) WebElement flightInsurance;
	@FindBy(xpath=("//*[@data-tealeaf-name='cardHolderName_1']")) WebElement nameOncardField; 
	@FindBy(id=("date_of_birth_year[0]")) WebElement creditCardNumberField ;
	@FindBy(xpath=("//*[@data-tealeaf-name='expirationMonth_1']")) WebElement cardExpMonth ;
	@FindBy(xpath=("//*[@data-tealeaf-name='expirationYear_1']")) WebElement cardExpYear ;
	@FindBy(id=("new_cc_security_code")) WebElement securityCodeField;
	@FindBy(id=("complete-booking")) WebElement completeBookingButton;
	
	public BookingInfo(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void firstNameFiedl() {
		firstNameFiedl.sendKeys("John ");
	}
	
	public void middleNameFiedl() {
		middleNameFiedl.sendKeys("Michael");
	}
	public void lastNameFiedl() {
		lastNameFiedl.sendKeys("Silver");
	}
	public void country() {
		Select dropmenu=new Select(country);
		dropmenu.selectByValue("213");
	}
	
	public void phoneFiedl () {
		phoneFiedl.sendKeys("1234567898");
	}
	public void genderClick () {
		gender.click();
	}
	public void dObMonth() {
		Select dropmenu=new Select(dOb);
		dropmenu.selectByValue("08");
	}
	public void dayObMonth() {
		Select dropmenu=new Select(dayOb);
		dropmenu.selectByValue("26");
	}
	public void yearObMonth() {
		Select dropmenu=new Select(yearOb);
		dropmenu.selectByValue("1955");
	}

	public void flightInsurance() {
		flightInsurance.click();
	}

	public void nameOncardField() {
		nameOncardField.sendKeys("John Silver");
	}
	public void creditCardNumberField() {
		nameOncardField.sendKeys("2589745632196");
	}

	public void cardExpMonth() {
		Select dropmenu=new Select(cardExpMonth);
		dropmenu.selectByValue("02");
	}
	public void cardExpYear() {
		Select dropmenu=new Select(cardExpYear);
		dropmenu.selectByValue("2024");
	}

	public void securityCodeField() {
		securityCodeField.sendKeys("123");
	}
	public void completeBookingButton() {
		completeBookingButton.click();
	}

	
}//
