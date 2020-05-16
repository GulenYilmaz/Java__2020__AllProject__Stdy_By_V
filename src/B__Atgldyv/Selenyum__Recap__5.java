package B__Atageldiyeva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenyum__Recap__5 {
	
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
	WebDriver driver=new ChromeDriver();
	
	
	
	driver.get("http://newtours.demoaut.com/");
					//tagName[@attributeName='attrValue']
	driver.findElement(By.xpath("//a[text()='REGISTER']")).click();//xpath with inner text,without attribute
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("bayramgul");// xpath with name attribute
	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("atageldiyeva");
	driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("1223556");
	driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("gul124@gmail.com(opens in new tab)");// xpath with id attribute
	driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("1234 Distrcict ave");
	driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Fairfax ");
	driver.findElement(By.xpath("//input[@name='state']")).sendKeys("VA");
	driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("2274934");//
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gul124@gmail.com(opens in new tab)");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abcd123");
	driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("abcd123");
	driver.findElement(By.xpath("//input[@src='/images/forms/submit.gif']")).click();//xpath with src attribute
	Thread.sleep(2000);
	driver.close();
	driver.quit();
	/*
	 * contains : used to specify partial text
//a[contains(text(),'Btn')] : This will select a link which has text Btn
Contains:
//input[contains(@id,'unam')] : This will select an element which id has unam.
starts with: //input[starts-with(@id,"txt")] : This will select an element which id starts with txt.
//tagname[@attribute='attaributeValue' and @attribute='attaributeValue']--->combining 2 xpathes
	 */
	
	
}
}
