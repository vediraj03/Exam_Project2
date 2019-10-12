package acme.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import acme.projectSpecific.ACME_Project_Specific;

public class Dashboard_Page extends ACME_Project_Specific{
	
	public Dashboard_Page mouseOverVendors() {
		
		WebElement eleVendor = driver.findElement(By.xpath("//div[@class='dropdown'][5]//button"));
		 Actions action = new Actions(driver);
		 
		action.moveToElement(eleVendor).build().perform();
		return this;
	}
	
	public VendorsSearch_Page clickVendorSearch() {
		driver.findElement(By.linkText("Search for Vendor")).click();
		return new VendorsSearch_Page();
	}
	

}
