package TestNG_T__HSN;

import org.junit.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class AssertionsRecap {
/*
 * we have two type assertion
 * 1. hard assert
 * 2. soft assert
 *
 */
	
//	@Test
//	public void testone() {
//		System.out.println("hello freom test one");
//		
//		Assert.assertTrue(false);
//		Assert.assertTrue(true);
//		Assert.assertTrue(true);
//		Assert.assertTrue(true);
//		//false dan sonra lattaki assertleri yazdirmadi
//		// bunun icin soft assert kullaniyoruz
//		//--->hello freom test one
//		//--->FAILED: testone
//		
//	}
	
	@Test
	public void testtwo() {
		System.out.println("hello freom test two");
		 
		SoftAssert sAssert=new SoftAssert();
		
		
		sAssert.assertTrue(false);
		System.out.println("hello freom test three");
		
		sAssert.assertTrue(true);
		System.out.println("hello freom test fur");
		
		sAssert.assertTrue(true);
		System.out.println("hello freom test five");
		
		sAssert.assertTrue(true);
		//false dan sonra lattaki assertleri yazdirmadi
		// bunun icin soft assert kullaniyoruz
		//-->print  hello freom test two
		//hello freom test three
		//hello freom test fur
		//hello freom test five
		//PASSED: testtwo
		
	}
	
	
}
