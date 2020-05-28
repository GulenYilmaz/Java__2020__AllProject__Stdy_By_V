package Asel__TestNG;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class AlwaysRun {// always run--> we can use which method always executed in our test
	
	
	@BeforeClass (alwaysRun=true)
	public void beforeClass() {
		System.out.println("I am before class ");
		
	}

	@AfterClass (alwaysRun=true)
	public void afterClass() {
		System.out.println("I am afterclass ");
	}
	@BeforeSuite (alwaysRun=true)
	public void beforeSuite() {
		System.out.println("I am before suite ");
		
	}

	@AfterSuite (alwaysRun=true)
	public void afterSuite() {
		System.out.println("I am aftersuite ");
	}
	
	@BeforeMethod (alwaysRun=true)
	public void beforeMethod() {
		System.out.println("I am before method ");
		
	}

	@AfterMethod (alwaysRun=true)
	public void afterMethod() {
		System.out.println("I am aftermethod ");
	}
	@Test
	public void testMethod() {
		System.out.println("I am test method ");
	}

}
