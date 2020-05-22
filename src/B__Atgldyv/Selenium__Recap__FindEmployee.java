package B__Atgldyv;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium__Recap__FindEmployee {
	public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/dashboard";

	public static void main(String[] args) throws InterruptedException {
		
		

			System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
			WebDriver driver=new ChromeDriver();
			driver.get(url);
	
	driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
	driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
	driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	String expectValue = "Bob Feather";
	//List of all rows
	List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));

	for (int i = 1; i < rows.size(); i++) {
//table rows(text we see in table) always start from 1 but elements inside List are stored by index which is 0 so that's why we do rows.get(i-1).getText()
//it means we are getting the text of 0'th row elements inside list and at the same 1st row of table
		String rowText=rows.get(i-1).getText();//get text of each row excluding header.
		if(rowText.contains(expectValue)) {//validating expected Value
			//loop through each row by providing the index in the xpath and click on it.
			driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+i+ "]/td[1]")).click();
										String name="Gulen";
												System.out.println("hello"+ name+" welcome");
												//row changes so we put i and want excatly constant 1 to click on checkbox
			break;//once we click don't loop and search just break and stop
		}	
	}
	Thread.sleep(3000);
}
}
