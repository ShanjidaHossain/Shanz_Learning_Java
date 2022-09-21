package com.selenium.method.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class E02_use_of_sendKeys_method_and_click_submit_and_then_clear {
	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\19294\\eclipse-workspace\\JavaCoding\\SeleniumMethod\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
	}
	// Regular way to click a submit button to search something	
	@Test (enabled=true, priority = 1)
	public void searchAProductTest() throws InterruptedException{		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
		Thread.sleep(3000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		System.out.println("Current URL is: "+driver.getCurrentUrl());
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPad");
		Thread.sleep(3000);
		driver.findElement(By.id("nav-search-submit-button")).click();
	}
		
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}