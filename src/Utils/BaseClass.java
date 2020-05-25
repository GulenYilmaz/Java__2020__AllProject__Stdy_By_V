package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {//main goal is initialize the webdriver
	
	// we develope the functions
	
	public static WebDriver driver;
	public  static WebDriver setUp() {
		
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		// to initialize the our webdriver 
        // first we can read the file class.method.filepath
		//simdi dosyanin icinde ki browserin degerine gore driver i initialize edicez
	
		if (ConfigsReader.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\gulen\\eclipse-workspace\\Study__With__Video\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			
			
		}else if (ConfigsReader.getProperty("browser").equalsIgnoreCase("gecko")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\gulen\\eclipse-workspace\\Study__With__Video\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			
			
			
		}else {System.err.println("Browser not supported");}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME,TimeUnit.SECONDS);
		driver.get(ConfigsReader.getProperty("url"));

		return driver;

	}
	
	
	
	
	
	
	
	
	
	
	public static void teardown() {
	
		if(driver!=null) {
			driver.quit();
		}	
	}
	
	
	
	public static void wait(int number)  {
		try {
			Thread.sleep(1000*number);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	

}
