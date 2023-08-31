package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class offerPage {
public WebDriver driver;
	public  offerPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By Search = By.cssSelector("input[type='Search']");
	By ProductName = By.cssSelector("input[id='search-field']");
	
	public void searchItem(String shortName)
	{
		driver.findElement(Search).sendKeys(shortName);
	}
	public String getProductName()
	{
		return driver.findElement(ProductName).getText();
	}


}
