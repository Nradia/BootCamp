package expediaProject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ExpediaBookingFlight extends Usabiltyex {
	
	WebDriver driver;
	HomeExp home=new HomeExp(driver);
	CheckOutExp checkout=new CheckOutExp(driver);
	SelectFlight flightS=new  SelectFlight(driver);
	BookingInfo b=new BookingInfo(driver);
	
			@Test
  public void f() {
	home.enterleavingrFromField("DAC");
	home.clickleavingrFromTheCity();
	home.entergoingToField("Nyc");
	home.clickgoingToCity();
	home.clickdateField();
	home.clickdepartingDate();
	home.clickreturningDate();
	home.clickdoneButtonOnTheDateTable();
	home.clickclassSelectionTab();
	flightS.flightSelectedClick();
	flightS.departSelectButtonClick();
	checkout.checkoutButtonClick();
	b.firstNameFiedl();
	b.middleNameFiedl();
	b.lastNameFiedl();
	b.country();
	b.phoneFiedl();
	b.genderClick();
	b.dObMonth();
	b.dayObMonth();
	b.yearObMonth();
	b.flightInsurance();
	b.nameOncardField();
	b.creditCardNumberField();
	b.cardExpMonth();
	b.cardExpYear();
	b.securityCodeField();
	b.completeBookingButton();
	  
  }
}
