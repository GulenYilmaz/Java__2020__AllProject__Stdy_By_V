package TestNG_T__HSN;


	import java.util.concurrent.TimeUnit;

	import org.apache.commons.collections4.Get;
	import org.junit.BeforeClass;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeDriverService;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.AfterMethod;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;
	import org.testng.annotations.*;

	public class DataProvider__Recap3__SoftAssert {
		
		
		WebDriver driver;
		
		
		@BeforeClass
		public void openBrowserAndNavigateToHRM() throws InterruptedException {

			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
			 driver=new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			//driver.manage().window().maximize();
			Thread.sleep(3000);
		}
		
		
		@AfterClass
		public void closeBrowser() {
			driver.quit();
		}
		
		@BeforeMethod
		
		public void login() throws InterruptedException {
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//login HRM
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//click login button
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		
		}
		
		@AfterMethod
		public void logaout() throws InterruptedException {
			driver.findElement(By.id("welcome")).click();
			Thread.sleep(4000);
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
		}
		
		
		@Test (dataProvider="getData")
		public void addEmployee(String name, String lastName) throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			
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
			
		
			driver.findElement(By.id("btnSave")).click();
			Thread.sleep(3000);
			
			String actEmpFullName= driver.findElement(By.id("//div[@id='profile-pic']/h1")).getText();
			String expName= name+" "+lastName;
			
			SoftAssert sAssert=new SoftAssert();
			sAssert.assertEquals(actEmpFullName, expName);
            
			String actEmpId=driver.findElement(By.id("personal_txtEmployeeId")).getAttribute("value");
	        sAssert.assertEquals(actEmpFullName, expName, "Employee ID validation FAIL");
		 //   takeScreenShot((name+lastName));
	         
		}
		
		
		@DataProvider
		public Object[][] getData(){// provide argument for @Test method
			
			Object[][] data= {{"John","Simit"},{"Eva","Anna"}};
			return data;
			
		}
		//herbir satir icin bu dosyayi kullanicaz
		//simdi bu methodu yukaridaki test icine atamamiz gerekiyor bunun icinde (dataProvider="getData")
		//seklinde yaziyoruz
		
		
		
		
	}
