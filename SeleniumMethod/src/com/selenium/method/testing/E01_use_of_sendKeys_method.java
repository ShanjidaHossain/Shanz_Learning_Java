package com.selenium.method.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class E01_use_of_sendKeys_method {
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
	
	
	@Test (enabled=true, priority = 1)
	public void userIdTest() throws InterruptedException{
		driver.findElement(By.xpath("//input[@id='cms-login-userId']")).sendKeys("p2ph1test_ms497");
		Thread.sleep(5000);
	}
	
	// TODO: Nasir
	@Test (enabled=true, priority = 3)
	public void searchFieldTest() throws InterruptedException{
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
		Thread.sleep(5000);
	}
	
	@Test (enabled=true, priority = 2)
	public void passwordTest() throws InterruptedException{
		driver.findElement(By.xpath("//input[@id='cms-login-password']")).sendKeys("Password@12");
		Thread.sleep(5000);
	}
	
	
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}