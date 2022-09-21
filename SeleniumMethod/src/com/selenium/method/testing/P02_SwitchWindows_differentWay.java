package com.selenium.method.testing;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// How to handle multiple windows in Selenium?
public class P02_SwitchWindows_differentWay{
	ChromeDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\19294\\eclipse-workspace\\JavaCoding\\SeleniumMethod\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/browser-windows");
	
	}
	
	@Test (enabled = true, priority = 1)

	public void switchWindows() throws InterruptedException {
		String mainHandle = driver.getWindowHandle();
		System.out.println("Main Window ID: " + mainHandle + "\n");
		
		// click the new Window button
		driver.findElement(By.xpath("//button[text()='New Window']")).click();

		Set<String> allHandles = driver.getWindowHandles();
		System.out.println("Windows Open After Click: " + allHandles.size());

		for (String windowHandle : allHandles) {
			if (mainHandle.equals(windowHandle)) {
				System.out.println("\t Window ID 1: \t" + windowHandle + "\n \t URL: \t \t" + driver.getCurrentUrl()
						+ "\n \t Title: \t \t" + driver.getTitle());
			} else {
				driver.switchTo().window(windowHandle);

				System.out.println("\t Window ID 2: \t" + windowHandle + "\n \t URL: \t \t" + driver.getCurrentUrl()
						+ "\n \t Title: \t \t" + driver.getTitle());

			}
		}
	}

	
	@AfterTest
	public void tearUp() {
		driver.quit(); // this is the right place where close(), and quit() can be evaluated
	}

}