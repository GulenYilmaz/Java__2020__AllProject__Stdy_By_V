package Asel__Selenium;

import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;



//we can see all methods inside the page --->command+o



public class Class7__FrameException__Functions {
public static WebElement driver;
	
	/**
	 * 
	 * @param nameOrId
	 */
	public static void switchToFrame(String nameOrId) {
		try {
	//		driver.switchTo().frame(nameOrId);
		}catch(NoSuchFrameException e) {
			System.out.println("Frame is not present");
		}
	}
	
	/**
	 * 
	 * @param element
	 */
	public static void swithcToFrame(WebElement element) {
		try {
	//		driver.switchTo().frame(element);
		}catch(NoSuchFrameException e) {
			System.out.println("Frame is not present");
		}
	}
	
	/**
	 * 
	 * @param index
	 */
	public static void switchToFrame(int index) {
		try {
	//		driver.swithcTo().frame(index);
		}catch(NoSuchFrameException e) {
			System.out.println("Frame is not present");
		}
	}
}
