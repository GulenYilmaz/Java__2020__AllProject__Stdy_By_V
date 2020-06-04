package B__Atgldyv;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Utils.CommonMethods;
public class TestNG__Recap__08__Listener extends CommonMethods implements ITestListener {

	// Test start first in xml file, bcuz we're specifying configuration
	// based on the actions performed in class, listener responds by implementing
	// certain actions
	// for ex: if test case passes give me screenshot,if fails print on the console
	// TestNG Listeners listens every event that happens within your TestNG
	// framework
	// Listeners can be implemented on the class level(individual to each class) and
	// project level(applicable for all test classes)
	/*
	 * Steps: 1. Create a Listener class that will be implementing ITestListener
	 * Interface 2. Provide logic for methods we need (on passing, on failure,
	 * before starting) 3. Specify listener in configurations (xml file) In order
	 * for listeners to work we MUST execute test from the xml.file
	 */

	@Override
			public void onStart(ITestContext context) {
				System.out.println("Functionality Testing started");//runs only one time
			}

	@Override
		public void onFinish(ITestContext context) {
			System.out.println("Functionality Testing finished");
		}

	@Override
	public void onTestStart(ITestResult result) {//runs before each test
		System.out.println("Test Started "+ result.getName());
		
	}

	@Override
		public void onTestSuccess(ITestResult result) {
			System.out.println("Test Passed "+ result.getName());
			CommonMethods.takeScreenshot("/passed/"+result.getName());
		}

	@Override
		public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed "+ result.getName());
		CommonMethods.takeScreenshot("/failed/"+result.getName());
		
		}
}
