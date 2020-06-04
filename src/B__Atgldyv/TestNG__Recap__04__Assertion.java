package B__Atgldyv;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG__Recap__04__Assertion {
	
		//Why we need assertion in TestNG?--> it is used for validation purpose
	//Assert is class of TestNG used to compare two values to validate sth
		@Test(priority=4)
		public void test1() {
			System.out.println("Test Case 1 Started");
			//Hard assert is even single assert fails it terminates whole program, and throws java.lang.AssertionError
			//but soft assert will continue to execute next line of script without throwing error and marks failed tests in the report
			//we need AssertAll() method at the end of SoftAssert to mark failed tests 
			Assert.assertEquals(12, 13, "The dropdown month values do not match please check with developer");
			// compare actual value to expected, the message will only appear when the test case fail
			System.out.println("Test case failes");																		
		}
		@Test(priority=1)
		public void test2() {
			System.out.println("Test Case 2 Started");
			// compare actual value to expected, the message won't appear bcuz values match, it won't fail
			Assert.assertEquals("Hel", "Hello", "Words doesn't match please raise a bug");
			Assert.assertEquals("Hello", "Hello", "Words doesn't match please raise a bug");
			System.out.println("Test case Completed");
		}
		@Test(priority=2)
		public void assertionTrue() {
			String name="John Smith";
			Assert.assertTrue(name.contains("John"));
			// this test will pass if condition inside is true 
		}
		@Test(priority=3)
		public void assertionFalse() {
			String name="John Smith";
			Assert.assertFalse(name.contains("Jane"),"names do not match please raise a bug");
			// this test will pass if condition inside is false
		}
}
