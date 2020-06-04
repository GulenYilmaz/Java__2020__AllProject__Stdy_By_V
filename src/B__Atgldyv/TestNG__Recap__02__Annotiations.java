package B__Atgldyv;

import org.testng.annotations.Test;

public class TestNG__Recap__02__Annotiations {
	//what is TestNg? ->it's a testing tool,testing framework for the java programming language, it has efficient test execution and reporting, parallel batch
			//how it works?:it works with the annotations
			//BeforeXXX->pre conditions,@Test-> MUST to run a test case, @AfterXXX-post condition
			//BeforeMethod-runs before each test case, BeforeClass -runs only once for class
			//we can put some attributes :priority, groups, disabled/enabled,alwaysRun
			@Test(priority=1)
			public void testOne() {
				System.out.println("Test 1");
			}
			@Test
			public void testTwo() {
				System.out.println("Test 2");
			}
			@Test
			public void testThree() {
				System.out.println("Test 3");
			}
}
