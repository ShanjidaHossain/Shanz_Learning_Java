package com.selenium.method.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// isDisplayed() is an alternate of click()method which is boolean type
// isDisplayed() is the method used to verify the presence of a web element
// within the web page.
// Use of isDisplayed()

public class C01_use_of_isDisplayed_method {
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
	@Test (enabled=true, priority = 1)
	 public void logoTest() {
		boolean elementDisplayed=driver.findElement(By.xpath("//a[@id='cms-homepage-link']")).isDisplayed();
		System.out.println("Is the logo displayed? Ans: "+elementDisplayed);
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}