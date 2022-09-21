package com.selenium.method.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// not so much used but you keep it as a source of knowledge
public class B11_use_of_click_method_by_cssSelector_locator {
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

	// cssSelector by another attribute
	// --> first html tag, then#, then value of ID, Then [attribute name='value'] inside the string
	@Test (enabled = true, priority = 1)
	public void loginButtonTest(){
		driver.findElement(By.cssSelector("button#cms-login-submit[name='Submit Login']")).click();
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
	/*
	 SUB-STRING MATCHES:
     CSS in Selenium has an interesting feature of allowing partial string matches using ^, $, and *.
     https://www.softwaretestingmaterial.com/css-selector-selenium-webdriver-tutorial/
	 */

}