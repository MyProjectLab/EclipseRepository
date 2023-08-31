package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
public WebDriver driver;
	public  CheckoutPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By cartBag = By.cssSelector("[alt='Cart']");
	By checkoutButton = By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]");
	By promoButton = By.cssSelector("[class='promoBtn']");
	By placeOrderButton = By.xpath("//button[contains(text(), 'Place Order')]");

	public void CheckoutItmes()
	{
		driver.findElement(cartBag).click();
		driver.findElement(checkoutButton).click();
	}
	public Boolean VerifyPromoButton()
	{
		return driver.findElement(promoButton).isEnabled();
	}
	public Boolean VerifyPlaceOrderButton()
	{
		return driver.findElement(placeOrderButton).isEnabled();
	}
	

}


