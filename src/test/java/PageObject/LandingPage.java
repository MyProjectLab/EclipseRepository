package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
public WebDriver driver;
	public  LandingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By Search = By.cssSelector("input[type='Search']");
	By ProductName = By.cssSelector("h4.product-name");
	By topDeals = By.linkText("Top Deals");
	By increment = By.cssSelector("a.increment");
	By addToCart = By.cssSelector(".product-action button");
	
	
	public void searchItem(String shortName)
	{
		driver.findElement(Search).sendKeys(shortName);
	}
	public String getProductName()
	{
		return driver.findElement(ProductName).getText();
	}
	public void selectTopdealPage()
	{
		driver.findElement(topDeals).click();
	}
	public String getTitleLandingPage()
	{
		return driver.getTitle();
	}
	
	public void incrementQuantity(int quantity)
	{
	int i = quantity-1;
	
		while(i>0)
		{
			driver.findElement(increment).click();
			i--;
		}
			
	}
	public void addToCart()
	{
		driver.findElement(addToCart).click();
		
	}

}

