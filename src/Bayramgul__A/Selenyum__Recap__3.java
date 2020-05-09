package Bayramgul__A;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenyum__Recap__3 {
public static void main(String[] args) throws IOException {
	
	
	WebDriver driver = null;
	
	//1.Must is to build path btw eclipse to file
	FileInputStream fis = new FileInputStream("/Users/Bayramgul/eclipse-workspace/JavaBasics/config/Amazon.properties");//we need to pass the location address of wanted file
	
	Properties prop = new Properties();//2.
	prop.load(fis);//3.kavusuyorlar
	
	String browser = prop.getProperty("browser");//will return String type value
	switch (browser){
	case "google":
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		driver = new ChromeDriver();
		break;
	case "firefox":
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver 2");
		driver = new FirefoxDriver();
		break;
	}
	driver.get(prop.getProperty("url"));
	//driver.findElements(By.xpath("//*[@id=\'nav-link-accountList\']/span[1]"));
	driver.findElement(By.xpath("//*[@id=\'nav-link-accountList\']/span[1]")).click();
	driver.findElement(By.id("createAccountSubmit")).click();
	driver.findElement(By.name("customerName")).sendKeys(prop.getProperty("name"));
	driver.findElement(By.id("ap_email")).sendKeys(prop.getProperty("email"));
	driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
	driver.findElement(By.name("passwordCheck")).sendKeys(prop.getProperty("password"));
	
	
}
}
