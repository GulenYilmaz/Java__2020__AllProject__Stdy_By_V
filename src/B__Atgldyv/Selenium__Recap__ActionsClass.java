package B__Atgldyv;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium__Recap__ActionsClass {
	//amazon.com
	public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/dashboard";

	public static void main(String[] args) throws InterruptedException {
		
		

			System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
			WebDriver driver=new ChromeDriver();
			driver.get(url);
			//we have Actions class to automate mouse and keyboard operations:click,rightclick,double click, hover over, drag &drop
		
			WebElement account=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
			// we create obj of Actions class and pass the Wendriver obj/driver as a paramter
			Actions action=new Actions(driver);
			//Hover over mouse over Menu
			action.moveToElement(account).perform();//u need to call moveToElement(account) method and perform it 
			WebElement element=driver.findElement(By.xpath("//div[@id='nav-flyout-ya-newCust']"));// 
			//validating if hover over is successfully performed
			if(element.getText().contains("Start")) {
				System.out.println("Menu is displayed");
			}else {
				System.out.println("Menu is not displayed");
			}
			
			//How to right click on a element
			action.contextClick(element).perform();
			
			WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
			//1)we hover over on search box2)click on it,3)type sth,4)we use sendKeys() method to perform scroll down
			//by using Keys enum,Keys.ARROW_DOWN, 5)again we use Keys.ENter--> hit enter on keyboard6)we end with perform();
			action.moveToElement(searchBox).click().sendKeys("movies").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			
			Thread.sleep(3000);
			driver.close();
}
}