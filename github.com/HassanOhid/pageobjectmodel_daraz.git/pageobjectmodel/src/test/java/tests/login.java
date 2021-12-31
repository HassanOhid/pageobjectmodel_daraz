package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base;
import model.TimeOut;
import model.commonMethod;
import model.locator;
import pages.homepages;

public class login {

	
	Base base =new Base();
	 WebDriver driver =base.setup();
    commonMethod commonMethod =new commonMethod(driver);
	homepages homepages =new homepages(driver);
	TimeOut timeOut =new TimeOut();
	locator locator =new locator();
	
	@BeforeClass
	public void start() {
		
		driver.get(homepages.homepageurl() );
		driver.manage().window().maximize();
		
	}
	 
	
	@Test
	public void logintest() {
		
		 assertEquals(commonMethod.getTitle(),model.locator.pagetitle);
		 timeOut.timeout();
		 commonMethod.clickonbutton(model.locator.logicframe);
		 base.afterclose();
		
		
	}
	
	
	
	
}
