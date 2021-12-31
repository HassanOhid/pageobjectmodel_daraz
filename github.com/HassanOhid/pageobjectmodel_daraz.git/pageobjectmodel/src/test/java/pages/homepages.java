package pages;

import org.openqa.selenium.WebDriver;

import model.locator;

public class homepages {
	WebDriver driver;
	//Contractor for confirm to that web driver must be find 
	public homepages(WebDriver driver) {
		this.driver =  driver;
		}

	public String homepageurl() {
		return locator.homepage;	
	}
	
// when i want to my curent webpage url
	public String currenturl() {
		return driver.getCurrentUrl();
		
	}
	
	
	
	
}
