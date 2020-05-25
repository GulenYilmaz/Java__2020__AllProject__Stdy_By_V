package Ruby_;

import java.io.File;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.apache.commons.io.FileUtils;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class TestNG__Recap {
		public static WebDriver driver;
		@BeforeMethod
		public void openBrowserAndNavigateURL() {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://jqueryui.com/");
		}
		@AfterMethod
		public void close() {
			driver.close();
		}
		
		@Test
		public void verifymainPageLogo() {
			boolean  logo = driver.findElement(By.xpath("//h2[@class='logo']//a")).isDisplayed();
			AssertJUnit.assertEquals(logo, true);
//			Assert.assertTrue(logo);
//			Assert.assertFalse(logo);
//			String Actualyazi = driver.findElement(By.xpath(" ")).getText();
//			String Expectedyazi2 = "assword invalid";
//			Assert.assertEquals(Actualyazi, Expectedyazi2);
		
		}
		
		@Test(priority = 1)
		public void getAllLinksSize() {
			
			List<WebElement> links = driver.findElements(By.tagName("a"));
			int ActualLinks = links.size();
			int expected = 113;
			AssertJUnit.assertEquals(ActualLinks, expected);
		}
		
		@Test(priority = 2)
		public void buttonLinkClickable() {
			driver.findElement(By.xpath("//a[text()='Button']")).click();
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File picture = ts.getScreenshotAs(OutputType.FILE);

			try {
				FileUtils.copyFile(picture,new File("screenshots/button.png"));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			
		}}