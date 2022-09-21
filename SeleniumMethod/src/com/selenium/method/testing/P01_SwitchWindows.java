package com.selenium.method.testing;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// How to handle multiple windows in Selenium?
public class P01_SwitchWindows{
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
		String mainWindow = driver.getWindowHandle(); // learn this line
		System.out.println("Main Window ID: " + mainWindow + "\n");

		// click the new Window button
		driver.findElement(By.xpath("//button[text()='New Window']")).click();
		
		// interview question:  How you handle windows parents to child? or how you can recongnize the parent and child window
		
		// Get all window handles -- include parent + child
		// why we are using set? because we don't want duplicate, and set doesn't allow duplicate
		Set <String> allWindowHandles = driver.getWindowHandles();
		System.out.println("Windows Open After Click: " + allWindowHandles.size());

		// Extract Parent and child window from all window handles
		String parent = (String) allWindowHandles.toArray()[0]; // first index: parent
		String child = (String) allWindowHandles.toArray()[1]; // second index: child 

		//	Use window handle to switch from one window to other window (parent to child)
		driver.switchTo().window(child); // switchTo() -- method is used to switch from one to another

	}
	@AfterTest
	public void tearUp() {
		driver.quit(); // this is the right place where close(), and quit() can be evaluated
	}

}