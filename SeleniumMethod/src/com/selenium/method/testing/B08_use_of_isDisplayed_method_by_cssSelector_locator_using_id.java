package com.selenium.method.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B08_use_of_isDisplayed_method_by_cssSelector_locator_using_id {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\19294\\eclipse-workspace\\JavaCoding\\SeleniumMethod\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://portal.cms.gov/portal/");
		
	}
	
	// first HTML tag, then #, then write the value of the id inside the string
	@Test(enabled = true, priority = 1)
	public void loginButtonTest() throws InterruptedException {
		driver.findElement(By.cssSelector("button#cms-login-submit")).isDisplayed();
		Thread.sleep(5000);// not part of test.. just for us to see the action
		
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
	
	
	
}
