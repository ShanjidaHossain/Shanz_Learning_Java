package com.selenium.method.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D01_use_of_getTitle_method {
	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\19294\\eclipse-workspace\\JavaCoding\\SeleniumMethod\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://portaldev.cms.gov/portal/");
		Thread.sleep(4000);
	}
	// how can you find the title of the page?
	// right click on an empty place-- view page source -- ctrl+f (to find) -- Type
	// title

	@Test(enabled = true, priority = 1)
	public void titleTest() {
		System.out.println("The Title of the page is: "+driver.getTitle());
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}