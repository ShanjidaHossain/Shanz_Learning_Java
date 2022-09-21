package com.selenium.method.testing;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class G_use_of_manage_by_driver {
	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\19294\\eclipse-workspace\\JavaCoding\\SeleniumMethod\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	// TODO why url is opening first and then maximize? need to know
	// maximize() method
	@Test(enabled = false, priority = 1)
	public void maximizeWindowTest() {		
		driver.get("https://www.mountsinai.org/");
		driver.manage().window().maximize();
	}
	
	// fullscreen() method
	@Test(enabled = false, priority = 2)
	public void fullScreenWindowTest() throws InterruptedException {		
		driver.get("https://www.amazon.com/");			
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
	}
	
	// getSize() method in px (pixel)
	@Test(enabled = false, priority = 3)
	public void sizeOfWindowTest() throws InterruptedException {		
		driver.get("https://www.bestbuy.com/");			
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		System.out.println("The size of the screen is: "+ driver.manage().window().getSize());
		
	}
	
	// deleteAllCookies() method
	@Test(enabled = false, priority = 4)
	public void deleteCookies() {
		driver.manage().window().maximize();		
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");		
	}
	
	/*
	 // not so important
	 // TODO THIS ONE later (Boby)
	@Test(enabled = true, priority = 5)
	public void waitForWindow() throws InterruptedException {
		driver.manage().window().maximize();	
		driver.manage().window().wait(3000, 0);
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");		
	}
	*/
	
	// Very important interview question
	// full screen size: (1440, 900) for Tofael, it may vary by the size of the screen
	@Test(enabled = false, priority = 6)
	public void setASpecificSizeOfWindow() throws InterruptedException {
		Dimension dimension = new Dimension(700, 500); // choose any size in the range of (1440, 900)
		driver.manage().window().setSize(dimension);
		driver.manage().deleteAllCookies();
		driver.get("https://www.cvs.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().window().setSize(dimension);
		Thread.sleep(5000);
	}
	
	// TODO FAILING, NEED to see later, Nasir
	@SuppressWarnings("deprecation")
	@Test(enabled = true, priority = 7)
	public void pageLoadTimeoutForWindow() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.get("https://www.costco.com");
	}
	
	// not so important
	// TODO for asynchronous behavior, need to explain more. Nasir
	@SuppressWarnings("deprecation")
	@Test(enabled = false, priority = 8)
	public void setScriptTimeoutForWindow() {
        driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(15));
		driver.get("https://www.ebay.com");		

	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}