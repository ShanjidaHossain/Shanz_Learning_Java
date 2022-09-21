package com.selenium.method.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// isEnabled() is the method used to verify if the web element is enabled or
// disabled within the web page. isEnabled() is primarily used with buttons.
// Use of isEnabled(), a boolean type method

public class C02_use_of_isEnabled_method {
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
	
	// if there is a no priority, which one will run first? -- Alphabetically
	@Test (enabled=true, priority = 2)
	 public void newUserRegistrationTest() {
		boolean buttonEnabled=driver.findElement(By.xpath("//a[text()='New User Registration']")).isEnabled();
		System.out.println("Is the  New User Registration Button Enable? Ans: "+buttonEnabled);
	}
	
	@Test (enabled=true, priority = 1)
	public void loginButtonTest() throws InterruptedException{
		boolean loginEnabled =	driver.findElement(By.id("cms-login-submit")).isEnabled();
		System.out.println("Is the Login Button Enable? Ans: "+loginEnabled);
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}