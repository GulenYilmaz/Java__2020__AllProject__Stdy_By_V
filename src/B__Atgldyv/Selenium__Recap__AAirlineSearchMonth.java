package B__Atgldyv;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium__Recap__AAirlineSearchMonth {

		public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/dashboard";

		public static void main(String[] args) throws InterruptedException {
			
			

				System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
				WebDriver driver=new ChromeDriver();
				driver.get(url);
		
	// click on the calendar
	driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
	// find departing month address
	Thread.sleep(3000);
	boolean found = false;
	while (!found) {//will work only when condition is true, 
		String depMonthText = driver.findElement(By.xpath("//div[contains(@class, 'ui-corner-left')]/div"))
				.getText();
		if (depMonthText.equals("July 2020")) {//compare the Month 
			List<WebElement> days = driver.findElements(
					By.xpath("//div[contains(@class, 'ui-corner-left')]/following-sibling::table/tbody/tr/td"));
			for (WebElement day : days) {
				Thread.sleep(3000);
				String dayText = day.getText();
				if (dayText.equals("14")) {
					day.click();
					found=true;
					break;
				}
			}
		} else {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
		}
	}
}
}