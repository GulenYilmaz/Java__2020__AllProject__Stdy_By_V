package B__Atgldyv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium__Recap__FileUpload {
	
		//https://the-internet.herokuapp.com/
	public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/dashboard";

	public static void main(String[] args) throws InterruptedException {
		
		

	System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	
	// click on File Upload link
	driver.findElement(By.linkText("File Upload")).click();
	WebElement chooseFileBTN = driver.findElement(By.id("file-upload"));
				
	
	// we use sendkeys() method for uploading a file, pass the filepath inside
	// sendkeys as a parameter, and it must be a String
	chooseFileBTN.sendKeys("/Users/Bayramgul/eclipse-workspace/Selenium/ScreenShots/TakeScreenShots.png");
	driver.findElement(By.id("file-submit")).click();
	String textUploaded = driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).getText();
	System.out.println(textUploaded);
	}
}
