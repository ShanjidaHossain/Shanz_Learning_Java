package com.selenium.method.testing;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class N05_use_of_SkipException {
	WebDriver driver;
	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\19294\\eclipse-workspace\\JavaCoding\\SeleniumMethod\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mountsinai.org/");
		Thread.sleep(2000);
	}
	
	
	@Test(enabled = true, groups = { "functionalTest" })
	public void skipHomePageTitleTest() {
		String title = "Mount Sinai Health System - New York City | Mount Sinai - New York";
		if (title.equals(driver.getTitle())) {
			throw new SkipException("Skipping -- as the title matches as expected");
		} else {
			System.out.println("Home Page Title doesn't match...");
		}
		System.out.println("I am out of the if else condition");
	}	
	
	
	@Test(enabled = true, groups = { "functionalTest" })
	public void nonSkipHomePageTitleTest() {
		String expected = "Mount Sinai Health System - New York City | Mount Sinai - New York";
		String actual = driver.getTitle();
		System.out.println("home page title is: " + actual);
		Assert.assertEquals(actual, expected, "Home Page Title doesn't match...");	
		System.out.println("No need to skip the test");
	}	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}