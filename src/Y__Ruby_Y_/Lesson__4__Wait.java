package Y__Ruby_Y_;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson__4__Wait {
public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);//bize yardimi sadece ve sadece findeleemnt ve finselemest bulamyi bekliyoo
		driver.get("http://166.62.36.207/syntaxpractice/");
		
		driver.findElement(By.xpath("//a[text()='Others']")).click();
		driver.findElement(By.xpath("//li[@style='display: list-item;']//a[text()='Dynamic Data Loading']")).click();
		driver.findElement(By.xpath("//button[@id='save']")).click();
		
		boolean gosterdimi = driver.findElement(By.xpath("//p[contains(text(),'Last Name')]")).isDisplayed();
		System.out.println("soyadi gozuktumu "+gosterdimi);
		
	}
}
