package com.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Constant.constant;

public class checkoutoverview {

	Logger logger=Logger.getLogger(checkoutoverview.class);
	
	@FindBy(xpath="//button[@id='finish']")
	private WebElement finish; 
	@FindBy(xpath="//h2[@class='complete-header']")
	private WebElement complete;
	
	public void Finishbutton() {
		finish.click();
	}
	
	public void thanksMessage() {
		if(
		complete.getText().equalsIgnoreCase(constant.Thanks)) {
		logger.info("Test was completed Successfully");
		}
	}
	
}
