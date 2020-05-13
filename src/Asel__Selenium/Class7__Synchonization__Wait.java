package Asel__Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class Class7__Synchonization__Wait {
public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\gulen\\eclipse-workspace\\Selenium__Basics__Classes\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();//--->maximize the window
	driver.get("http://facebook.com");
	
	
	FluentWait wait =new FluentWait(driver);
   // wait.withTimeout(timeout);
   // wait.pollingEvery(interval);
   //wait.ignoring(exceptionType);
    
    
	
}
}
