package com.selenium.method.testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// TODO Failed: need to see a different url
public class J02_webBasedAlert {

	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\19294\\eclipse-workspace\\JavaCoding\\SeleniumMethod\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
		Thread.sleep(2000);
	}
	
	// very important interview question
	@Test (enabled = true, priority = 1)
	public void acceptAlertFromWindow() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println("The text of the Alert is: "+alert.getText()); // not part of the function, we just added to know more
		alert.accept();
		
	}
	
	@Test (enabled = true, priority = 2)
	public void dismissAlertFromWindow() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		alert.dismiss();

	}
	
	
	
	
	
	
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
	
	
	
	
}