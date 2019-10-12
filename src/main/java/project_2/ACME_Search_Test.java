package project_2;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ACME_Search_Test {
	
	@Test
	public void Account_Login() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://acme-test.uipath.com/account/login");
		
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		driver.findElement(By.id("buttonLogin")).click();
//		comment
		
		WebElement eleVendor = driver.findElement(By.xpath("//div[@class='dropdown'][5]//button"));
		 Actions action = new Actions(driver);
		 
		action.moveToElement(eleVendor).build().perform();
		
		driver.findElement(By.linkText("Search for Vendor")).click();
		
		driver.findElement(By.id("vendorName")).sendKeys("Blue Lagoon");
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
		WebElement eleCountry = driver.findElement(By.xpath("//td[text()='Blue Lagoon']/following::td[4]"));
		
		String countryName = eleCountry.getText();
		
		if(countryName.equalsIgnoreCase("France")) {
			System.out.println("country Name is correct :"+countryName);
		}
		
		else {
			System.out.println("country name is not matched :");
		}
		
		driver.close();
	}

}
