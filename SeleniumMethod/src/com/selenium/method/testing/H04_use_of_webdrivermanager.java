package com.selenium.method.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class H04_use_of_webdrivermanager {
	// Important interview question
	WebDriver driver;
// Not working, leave it for now.
	@BeforeTest
	
	
	
	// Tried with extra 6 jars but http client is not working.
	// better try during automation framework
	
	
	
	public void setUp() throws InterruptedException {	
		// if you choose version, then it will use that specific version
		// if you don't use driverVersion() method, it will open the most updated version
		// WebDriverManager.chromedriver().driverVersion("96.0.4664.110").setup();
		//WebDriverManager.chromedriver().setup();
		// Because of webDriverManager, we don't need to use system.setProperty()
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