package model;

import java.sql.Driver;

import org.openqa.selenium.By;

public class locator {
	public static  String homepage =" https://www.daraz.com.bd";
	public static  String pagetitle="Online Shopping in Bangladesh: Order Now from Daraz.com.bd";
	
	//login
	public static By logicframe = By.xpath("//a[contains(text(),'Signup / Login')]");
	public static By username= By.xpath("//input[@placeholder='Please enter your Phone Number or Email']");
	public static By password=By.xpath("//input[@placeholder='Please enter your password']");
	public static By submitbotton=By.xpath("");
	

}
