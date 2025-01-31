package com.Step_Definition;

import java.sql.DriverManager;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Constant.constant;
import com.DriverManger.driver_Manager;
import com.PageObject.LoginPage;
import com.PageObject.SelectProduct;
import com.PageObject.checkout;
import com.PageObject.checkoutInfo;
import com.PageObject.checkoutoverview;
import com.Ultity.Commonutils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class add_To_Cart {

	Logger logger = Logger.getLogger(add_To_Cart.class);
	Commonutils commonutils = new Commonutils();

	@Given("the user is to login successfuly and viewing HomePage")
	public void the_user_is_to_login_successfuly_and_viewing_home_page() {

		logger.info("User is to login SauceDemo app ");
		LoginPage loginPage = PageFactory.initElements(driver_Manager.getDriver(), LoginPage.class);
		try {
			logger.info("User Enter the UserName");
			loginPage.uname();
			logger.info("User Enter the Password");
			loginPage.pword();
			logger.info("User is to click Summit button");
			loginPage.button();
			logger.info("User able to see Home Page ");
		} catch (Exception e) {
			logger.error(e);
			commonutils.takeScreenshot();
		}
	}

	@When("the user is to buy T shirt and add to cart in the page")
	public void the_user_is_to_buy_t_shirt_and_add_to_cart_in_the_page() {

		SelectProduct product = PageFactory.initElements(driver_Manager.getDriver(), SelectProduct.class);
		logger.info("User is to select the Product");
		try {
			logger.info("User is to selected the GivenProduct");
			product.AddProduct();
			logger.info("User is continue with Shopping cart");
			product.Shoppingcontainer();
			logger.info("User is redirect to Checkout Page");
		} catch (Exception e) {
			logger.error(e);
			commonutils.takeScreenshot();
		}
	}

	@When("user is to verify the product and click checkout")
	public void user_is_to_verify_the_product_and_click_checkout() {
		checkout check = PageFactory.initElements(driver_Manager.getDriver(), checkout.class);
		try {
			logger.info("User is checkout the selected Product");
			check.productcheck();
			logger.info("User is redirect to Payment Page");
		} catch (Exception e) {
			logger.error(e);
			commonutils.takeScreenshot();
		}
	}

	@When("User is to give Your Information")
	public void user_is_to_give_your_information() {
		checkoutInfo checkInfo = PageFactory.initElements(driver_Manager.getDriver(), checkoutInfo.class);
		try {
			logger.info("User Enter the Firstname");
			checkInfo.first();
			logger.info("User Enter the lastname");
			checkInfo.last();
			logger.info("User Enter the Postcode");
			checkInfo.Postcode();
			logger.info("User Enter the continuebutton");
			checkInfo.continuebuttonfunction();
		} catch (Exception e) {
			logger.error(e);
			commonutils.takeScreenshot();
		}
	}

	@Then("user should see Product  Name as {string} and Finish")
	public void user_should_see_product_name_as_and_finish(String Thanks) {

		checkoutoverview checkoverview = PageFactory.initElements(driver_Manager.getDriver(), checkoutoverview.class);
		try {
			logger.info("User use to verify the product and Enter the Finishbutton ");
			checkoverview.Finishbutton();
			logger.info("User able to view Thanks Message");
			checkoverview.thanksMessage();

		} catch (Exception e) {
			logger.error(e);
			commonutils.takeScreenshot();
		}
	}
}
