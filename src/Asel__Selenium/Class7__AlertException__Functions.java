package Asel__Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class Class7__AlertException__Functions {
public static WebDriver driver;
	public static void acceptAlert() {
		
		try {
			Alert alert=driver.switchTo().alert();
			alert.accept();
		}catch(NoAlertPresentException e ) {
			System.out.println("Alert is not present ");
		}
		
	}
	
	
	public static void dismissAlert() {
		try {
			Alert alert=driver.switchTo().alert();
			alert.dismiss();
		}catch(NoAlertPresentException e ) {
			System.out.println("Alert is not present ");
		}
	}
	
	public static String getAlertText() {
		try {
			Alert alert=driver.switchTo().alert();
			return alert.getText();
		}catch(NoAlertPresentException e) {
			System.out.println("Alert is not present ");
			return null;
		}
		
	}
	
	public static void main(String[] args) {
		
		getAlertText();
		dismissAlert();
		acceptAlert();
		
		
		
		
	}
}
