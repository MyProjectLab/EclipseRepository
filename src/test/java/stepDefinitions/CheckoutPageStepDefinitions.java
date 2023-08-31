package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.CheckoutPage;
import Utils.TestContextSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutPageStepDefinitions {
	    
public WebDriver driver;
public String offeraPageProductNamet;
public String landingPageProductNamet;
TestContextSetUp testContextSetUp;
CheckoutPage checkoutPage;

		public 	CheckoutPageStepDefinitions(TestContextSetUp testContextSetUp)
		{
			this.testContextSetUp = testContextSetUp;
			this.checkoutPage = testContextSetUp.pageObjectManager.getCheckoutPage();
		}	    
		@Then("verify user has ability to enter promo code and place the order")
		public void verify_user_has_ability_to_enter_promo_code_and_place_the_order()
		{
			Assert.assertTrue(checkoutPage.VerifyPromoButton());
			Assert.assertTrue(checkoutPage.VerifyPlaceOrderButton());
		}
		@Then("^User proceed to Checkout and validate the (.+) items in checkout page$")
		public void User_proceed_to_Checkout_and_validate_the_Name_items_in_checkout_page(String Name) throws InterruptedException
		{
			checkoutPage.CheckoutItmes();	
		}

}
