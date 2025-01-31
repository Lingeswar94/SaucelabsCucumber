package com.PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Constant.constant;
import com.DriverManger.driver_Manager;

public class SelectProduct {

	@FindBy(xpath = "//div[@class='inventory_list']/div")
	private List<WebElement> Add;
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement container;

	public void AddProduct() {
		int x = Add.size();
		System.out.println(x);
		System.out.println(constant.Product);

		for (WebElement product : Add) {
			if (product.getText().equalsIgnoreCase(constant.Product)) {
				driver_Manager.getDriver().findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
				
			}
		}

		/*
		 * switch (constant.Product) { case "Sauce Labs Bike Light":
		 * driver_Manager.getDriver().findElement(By.id(
		 * "add-to-cart-sauce-labs-bike-light")).click(); break; case
		 * "Sauce Labs Backpack": driver_Manager.getDriver().findElement(By.id(
		 * "add-to-cart-sauce-labs-backpack")).click(); case "Sauce Labs Bolt T-Shirt":
		 * driver_Manager.getDriver().findElement(By.id(
		 * "add-to-cart-sauce-labs-bolt-t-shirt")).click(); case
		 * "Sauce Labs Fleece Jacket": driver_Manager.getDriver().findElement(By.id(
		 * "add-to-cart-sauce-labs-fleece-jacket")).click(); default: break; }
		 */

	}

	public void Shoppingcontainer() {
		container.click();
	}
}
