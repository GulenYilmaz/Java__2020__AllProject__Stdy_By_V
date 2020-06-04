package B__Atgldyv;

import org.testng.Assert;
import org.testng.annotations.*;

import Utils.CommonMethods;

public class TestNG__Recap__06__DataProvider extends CommonMethods {

	/*
	 * This is called Test Parameterization or DataDriven testing-which is testing
	 * same functionality with different sets of data(using different sets of
	 * parameters and data provider has internal looping, uses the mechanism of loop
	 * 1 Create the data provider method with@DataProvider annotations. (Methods
	 * return type must be two-dimensional object arrays)
	 * 
	 * 2 Declare the “Data Provider” name after the @Test annotation. Like – @Test
	 * (dataProvider = “data provider method name”)
	 * 
	 * 3 Pass the arguments in the Test method, what you want to use from the data
	 * provider.
	 */

//	@Test(dataProvider = "getData") //// we use dataProvider attribute to use the 2D array info, inside
//	public void login(String username, String password) {// number of parameter should match number of columns inside
//															// getData
//		sendText(login.username, username);
//		sendText(Login.password, password);
//		WaitandClick(login.loginBTN);
//		boolean isDisplayed = dashboard.welcome.isDisplayed();
//		takeScreenshot("screenshots/HRMS/loginDataprovider.png");
//		Assert.assertTrue(isDisplayed, "Message Welcome is not displayed");
//	}
//
//	@DataProvider(name = "getData")
//	public Object[][] getData() {// this is for loop of TestNG
//		// better to use Object bcuz it is more global
//		Object[][] data = { { "Admin", "Hum@nhrm123" }, // every row is set of data
//				{ "Syntax", "Syntax123" }, // number of rows will decide how many times this method will run
//				{ "SyntaxUser", "Syntax123" } };
//		return data;
//	}


}