package TestNG_T__HSN;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.*;

public class DataProvider__Recap1 {
	WebDriver driver;
	@BeforeMethod
	public void openBrowserAndNavigateToHRM() throws InterruptedException {

		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		//driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	
	@Test (dataProvider="getData")
	public void addMultipleEmployee(String name, String lastName) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//login HRM
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//click login button
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		
		//navigate to employee page
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		Thread.sleep(4000);
		
		
		//add employee name and lastName
		Thread.sleep(4000);
		driver.findElement(By.id("firstName")).sendKeys(name);
		Thread.sleep(4000);
		driver.findElement(By.id("lastName")).sendKeys(lastName);
		
		
		String expEmpId=driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(3000);
		
		String actEmpId=driver.findElement(By.id("personal_txtEmployeeId")).getAttribute("value");
		Assert.assertEquals(actEmpId, expEmpId);
	// burasi bizim test  bolumumuz 
	}
	
	
	
	//simdi parametrelerimizi bu test kismina nasil aktaricaz? 
	//bunun icinde kullanmis oldugumuz annotation
	
	//int[] [] array={ {1.2,3},{4,5,6}}; bu sekildeiki boyutlu array olusturuyorduk
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data= {{"John","Simit"},{"Eva","Anna"}};
		return data;
		
	}
	//herbir satir icin bu dosyayi kullanicaz
	//simdi bu methodu yukaridaki test icine atamamiz gerekiyor bunun icinde (dataProvider="getData")
	//seklinde yaziyoruz
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
