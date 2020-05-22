package B__Atgldyv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium__Recap__GeckoDRiver__Xpath {


		public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/dashboard";

		public static void main(String[] args) throws InterruptedException {
			
			

			System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
			WebDriver driver=new ChromeDriver();
			driver.get(url);
			
			WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		    username.sendKeys("Admin");
			// we can use xpath with gecko driver as well 
		
	}

}
