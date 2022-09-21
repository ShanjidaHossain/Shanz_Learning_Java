package com.selenium.method.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class I03_dropdown_selectByValue_method {

	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\19294\\eclipse-workspace\\JavaCoding\\SeleniumMethod\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
	}

	// drop down is a commonly asked interview question
	// use method --> selectByValue()
	@Test
	public void selectByVisibleTextTest() throws InterruptedException {
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select select = new Select(dropdown);
		select.selectByValue("10542");
		Thread.sleep(5000);
	}
	// TODO I want to print the outcome Nasir


	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}