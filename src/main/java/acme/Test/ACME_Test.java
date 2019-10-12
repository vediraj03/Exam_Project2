package acme.Test;

import org.testng.annotations.Test;

import acme.pages.Login_Page;
import acme.projectSpecific.ACME_Project_Specific;

public class ACME_Test extends ACME_Project_Specific{
	
	
	@Test
	public void login_Search() {
		
		new Login_Page().enterEmailId().enterPassword().clickOnLogin()
		.mouseOverVendors().clickVendorSearch().enterVendorName().clickOnSearch()
		.verifyResults();
	}

}
