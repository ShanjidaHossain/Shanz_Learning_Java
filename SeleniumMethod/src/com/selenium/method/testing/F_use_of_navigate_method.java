package com.selenium.method.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class F_use_of_navigate_method {
	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\19294\\eclipse-workspace\\JavaCoding\\SeleniumMethod\\Driver\\chromedriver.exe");
		// WebDriver is an interface and ChromeDriver is a concrete class	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.get("https://portaldev.cms.gov/portal/");
		Thread.sleep(4000);
	}

	// what is the alternate method of get(), ans: navigate().to()
	@Test (enabled = true, priority = 1)
	public void navigationTest(){
		driver.navigate().to("https://www.amazon.com");
		driver.navigate().back(); // CMS
		driver.navigate().forward(); // Amazon
		driver.navigate().refresh(); // Amazon
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
	
}