package stepDefinition;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.Testscenario.AddItems;
import com.Testscenario.CheckingOverview;
import com.Testscenario.CheckoutItem;
import com.Testscenario.Userdetails;
import com.Testscenario.loginPage;
import com.Ultlity.Constant;
import com.Ultlity.commonUlity;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookingFunction {

	Logger logger = Logger.getLogger(BookingFunction.class);

	// commonUlity ulity=new commonUlity();
	@Given("Login with Valid Crenditial {string} and {string}")
	public void login_with_valid_crenditial_and(String Username, String Password) {
		try {
			loginPage.getLoginPage().Username(Username);
			logger.info("User Enter the UserName");
			loginPage.getLoginPage().Password(Password);
			logger.info("User Enter the Password");
		//	loginPage.getLoginPage().loginButton();
			logger.info("User is to click Summit button");

		} catch (Exception e) {
			logger.error(e.getMessage());
			commonUlity.getscreenshot();
		}
	}

	@When("user is want to buy product and add to cart")
	public void user_is_want_to_buy_product_and_add_to_cart() {

		try {
			logger.info("User is to selected the GivenProduct");
			AddItems.getaddItems().PurchaseItemname(Constant.Purchaseitems);
			logger.info("User is continue with Shopping cart");
			AddItems.getaddItems().Addtocart();
			logger.info("User is redirect to Checkout Page");
		} catch (Exception e) {
			logger.error(e.getMessage());
			commonUlity.getscreenshot();
		}
	}

	@When("User is to verify the product and continue to checkout")
	public void user_is_to_verify_the_product_and_continue_to_checkout() {
		try {
			logger.info("User is checkout the selected Product");
			CheckoutItem.getCheckoutItem().CheckItem();
			logger.info("User is redirect to Payment Page");
		} catch (Exception e) {
			logger.error(e.getMessage());
			commonUlity.getscreenshot();
		}
	}

	@When("User is to given details")
	public void user_is_to_given_details(io.cucumber.datatable.DataTable dataTable) {

		List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
		try {
			logger.info("User Enter the Firstname");
			String Firstname = list.get(0).get("Firstname");
			logger.info("User Enter the lastname");
			String Lastname = list.get(0).get("Lastname");
			logger.info("User Enter the Postcode");
			String Pincode = list.get(0).get("Pincode");
			logger.info("User Enter the continuebutton");

			Userdetails.getUserdetails().Username(Firstname);
			Userdetails.getUserdetails().Lastname(Lastname);
			Userdetails.getUserdetails().Pincode(Pincode);
			Userdetails.getUserdetails().continuebutoon();
		} catch (Exception e) {
			logger.error(e.getMessage());
			commonUlity.getscreenshot();
		}
	}

	@Then("user should see Product  Name as {string} and Finish")
	public void user_should_see_product_name_as_and_finish(String string) {
		try {
			logger.info("User use to verify the product and Enter the Finishbutton ");
			CheckingOverview.getcheckingOverview().Finishbutton();
			logger.info("User able to view Thanks Message");
			CheckingOverview.getcheckingOverview().completemessage();
		} catch (Exception e) {
			logger.error(e.getMessage());
			commonUlity.getscreenshot();
		}
	}
}