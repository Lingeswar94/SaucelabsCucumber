package com.Testscenario;

import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddItems {

	private static AddItems addItems;

	private AddItems() {

	}

	public static AddItems getaddItems() {
		if (addItems == null) {
			addItems = new AddItems();
		}
		return addItems;
	}

	@FindBy(xpath = "//div[@id='inventory_container']/div/div")
	private List<WebElement> Allitem;

	@FindBy(xpath = "//div[@id='shopping_cart_container']")
	private WebElement Shoppingcart;

	public void PurchaseItemname(String Item) {
		int x = Allitem.size();
		for (int i = 0; i < x; i++) {
			String Itemname = Allitem.get(i).getText();
			if (Itemname.contentEquals(Item)) {
				Allitem.get(i).click();
			}
		}
	}

	public void Addtocart() {
		Shoppingcart.click();
	}
}
