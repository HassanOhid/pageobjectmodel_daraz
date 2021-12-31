package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.mustache.Value;



public class commonMethod {

	public static WebDriver driver;

	public commonMethod(WebDriver driver) {
		 this.driver= driver;

	}
	
	public String getTitle() {
	return	driver.getTitle();		
	}
	
	 public void clickonbutton(By btn) { 
		 driver.findElement(btn).click();
	 }
	
	public static String gettext(By element) {
		return driver.findElement(element).getText();
	}
	
	public void   senttext(By element,String value){
		driver.findElement( element).sendKeys(value);
		
		
	}
}

