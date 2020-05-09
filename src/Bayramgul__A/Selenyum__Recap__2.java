package Bayramgul__A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenyum__Recap__2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("syntax@yahoo.com(opens in new tab)");
	driver.findElement(By.id("pass")).sendKeys("123");
	driver.findElement(By.id("u_0_b")).click();//alfa numeric id 
	Thread.sleep(3000);//<a:link< >
	//driver.findElement(By.linkText(""))
	driver.findElement(By.partialLinkText("Forgot account")).click();//using partial link is preferred when there is change in the info, whenever webpage refreshes
//driver.findElement(By.tagName("a")); by tagname

//every element may not have name,classname,id -Xpass, Css preferred
//alpha numeric id change every refresh, check it to make sure before put in locator
// all link locators start with (anchor) <a

	
	
	
}
}
