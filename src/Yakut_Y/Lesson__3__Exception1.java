package Yakut_Y;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson__3__Exception1 {
	public static void main(String[] args)   {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		//polymorhism  oops concept
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.xpath("jvhxdkzhfvxdjk")).click();
	    wait(5);
		driver.findElement(By.cssSelector("fvnsjng")).click();
		wait(2);
		
		
	}
	public static void wait(int num) {
		try {
			Thread.sleep(num*1000);
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
}
