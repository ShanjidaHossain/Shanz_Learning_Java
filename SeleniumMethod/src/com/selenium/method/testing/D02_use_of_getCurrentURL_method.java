package com.selenium.method.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D02_use_of_getCurrentURL_method {
	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\19294\\eclipse-workspace\\JavaCoding\\SeleniumMethod\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://portaldev.cms.gov/portal/");
		Thread.sleep(4000);
	}

	@Test(enabled = true, priority = 1)
	public void currentURLTest() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='New User Registration']")).click();
		Thread.sleep(5000);
		System.out.println("The Current URL is: " + driver.getCurrentUrl());
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}