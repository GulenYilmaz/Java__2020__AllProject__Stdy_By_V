package TestNG_T__HSN;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.*;



public class OrangeHrmTitleAndLoginValidation  {
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
	
	@Test (priority=1)
	public void titleValidation() {
		String expectedtitle="OrangeHRM";
		String actualTitle=driver.getTitle();
		
		// simdi dogrulamak icin assert class kullanalim
		Assert.assertEquals("title miss mactch", expectedtitle, actualTitle);
		}
	
	@Test (priority=2)
	public void loginValidation() throws InterruptedException {
		
		// enter username and password
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//click login button
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		
		WebElement logo=driver.findElement(By.xpath("//div[@id='branding']/a/img"));
	
		
		Assert.assertTrue("Login  fail", logo.isDisplayed());
	}
	
	
	//(enabled=false)---> eger bug bulursak developerlar duzenleyene 
	//kadar testi enabled yapip testimize kaldigimiz yerden devam ediyoruz
}
