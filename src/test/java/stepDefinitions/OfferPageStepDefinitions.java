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

public class OfferPageStepDefinitions 
{
//	String LandingPageProductNamet landingPageProductNamet;
	       
	String offeraPageProductNamet;
	TestContextSetUp testContextSetUp;


	public 	OfferPageStepDefinitions(TestContextSetUp testContextSetUp)
	{
		this.testContextSetUp = testContextSetUp; 
	}

		@Then("^user search for (.+) Sortname on offer page$")
		public void user_search_for_same_sortname_on_offer(String shortName) throws InterruptedException 
		{
			switchToOfferPage();
			testContextSetUp.driver.findElement(By.cssSelector("input[id='search-field']")).sendKeys(shortName);
			Thread.sleep(2000);
		    offeraPageProductNamet = testContextSetUp.driver.findElement(By.xpath("//tr/td")).getText();
			
		}		
		
		public void switchToOfferPage()
		{
		    // if you swith offer page skip below part	
			LandingPage landingPageProductNamet = testContextSetUp.pageObjectManager.getLandingPage();
			landingPageProductNamet.selectTopdealPage();
			testContextSetUp.genericUtils.SwitchWindowTochield();
//			explit wait, split n many more.
		}
		@Then("Validate product name in offer page matches with Landing page")
		public void Validate_product_name_in_offer_page_matches_with_Landing_page()
		{
			Assert.assertEquals(offeraPageProductNamet, testContextSetUp.landingPageProductNamet);
		}

}
