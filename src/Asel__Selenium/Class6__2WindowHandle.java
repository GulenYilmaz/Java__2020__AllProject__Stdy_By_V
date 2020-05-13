package Asel__Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class6__2WindowHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gulen\\eclipse-workspace\\Selenium__Basics__Classes\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//--->maximize the window
		driver.get("http://facebook.com");
		Thread.sleep(2000);
		
		
		String Mainwindow=driver.getTitle();
		System.out.println(Mainwindow);
		
		driver.findElement(By.id("idvalue"));
		
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println(allwindows);
		
		Iterator<String> it=allwindows.iterator();
		String mainwindow=it.next();
		String childwindow=it.next();
		
		driver.switchTo().window(childwindow);
		driver.manage().window().maximize();
		String childwindowtitle=driver.getTitle();//--->su anda child window da oldugumuz icin getTitle kullanabiliriz
		System.out.println(childwindowtitle);
		driver.close();//---> childwindow u kapattik
		
		driver.switchTo().window(mainwindow);//---> tekrar main window a geri donduk
		
	}

}
