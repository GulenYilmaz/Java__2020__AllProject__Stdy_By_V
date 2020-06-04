package B__Atgldyv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import Utils.CommonMethods;
import Utils.ConfigsReader;

public class TestNG__Recap__05__SoftAssert extends CommonMethods {
		@BeforeMethod
		public void openBrowser() {
			setUp();
		}
		@AfterMethod
		public void closeBrowser() {
			teardown();
		}
		@Test
		public void logoValidation() {
			//Logo Assertion
			WebElement logo=driver.findElement(By.xpath("//div[@id='divLogo']//img"));
			SoftAssert soft=new SoftAssert();
		soft.assertTrue(logo.isDisplayed());//-->this is soft assert and if condition is false the rest of the code will continue executing
			//Assert.assertTrue(logo.isDisplayed(),"Logo is not displayed");
		//hard assertion if condition is false rest of the code terminates and won't execute
		soft.assertAll();// we need this for marking failing test as failed, after soft.assertAll()execution stops
		}
		@Test
		public void validLogin() {
			//Logging Assertion
			WebElement username = driver.findElement(By.id("txtUsername"));
			sendText(username, ConfigsReader.getProperty("username"));
			WebElement password = driver.findElement(By.id("txtPassword"));
			sendText(password, ConfigsReader.getProperty("password"));
			WebElement loginBTN = driver.findElement(By.id("btnLogin"));
			loginBTN.click();
			 WebElement welcomeAdmin=driver.findElement(By.id("welcome"));
			 String welcomeText=welcomeAdmin.getText();
			 Assert.assertTrue(welcomeText.contains("Admin"));
			 System.out.println("Welcome Admin is displayed");
			
	}
	
	@Test(priority =1)
		public void firstTest() {
			System.out.println("I am inside first one");
		}
		@Test(priority =2)
		public void SecondTest() {
			System.out.println("I am inside second one");
		}
		@Test(enabled = false)//1) first way we just disabled this test case 
		//(enabled = false->disabled, but we dont have disabled attribute
		public void ThirdTest() {
			System.out.println("I am inside third one");
		}
	}

