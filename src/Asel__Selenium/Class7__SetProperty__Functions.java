package Asel__Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class7__SetProperty__Functions {

	public static WebDriver driver;
	
	
	public static void setUp(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\gulen\\eclipse-workspace\\Study__With__Video\\drivers\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.get(url);
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\gulen\\eclipse-workspace\\Study__With__Video\\drivers\\geckodriver.exe");
		    driver=new FirefoxDriver();
		    driver.get(url);
		}else {
			System.err.println("Browser not supported");
			
			//driver.manage().window().maximize();
			//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
	}
}
