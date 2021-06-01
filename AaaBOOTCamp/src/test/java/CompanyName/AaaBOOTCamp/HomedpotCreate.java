package CompanyName.AaaBOOTCamp;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class HomedpotCreate extends Usability {
	

	 Home home=new  Home(driver);
	 String email,pw,phone,zipcode;
	 CreateAndContinue creCont=new  CreateAndContinue(driver);
	 CreateAccount creAcct= new CreateAccount(driver);
	 @Parameters({"email","phone","zipcode","pw"})
	 
  @Test
  public void CreateAccountTest() {
	 home.myAccountClick();
	 home.registerClick();
	 creCont.selctContClick();
	 creAcct.emailField(email);
	 creAcct.pwField(pw);
	 creAcct.zipField(zipcode);
	 creAcct.phoneField(phone);
	 creAcct.creatButton();
	
  }
}
