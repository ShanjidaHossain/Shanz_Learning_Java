package com.selenium.method.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D06_use_of_getAttribute_method {
	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\19294\\eclipse-workspace\\JavaCoding\\SeleniumMethod\\Driver\\chromedriver.exe");
		// WebDriver is an interface and ChromeDriver is a concrete class
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.mountsinai.org/");
		Thread.sleep(4000);
	}

	// an extra example, nothing to learn from here
	@Test(enabled = true, priority = 1)
	public void getAttributeTest() {
		WebElement value = driver.findElement(By.xpath("//a[normalize-space(text())='Our Locations' and @class='hidden-xs dropdown']"));
		System.out.println("\nThe value of the Attribute is: "+ value);
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}