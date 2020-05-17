package B__Atgldyv;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium__Recap__6 {
	
	public static String url="https://demoqa.com/automation-practice-form/";
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		//we use isSelected(), isDisplayed(),isEnabled()---->use these methods for validation(onaylamak) and will return boolean value
		//datatType variableName=element
		
		
		WebElement maleRadioB=driver.findElement(By.xpath("//input[@id='sex-0']"));//will return only ONE webelement
		System.out.println(maleRadioB.isDisplayed());//is it present ? true/false
		System.out.println(maleRadioB.isEnabled());//is it clickable or not clickable
		System.out.println(maleRadioB.isSelected());//false
		maleRadioB.click();
		System.out.println(maleRadioB.isSelected());//true/false 
	
		//second way to click on Radio Button
		List<WebElement> proList=driver.findElements(By.xpath("//input[@name='profession']"));//this will return list of webelements/Checkboxes
		
		int listSize=proList.size();
		System.out.println("Size of Checkboxes are: "+listSize);
		//driver.findElement(By.xpath("//input[@value='Manual Tester']")).getAttribute("value")--->this will give the value of value attribute
		String ValueTobeSelected="Manual Tester";//
		for (WebElement profession : proList) {
			if(profession.isEnabled()) {//true
				String value=profession.getAttribute("value");//herhangi bir attributen degerini, denklemin sag tarafindaki shey
				System.out.println(value);
				if(value.equals(ValueTobeSelected)) {
					profession.click();
					break;//when the condition is met break the loop after clicking
				}
//				if(value.equals("Automation Tester")) {
//					profession.click();
//				}
			}
			driver.quit();
			
		}}
}