package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Constant.constant;

public class checkoutInfo {

	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement Firstname;
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement Lastname;
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement Postalcode;
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continuebutton;
	
	
	
	
	public void first() {
		Firstname.sendKeys(constant.Firstname);
	} 
	
	public void last() {
		Lastname.sendKeys(constant.LastName);
	}
	
	public void Postcode() {
		Postalcode.sendKeys(constant.Postcalcode);
	} 
	
	public void continuebuttonfunction() {
		continuebutton.click();
	}
}
