package com.selenium.method.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A02_use_of_get_by_testNG {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\19294\\eclipse-workspace\\JavaCoding\\SeleniumMethod\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	
	@Test
	public void urlTest() {
		driver.get("https://www.amazon.com");
		//driver.get("https://www.google.com");
		
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
	
	
	
}
