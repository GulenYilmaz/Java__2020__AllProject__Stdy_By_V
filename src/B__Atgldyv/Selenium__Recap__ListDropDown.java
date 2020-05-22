package B__Atgldyv;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium__Recap__ListDropDown{
//http://jiravm.centralus.cloudapp.azure.com:8081/basic-select-dropdown-demo.html

	public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/dashboard";

public static void main(String[] args) throws InterruptedException {
	
	

		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		List<WebElement> DDs=driver.findElements(By.xpath("//a[@class='dropdown-toggle']"));
		for(WebElement drop:DDs) {
			System.out.println(drop.getText());
			if(drop.getText().equals("Input Forms")) {
				drop.click();
			}
		}
	}
}