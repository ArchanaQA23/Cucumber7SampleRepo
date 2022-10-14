package factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

	public WebDriver driver;
	
	static ThreadLocal<WebDriver> tDriver=new ThreadLocal<WebDriver>();
	
	
	public WebDriver init_driver(String browserName)
	{
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			tDriver.set(driver);
		}
		else if(browserName.equalsIgnoreCase("FF"))
		{
			// please complete this for FF
		}
		else if(browserName.equalsIgnoreCase("Edge"))
		{
			// please complete this for Edge browser
		}
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return getDriver();
	
	}
	
	public static WebDriver getDriver()
	{		
		return tDriver.get();
	}
	
}
