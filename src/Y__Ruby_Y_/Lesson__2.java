package Y__Ruby_Y_;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Lesson__2 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://youtube.com");//this method waits until page is load
			Thread.sleep(2000);
			driver.navigate().back();// <--
			Thread.sleep(3000);
			driver.navigate().forward();// -->
			Thread.sleep(2000);
			driver.navigate().to("https://facebook.com"); //this method does not wait until page load
			Thread.sleep(2000);
			driver.navigate().refresh();//refreshing page

	}
	}