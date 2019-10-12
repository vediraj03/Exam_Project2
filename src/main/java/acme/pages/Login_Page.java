package acme.pages;

import org.openqa.selenium.By;

import acme.projectSpecific.ACME_Project_Specific;

public class Login_Page extends ACME_Project_Specific{
	
	public Login_Page enterEmailId() {
		
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		return this;
	}
	
	public Login_Page enterPassword() {
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		return this;
	}
	
	public Dashboard_Page clickOnLogin() {
		driver.findElement(By.id("buttonLogin")).click();
		
		return new Dashboard_Page();
	}

}
