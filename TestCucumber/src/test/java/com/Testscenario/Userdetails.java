package com.Testscenario;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Userdetails {

	private static Userdetails userdetails;
	
	private Userdetails() {
		
	}

	public static Userdetails getUserdetails() {
		if(userdetails==null) {
			userdetails=new Userdetails();
		}
		return userdetails;
	}
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement username;
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement lastname;
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement postal;
	@FindBy(xpath="//input[@id='continue']")
	private WebElement Usercontinue;
	
	public void Username(String Firstname) {
		username.sendKeys(Firstname);
	}
	public void Lastname(String Lastname) {
		lastname.sendKeys(Lastname);
	}
	public void Pincode(String Pincode) {
		postal.sendKeys(Pincode);
	}
	
	public void continuebutoon() {
		Usercontinue.click();
	}
	
}
