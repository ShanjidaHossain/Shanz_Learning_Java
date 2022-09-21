package com.selenium.method.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class H01_use_of_chrome_driver {
	// Important interview question
	ChromeDriver driver;

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

	@Test
	public void loginButtonTest() throws InterruptedException{
		driver.findElement(By.id("cms-login-submit")).click();
		Thread.sleep(8000); 
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}