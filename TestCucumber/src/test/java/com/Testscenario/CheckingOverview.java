package com.Testscenario;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Ultlity.Constant;

public class CheckingOverview {

	private static CheckingOverview checkingOverview;

	private CheckingOverview() {

	}

	public static CheckingOverview getcheckingOverview() {
		if (checkingOverview == null) {
			checkingOverview = new CheckingOverview();
		}
		return checkingOverview;
	}

	@FindBy(xpath = "//button[@id='finish']")
	private WebElement quantity;
	@FindBy(xpath = "//h2[@class='complete-header']")
	private WebElement complete;

	public void Finishbutton() {
		quantity.click();
	}

	public void completemessage() {
		String text = complete.getText();
		if (text.equalsIgnoreCase(Constant.Textmessage)) {
			System.out.println(text);
		}
	}
}
