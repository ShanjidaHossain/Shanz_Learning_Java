package com.selenium.method.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B10_use_of_click_method_by_cssSelector_locator_not_common_way02 {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\19294\\eclipse-workspace\\JavaCoding\\SeleniumMethod\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://portal.cms.gov/portal/");
	}
	
	// first HTML tag, then [attribute name = 'value'], inside the string
	@Test(enabled = true, priority = 1)
	public void loginButtonTest() throws InterruptedException {
		driver.findElement(By.cssSelector("button[name='Submit Login']")).click();
		Thread.sleep(5000);// not part of test.. just for us to see the action
		
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
	
	
	
}
