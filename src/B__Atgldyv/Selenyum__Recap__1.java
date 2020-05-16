package B__Atageldiyeva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenyum__Recap__1 {

	public static void main(String[] args) {
		String url="http://166.62.36.207/humanresources/symfony/web/index.php/dashboard";
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		//driver.findElement(By.name("form-hint")).sendKeys("John");
		driver.findElement(By.id("txtUsername")).sendKeys("John");//id is always unique for an element
		driver.findElement(By.id("txtPassword")).sendKeys("Abc123");
		driver.findElement(By.className("button")).click();// IF in the DOM, class="button" so we can use for className locator
		//driver.findElement(By.name("Submit")).click();
		driver.close();
		driver.quit();
		
	}}