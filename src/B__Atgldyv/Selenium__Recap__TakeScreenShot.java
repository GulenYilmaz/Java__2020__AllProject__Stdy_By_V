package B__Atgldyv;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium__Recap__TakeScreenShot {
	public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/dashboard";

	public static void main(String[] args) throws InterruptedException {
		
		

	System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	
	
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
	driver.findElement(By.id("btnLogin")).click();
	//Using Selenium we can take screenShots Using TakesScreenshot interface.
	
	//1.we need to downcast WebDriver obj to Screenshot and create a variable of TakesScreenshot
	TakesScreenshot ts=(TakesScreenshot)driver;
			
	//2.we have File interface for saving screenshots in selenium, so we use .getScreenshotAs(OutputType.FILE) method for creating that File variable
	File screen=ts.getScreenshotAs(OutputType.FILE);//this will return File type screenshot, this screenshot is hanging there
	//for ex whenever we copy or take the screenshots it is saved inside of clipboard until we paste or put that screenshot somewhere
	
	
	//3. Copy that file and identify which file and tell the destination file path inside parameters to paste that screenshot
//		try {
//			FileUtils.copyFile(screen, new File("screenshots/HRMS/pics.png"));
//		} catch (IOException e) {
//			e.printStackTrace();
//			System.out.println("Screenshot was not taken");
//		}
}
}