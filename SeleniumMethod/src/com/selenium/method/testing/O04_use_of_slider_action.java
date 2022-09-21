package com.selenium.method.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class O04_use_of_slider_action {
    // not so common in interview
	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\19294\\eclipse-workspace\\JavaCoding\\SeleniumMethod\\Driver\\chromedriver.exe");
		// WebDriver is an interface and ChromeDriver is a concrete class
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/slider/");
		Thread.sleep(2000);
	}
	// not so important
	@Test(enabled = true, priority = 1)
	public void sliderActionTest() throws InterruptedException {
		// Instantiate Action Class
		Actions actions = new Actions(driver);
		// Retrieve WebElemnt 'slider' to perform mouse hover
		WebElement slider = driver.findElement(By.id("sliderValue"));
		// Move mouse to x offset 50 i.e. in horizontal direction
		Thread.sleep(10);
		// to test the slider is working or not
		actions.moveToElement(slider, 50, 0).perform(); // learn from here
		Thread.sleep(10);
		//slider.click();
		System.out.println("Moved slider in horizontal directions");
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
