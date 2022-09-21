package com.selenium.method.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B_use_of_the_get_method {
	
	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\19294\\eclipse-workspace\\JavaCoding\\SeleniumMethod\\Driver\\chromedriver.exe");
		// WebDriver is an interface and ChromeDriver is a concrete class
		driver = new ChromeDriver();
		driver.get("https://portaldev.cms.gov/portal/");
		Thread.sleep(4000);
	}


	@Test
	public void loginButtonTest() {
		driver.findElement(By.id("cms-login-submit")).click();

	}
	
	

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
