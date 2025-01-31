package com.Testscenario;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage {

	private static loginPage loginPage;

	private loginPage() {

	}

	public static loginPage getLoginPage() {
		if (loginPage == null) {
			loginPage = new loginPage();
		}
		return loginPage;
	}

	@FindBy(xpath = "//input[@id='user-name']")
	private WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	@FindBy(xpath = "//input[@id='login-button']")
	private WebElement loginbutton;

	public void Username(String USername) {
		username.sendKeys(USername);
	}

	public void Password(String pword) {
		password.sendKeys(pword);
	}

	public void loginButton() {
		loginbutton.click();
	}

}
