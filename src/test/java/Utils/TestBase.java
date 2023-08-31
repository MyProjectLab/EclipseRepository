package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public WebDriver driver;
	public WebDriver WebDriverManager() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
//		FileInputStream fis = new FileInputStream("C:\\Users\\SAMSUNG\\Desktop\\NewLab\\CucumberFreamwork\\src\\test\\resources\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String uRL = prop.getProperty("QAurl");
		String browser_properties = prop.getProperty("browser");
		String browser_maven = prop.getProperty("browser");
//		result = testCondition ? value1 value 2  //ternory operator
		
		String browser = browser_maven!=null ? browser_maven : browser_properties;
		
		if (driver==null)
		{
			if (browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("WebDriver.Chrome.Driver", System.getProperty("user.dir")+"//src//test//resources//chromedriver");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}
			if (browser.equalsIgnoreCase("firefox"))
			{
////			Run Same code on firefox
				System.setProperty("WevDriver.geco.driver", "/Users/SAMSUNG/Documents/gecodriver.exe");
				WebDriver  driver = new FirefoxDriver();
			}
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.get(uRL);
		}
		return driver;
     
	
	}
}
