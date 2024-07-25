package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class checkout {

	@FindBy(xpath="//button[@id='checkout']")
	private WebElement checkproduct;
	
	
	public void productcheck() {
		checkproduct.click();
	}
}
