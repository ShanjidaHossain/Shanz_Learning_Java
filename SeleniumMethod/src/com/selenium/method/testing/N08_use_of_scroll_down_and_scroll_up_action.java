package com.selenium.method.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class N08_use_of_scroll_down_and_scroll_up_action {
	WebDriver driver;
	JavascriptExecutor js;
	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\19294\\eclipse-workspace\\JavaCoding\\SeleniumMethod\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("https://www.mountsinai.org/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
	}
	@Test(enabled = true, priority = 1)
	public void scrollDownAndScrollUpTest() throws InterruptedException {
		Actions actions = new Actions(driver);
		// for Scroll Down using Actions class
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		Thread.sleep(4000);
		// for Scroll Up using Actions class
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		Thread.sleep(4000);
	}

	// 2nd way: Scroll down by JavascriptExecutor
	@Test(enabled = true, priority = 2)
	public void scrollingAmazonSiteTest() throws InterruptedException{
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.com/");
		// This will scroll down the page by 3000 pixel vertical
		Thread.sleep(4000); // used to see the scroll
		js.executeScript("window.scrollBy(0,3000)", ""); // scroll down
		// This will scroll up the page by 3000 pixel vertical
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,-3000)", ""); // scroll-up
		driver.navigate().back(); // Back to Mountsinai
		// How to refresh, getTitle by Javascript, not related with this test
		js.executeScript("history.go(0)"); // To do refresh by Javascript
		String sText = js.executeScript("return document.title;").toString(); // fetching page title by javascript
		System.out.println(sText);
	}
	
	//3rd way to do scrolling
	
	@Test(enabled = true, priority = 3)
	public void scrollingGoogleSiteTest() throws InterruptedException, AWTException{
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(5000);
		//SCROLL DOWN and up BY SELENIUM
		Robot robot = new Robot();

        // Scroll Down using Robot class
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);

        // Scroll Up using Robot class
        robot.keyPress(KeyEvent.VK_PAGE_UP);
        robot.keyRelease(KeyEvent.VK_PAGE_UP);
        
        driver.navigate().back();
        
	}
	
	

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}