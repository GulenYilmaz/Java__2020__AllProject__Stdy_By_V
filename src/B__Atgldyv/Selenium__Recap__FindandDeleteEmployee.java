package B__Atgldyv;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium__Recap__FindandDeleteEmployee {

	public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/dashboard";

	public static void main(String[] args) throws InterruptedException {
		
		

			System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
			WebDriver driver=new ChromeDriver();
			driver.get(url);
	//login to the hrm page
			WebElement username = driver.findElement(By.id("txtUsername"));
	//		CommonMethods.sendText(username, ConfigsReader.getProperty("username"));
			WebElement password = driver.findElement(By.id("txtPassword"));
	//		CommonMethods.sendText(password, ConfigsReader.getProperty("password"));
			driver.findElement(By.id("btnLogin")).click();
			//add an employee
			driver.findElement(By.cssSelector("a#menu_pim_viewPimModule")).click();
			driver.findElement(By.id("menu_pim_addEmployee")).click();
			//entering new employee info
			WebElement empfirstName = driver.findElement(By.id("firstName"));
		//	CommonMethods.sendText(empfirstName, "Ayjanaa");
			WebElement empLastName = driver.findElement(By.id("lastName"));
		//	CommonMethods.sendText(empLastName, "Alaaaa");
			//we need this to compare later in the employee list
			String empID = driver.findElement(By.id("employeeId")).getAttribute("value");// this is inner text of value
																							// attribute of EmpId, to check
																							// this employer in the list
			WebElement saveBTN = driver.findElement(By.id("btnSave"));
			
		//	CommonMethods.waitForClickability(saveBTN);
			saveBTN.click();
			//this is picture address
			String EmpDetails = driver.findElement(By.id("profile-pic")).getText();// this is the img after saving emp and
																					// inner text will give first last name
			if (EmpDetails.equals("Ayjanaa Alaaaa ")) {
				System.out.println("Employee is added");
			}
			//we click on the emp list
			driver.findElement(By.linkText("Employee List")).click();
			String expectValue = "Ayjanaa Alaaaa";
			boolean found = false;
			while (!found) {// TO RUN THE LOOP WE DO !FOUND IF THIS CONDITION IS NOT TRUE IT WONT ENTER THE
							// LOOP,
				// once found changes to true(by finding the id matches inside if condition
				// below) our while condition will be not true and it will stop looping
				List<WebElement> rowsData = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
				for (int i = 0; i < rowsData.size(); i++) {
					Thread.sleep(3000);
					String rowText = rowsData.get(i).getText();
					if (rowText.contains(empID)) {
						found = true;// once ID matches our condition becomes true it will move forward otherwise it
										// will loop through it,
						Thread.sleep(3000);								//		System.out.prunt("hello"+"rowText"+"welcome"	//tr[1]-->tr[i]
						driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[1]")).click();// click
//								int rowText1=2;																						// checkbox
//						System.out.println("hello ["+ rowText1+" ]welcome");//hello [1]welcome																							// for
																														// deleting
						driver.findElement(By.id("btnDelete")).click();
						Thread.sleep(3000);
						driver.findElement(By.id("dialogDeleteBtn")).click();
						break;
					}
				} // IF emp Id is not found, click next button, after all rows are checked and not
					// found, so we put next after for loop, bcuz loop controls rows
				driver.findElement(By.xpath("//a[text()='Next'")).click();
			}
}
}