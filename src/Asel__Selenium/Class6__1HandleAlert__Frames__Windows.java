package Asel__Selenium;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class6__1HandleAlert__Frames__Windows {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\gulen\\eclipse-workspace\\Selenium__Basics__Classes\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();//--->maximize the window
	driver.get("http://facebook.com");
	Thread.sleep(2000);
	
	//handling alert   -->positive way ---> accept();
	Alert alert1=driver.switchTo().alert();//--> switch to alert page
	String alertText1=alert1.getText();
	System.out.println("test alert is"+alertText1);
	alert1.accept();
	
	//handling prompt alert --->bilgi isteyen alert
	Alert alert2=driver.switchTo().alert();//--> switch to alert page
	String alertText2=alert2.getText();
	
	System.out.println(alertText2);
	alert2.sendKeys("yes");
	alert2.dismiss();//--> or alert2.accept();
	
	
	
	
	
	//handling frame
	WebElement element =driver.findElement(By.id("text"));
	element.click();
	
	//handling frame by index
	driver.switchTo().frame(2);//---> go to frame from window
	element.sendKeys("nora");
	driver.switchTo().defaultContent();//--> go back to window
	
	//handling frame by id or name value
		driver.switchTo().frame("frame_you");//---> id="frame_you"
		driver.switchTo().frame("text");//---> name="text"
		element.sendKeys("graham");
		driver.switchTo().defaultContent();//--> go back to window
	
	//handling frame by WebElement
		WebElement frame1 =driver.findElement(By.id("text"));
		driver.switchTo().frame(frame1);//---> webelement name is frame1
		element.clear();
		element.sendKeys("graham");
		driver.switchTo().defaultContent();//--> go back to window
	
		
}
}
