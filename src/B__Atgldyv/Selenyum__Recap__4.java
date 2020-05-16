package B__Atageldiyeva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenyum__Recap__4 {
	
	
	public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/dashboard";

public static void main(String[] args) throws InterruptedException {
	
	

		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		//while creating CSS no //, no @. Just start with tagname[attributesName='attributeValue']
		driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("Admin");//textbox varsa we should sendkey 
		//driver.findElement(By.cssSelector("input[name*='txtPass']")).sendKeys("Hum@nhrm123");//contains function use * after attribute
									//  tagname#idValue--> if there is id, with cssSelector # symbol is used
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.cssSelector("input.button")).click();//if there is classname we can use . for class in cssSelector
		//driver.findElement(By.cssSelector("input[id^='btn']")).click();//starts with function of css use ^ after attribute
		driver.findElement(By.cssSelector("a[class$='Trigger']")).click();//ends with function use $ after attribute name
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text='Logout']")).click();
		//when u use id attribute for cssSelector, just write TagName and put before # before id value
		//driver.findElement(By.cssSelector("input#firstName")).sendKeys("GUL");
		//we can use more than css without and or
		//tagName[attribute='attributeValue'][attribute='attributeValue']-->combining 2 cssSelector
		//we can't use text() with cssSelector
	
	
}
}
