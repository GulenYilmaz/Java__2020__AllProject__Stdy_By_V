package Utils;

import java.rmi.UnexpectedException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends BaseClass{

	private static Object getWaitObject;

	//we are developing the our framework
	//developing the functions
	//lets reach driver ---> extends BaseClass

	
	
	/**
	 * method that clears and sends keys
	 * @param element
	 * @param text
	 */
	public static void sendText(WebElement element,String text) {
		element.clear();
		element.sendKeys(text);
	}
	
	
	
	
	//this functions work with radio buttons and check boxes
	
	public static void clickRadioOrCheckbox(List<WebElement> radioOrcheckbox, String value) {
		String actualValue;
		
		for(WebElement element:radioOrcheckbox) {
		
		actualValue=element.getAttribute("value").trim();
		
		if(element.isEnabled() && actualValue.equals(value)) {
			element.click();
			break;
		}	
		}
	}
	
	
	
	
	/**
	 * this overload methods work to handledropdown 
	 * @param element
	 * @param textToSelect
	 */
	public static void selectDdValue(WebElement element, String textToSelect) {
		try {
		
			Select select=new Select(element);
		    List<WebElement> options=select.getOptions();
		
		for(WebElement option:options) {
			if(option.getText().equals(textToSelect)) {
				select.selectByVisibleText(textToSelect);
				break;
				}
		}
		}catch(UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void selectDdValue(WebElement element, int index) {
		try {
			
			Select select=new Select(element);
		    int size=select.getOptions().size();
		
			if(size>index) {
				select.selectByIndex(index);
			}
		
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * methods that accept alert and catch exception is alert is not present
	 */
	public static void acceptAlert() {
	try{Alert alert=driver.switchTo().alert();
		alert.accept();
	}catch(NoAlertPresentException e) {
		e.printStackTrace();
		}	
	}
	
	
	public static void dismissAlert() {
	try {
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}catch(NoAlertPresentException e) {
		e.printStackTrace();
		}	
	}
	
	
	public static String getAlertText() {
	try {
		Alert alert=driver.switchTo().alert();
		return alert.getText();
	}catch(NoAlertPresentException e) {
		e.printStackTrace();
		return null;
		}	
	}

	
	
	public static void sendAlertText(String text) {
	try {
		Alert alert=driver.switchTo().alert();
		alert.sendKeys(text);
	}catch(NoAlertPresentException e) {
		e.printStackTrace();	
		}	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void switchToFrame(String nameOrId) {
	try {
		driver.switchTo().frame(nameOrId);
		}catch(NoSuchFrameException e) {
			e.printStackTrace();	
			}	
		}
	
	public static  void switchToFrame(WebElement element) {
	try {
		driver.switchTo().frame(element);
		}catch(NoSuchFrameException e) {
			e.printStackTrace();	
			}	
		}
		

	public static  void switchToFrame(int index) {
	try {
		driver.switchTo().frame(index);
		}catch(NoSuchFrameException e) {
			e.printStackTrace();	
			}	
		}

	
	
	
	
	
	
	
	/**
 * this switch focus to child window
 */
      public static void switchToChildWindow() {
    	  String  mainWindow=driver.getWindowHandle();
    	  Set<String> windows= driver.getWindowHandles();
    	  for(String window : windows) {
    		  if(!window.equals(mainWindow)) {
    			  driver.switchTo().window(window);
    			  break;
    		  }
    	  }
      }

   
      
      
      
 
      
      
      

public static WebDriverWait getWaitObject() {
	WebDriverWait wait=new WebDriverWait(driver,Constants.EXPLICIT_WAIT_TIME);
	return wait;
}

public static WebElement waitForClickability(WebElement element) {
	return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
}

public static void waitForVisibility(WebElement element) {
	getWaitObject().until(ExpectedConditions.visibilityOf(element));
}

public static void waitAndClick(WebElement element) {
	 waitForVisibility(element);
	 element.click();
}















/**
 * create ajS obcejt
 * @return
 */
public static JavascriptExecutor getJSObject() {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	return js;
}


/**
 * click to element
 * @param element
 */
public static void jsClick(WebElement element) {
	getJSObject().executeScript("arguments[0].click();", element);
	
}
/**
 * this method scroll into the element
 * @param element
 */
public static void scrollToElement(WebElement element) {
	getJSObject().executeScript("arguments[0].scrollIntoView(true);", element);
}

/**
 * we can scroll down the web page depends on the pixel
 * @param pixel
 */
public static void scrollDown(int pixel) {
	getJSObject().executeScript("window.scrollBy(0,"+pixel+")");
}


/**
 * we can scroll up the web page depends on the pixel
 * @param pixel
 */
public static void scrollUp(int pixel) {
	getJSObject().executeScript("window.scrollBy(0,-"+pixel+")");
}









/**
 * wait for the selenium
 * @param second
 */

public static void wait(int second ) {
	try {
		Thread.sleep(second*1000);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
}













}	
	

