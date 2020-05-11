package Asel__Selenium;



import java.util.List;

import org.openqa.selenium.By;
/*
 * navigate a=facebook  click on the forget button navigate to facebook again  navigate back
 * navigate forward refresh the page
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4__NavigationCommands__RadioButton__CheckBox {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\gulen\\eclipse-workspace\\Selenium__Basics__Classes\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://facebook.com");
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Forgot Password")).click();
	Thread.sleep(2000);
	
	driver.navigate().to("http://facebook.com");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();

//WebElement element= driver.findElement(By.attribute(attribute value));
	
//click on radio button
	
	
	WebElement element= driver.findElement(By.id("id value"));
	
	element.sendKeys("ali");
	element.clear();
	element.isDisplayed();//--->sayfada gorunuyor mu?
	element.isEnabled();//---> clickable tiklanabilir mi?
	element.isSelected();//--->secilmis mi secilmemis mi?
	
	
	if (element.isEnabled()) {
		element.click();
	}
	if(element.isSelected()) {
		driver.findElement(By.xpath("value")).click();//--> eger secilmisse digerini sec
	}

	List<WebElement> elements= driver.findElements(By.id("id value"));
	
	elements.size();//--> how many elements
	elements.get(0).click();//--->istedigimiz elemente tiklayabiliriz
	elements.get(0).getAttribute("AttributName");//---> attribute value degerini veriyor
	
	for(int i=0; i<elements.size(); i++) {//--->we can click all radio buttons
		
		String value=elements.get(0).getAttribute("AttributName");//---> attribute degerini bulduktan sonra
		if(value.equalsIgnoreCase("male")) {//---> istedigimiz radio button a tiklamak icin for loop icinde if condition kullanabiliriz
		elements.get(i).click();
		break;//---> hepsine tiklama bulduktan sonra dur
		}
	
	}
	
//click on checkbox
	WebElement checkbox= driver.findElement(By.id("id value"));
	if(!checkbox.isSelected()) {//----> eger secilmemisse click yap
		checkbox.click();
	}
	driver.quit();

	Thread.sleep(2000);
	
	
	//click on checkbox
    List<WebElement> checkboxes= driver.findElements(By.id("id value"));
	System.out.println(checkboxes.size());
	
	String valuetoselect="Maniul";
	for(WebElement check:checkboxes) {
		
		String value=check.getAttribute("AttributName");//---> attribute degerini bulduktan sonra
		if(value.equals(valuetoselect)) {
		check.click();
	
		}
	}
	
}
}
