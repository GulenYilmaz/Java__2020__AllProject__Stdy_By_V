package TestNG_T__HSN;

import org.testng.annotations.Test;
import org.testng.annotations.*;

public class Annotation {
/*
 * 
 * @Test            suite icerisinde birden fazla @Test tanimlayabiliyoruz
 * @BeforeTest      bu testlerden oncesinde yada sonrasinda calismasini istedigimiz bir method varsa @BeforeTest yada @AfterTest kullaniyoruz
 * @AfterTest
 * 
 * @BeforeMethod    test senariomuzdan once veya sonra calismasini istedigimiz method varsa eger kullaniyoruz
 * @AfterMethod
 * 
 * @BeforeClass     birden fazla class i ayni anda calsitirabiliyoruz,  
 * @AfterClass      teste baslamadan once test edecegimiz webpage de her nir sayfa icin ayri bir class olusturuyoruz
 *                  ve icerisnine kullanacagimiz elementlerimizi koyuyoruz.
 *                  bu classlardan once veya sonra calismasini istedigimiz method varsa eger kullaniyoruz
 *                  
 *                  
 *                  
 * @BeforeSuite     Gruplandirdigimiz test caselerimizin oldugu kisima suite diyoruz, 
 * @AfterSuite      bu olusturdugumuz suite lerden once yada sonra bir programin calismasini istiyorsak kullaniyoruz
 * 
 * 
 */

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am before Suite method");
	}

	
	
	
	
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("I am Before Test");
	}
	
	
	
	
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("I am before class");
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am before method");
	}	
	
		
	
	@Test (priority=2)
	public void testOne() {
		System.out.println("test One");
	}
	
	@Test (priority=1)
	public void testTwo() {
		System.out.println("test two");
	}
	
	
	
		
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("I am after method");
	}
	
	
	
	
	@AfterClass
	public void afterClass() {
		System.out.println("I am after class");
	}
	
	
	
	
	@AfterTest
	public void afterTest() {
		System.out.println("I am after Test");
	}
	
	
	
	
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("I am after Suite method");
	}
	
}
