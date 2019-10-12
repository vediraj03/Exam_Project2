package acme.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import acme.projectSpecific.ACME_Project_Specific;

public class SearchResults_Page extends ACME_Project_Specific{
	
	public SearchResults_Page verifyResults() {
		WebElement eleCountry = driver.findElement(By.xpath("//td[text()='Blue Lagoon']/following::td[4]"));
		
		String countryName = eleCountry.getText();
		
		if(countryName.equalsIgnoreCase("France")) {
			System.out.println("country Name is correct :"+countryName);
		}
		
		else {
			System.out.println("country name is not matched :");
		}
		
		return this;
	}

}
