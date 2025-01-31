package com.Testscenario;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutItem {

	private static CheckoutItem checkoutItem;

	private CheckoutItem() {

	}

	public static CheckoutItem getCheckoutItem() {
		if (checkoutItem == null) {
			checkoutItem = new CheckoutItem();
		}
		return checkoutItem;
	}

	@FindBy(xpath = "//button[@id='checkout']")
	private WebElement checkoutbutton;

	public void CheckItem() {
		checkoutbutton.click();
	}
}
