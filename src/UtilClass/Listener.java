package UtilClass;

import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;

import org.testng.ITestResult;

import Utils.CommonMethods;

public class Listener extends CommonMethods implements ITestListener{
	

	
	
	 
	  public void onTestStart(ITestResult result) {
	    System.out.println("Test started-->"+result.getName());
	  }

	  public void onTestSuccess(ITestResult result) {
	    System.out.println("Test pass--->"+result.getName());
	  }

	  public void onTestFailure(ITestResult result) {
		    System.out.println("Test Fail--->"+result.getName());
	  }

	 
	  public void onTestSkipped(ITestResult result) {
		    System.out.println("Test skip--->"+result.getName());
	  }

	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // not implemented
	  }

	  
	  public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	  public void onStart(ITestContext context) {
		    System.out.println("suite start--->"+context.getName());
	  }

	  public void onFinish(ITestContext context) {
		    System.out.println("suite finish--->"+context.getName());
	  }
	  
	  public void onTestFailure1(ITestResult result) {
		    System.out.println("test fail -->"+result);
		 //   takesScreenshot("failed/"+result.getName());
		  }

	  
	}


