package Asel__TestNG;

import org.junit.Assert;
import org.testng.annotations.Test;

public class ListenerDemo {

	@Test(groups="regression")
	public void methodOne() {
		System.out.println("method One");
		Assert.assertTrue(false);
	}
	
	@Test
	public void methodTwo() {
		System.out.println("method two");
	}
	
	
	@Test(groups="regression")
	public void methodThree() {
		System.out.println("method Three");
		Assert.assertTrue(false);
	}
}
