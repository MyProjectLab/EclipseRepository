package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.LandingPage;
import Utils.TestContextSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPageStepDefinitions {
	    
public WebDriver driver;
public String offeraPageProductNamet;
public String landingPageProductNamet;
TestContextSetUp testContextSetUp;
LandingPage landingPage;

		public 	LandingPageStepDefinitions(TestContextSetUp testContextSetUp)
		{
			this.testContextSetUp = testContextSetUp;
			this.landingPage = testContextSetUp.pageObjectManager.getLandingPage();
		}	    
		@Given("User is on GreenKart Landing page")
		public void user_is_on_green_kart_landing_page() {
				
			Assert.assertTrue(landingPage.getTitleLandingPage().contains("GreenKart"));
}
		@When("^user search with Shortname (.+) and extracted actual name of product$")
		public void user_search_with_shortname_and_extracted_actual_nameof_product(String shortName) throws InterruptedException 
		{
			landingPage.searchItem(shortName);
			Thread.sleep(2000);
//			testContextSetUp.landingPageProductNamet = testContextSetUp.driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
			testContextSetUp.landingPageProductNamet = landingPage.getProductName().split("-")[0].trim();
			System.out.println(landingPageProductNamet +" is extracted from Home Page");

		}
		@When("Added {string} items of the selected product to cart")
		public void Added_items_of_the_selected_product_to_cart(String quantity)
		{
			landingPage.incrementQuantity(Integer.parseInt(quantity));
			landingPage.addToCart();
		}
		
		


}
