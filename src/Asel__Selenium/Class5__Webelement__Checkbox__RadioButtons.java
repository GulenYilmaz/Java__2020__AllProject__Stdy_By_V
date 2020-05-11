package Asel__Selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class5__Webelement__Checkbox__RadioButtons {
	
	public static String username="tester";
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\gulen\\eclipse-workspace\\Selenium__Basics__Classes\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();//--->maximize the window
	driver.get("http://facebook.com");
	Thread.sleep(2000);
	
	WebElement userName=driver.findElement(By.cssSelector("input[id='one']"));
	userName.clear();
	userName.sendKeys("ali");
	
	WebElement password=driver.findElement(By.cssSelector("input[id='one']"));
	password.clear();
	password.sendKeys("ali");
	
	WebElement logo=driver.findElement(By.cssSelector("input[id='one']"));
	logo.clear();
    logo.sendKeys("ali");
    
    boolean logodisplay=logo.isDisplayed();
    if(logodisplay){
    	System.out.println("weborder logo is displayed");
    }else {
    	System.err.println("weborder logo is NOT displayed");
    }
	
    
    WebElement welcome=driver.findElement(By.cssSelector("input[id='one']"));
	String value=welcome.getText();
    if(value.contains(username)) {
    	System.out.println(username+" is logged in. Test case PASS.");
    }else {
    	System.out.println(username+" is logged in. Test case is NOT PASS.");

    }
    
    
    List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println(links.size());//---> kac tane link var
   
	int count=0;
	for (WebElement link: links) {//--->tum linklere ulastik
		String linkText=link.getText();
		if(!linkText.isEmpty()) {
			System.out.println(linkText);
			count++;
		}
	}
    System.out.println("total number of links with text"+count);
    
    
    
	Thread.sleep(2000);
	driver.quit();
	
}
	
	
}
