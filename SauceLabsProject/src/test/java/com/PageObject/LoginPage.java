package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Constant.constant;

import io.cucumber.core.options.Constants;

public class LoginPage {

	@FindBy(xpath = "//input[@id='user-name']")
	private WebElement Username;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement Password;
	@FindBy(xpath = "//input[@id='login-button']")
	private WebElement Summit;

	public void uname() {
		Username.sendKeys(constant.Username);
	}

	public void pword() {
		Password.sendKeys(constant.Password);
	}

	public void button() {
		Summit.click();
	}
}
