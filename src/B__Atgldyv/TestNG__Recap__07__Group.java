package B__Atgldyv;


import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;
/*
 * <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
	<test thread-count="5" name="GroupsDemo Test">
		<groups>
			<run>
				<!-- <exclude name="regression"></exclude> -->
				<include name="smoke"></include>
			</run>
		</groups>
		<classes>
			<class name="com.class03.TestNGGroupsDemo" />
		</classes>
	</test> <!-- Test -->
</suite> <!-- Suite -->
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class TestNG__Recap__07__Group {

		/*Steps to group tests 
		 * 1)define groups inside class
		 * 2)create xml file
		 * 3)in xml file, under name <groups> 
		 * <run>  <include name="sanity"></include>
		 * <run> <groups>
		 * 4) meta groups==we can create custom groups as well
		 */
		// alwaysRun attribute will make sure that this method will always execute
		@BeforeClass(alwaysRun=true)
		public void beforeclass() {
			System.out.println("before class");
		}
		@AfterClass(alwaysRun=true)//this will run in any case
		public void afterclass() {
			System.out.println("after class");
		}
		//if any depending method fails then depending method will not execute
		@Test(dependsOnGroups = { "smoke" })
		public void Test1() {
			System.out.println("I am inside test Test 1");
		}
		@Test(groups = "smoke")
		public void Test2() {
			System.out.println("I am inside test Test 2");
			Assert.assertTrue(false); // If this test fails, test1 will be skipped
			SoftAssert soft = new SoftAssert();
			soft.assertTrue(false);
			soft.assertAll(); // this statement will collect all soft assert
								// and decide if test passed or failed
		}
		@Test(groups = "regression")
		public void Test3() {
			System.out.println("I am inside test Test 3");
		}
		@Test(groups = {"smoke","regression"})//if i include sanity and exclude smoke, EXCLUDE WINS, exclude is stronger than include
		public void Test4() {
			System.out.println("I am inside test Test 4");
		}
}
