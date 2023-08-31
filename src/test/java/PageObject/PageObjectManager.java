package PageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public LandingPage landingPage;
	public WebDriver driver;
	public offerPage offerPage;
	public CheckoutPage checkoutPage;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public LandingPage getLandingPage()
	{
		landingPage = new LandingPage(driver);
		return landingPage;
	}
	public offerPage OfferPage()
	{
	    offerPage = new offerPage(driver);
		return OfferPage();
	}
	public CheckoutPage getCheckoutPage()
	{
		checkoutPage = new CheckoutPage(driver);
		return checkoutPage;
	}

}
