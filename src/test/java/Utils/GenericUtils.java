package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	public WebDriver driver;
	
	public GenericUtils(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void SwitchWindowTochield()
	{
		Set<String> Windows = driver.getWindowHandles();	
		Iterator<String> it  = Windows.iterator();   //parent window, chield window, sub chield window.	
		String parentWindowId = it.next();
		String chieldWindowId = it.next();
		driver.switchTo().window(chieldWindowId);	
	}

}
