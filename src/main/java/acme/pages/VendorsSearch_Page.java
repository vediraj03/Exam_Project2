package acme.pages;

import org.openqa.selenium.By;

import acme.projectSpecific.ACME_Project_Specific;

public class VendorsSearch_Page extends ACME_Project_Specific{
	
	public VendorsSearch_Page enterVendorName() {
		driver.findElement(By.id("vendorName")).sendKeys("Blue Lagoon");
		
		return this;
		
	}
	
	public SearchResults_Page clickOnSearch() {
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		return new SearchResults_Page();

}

}