package com.selenium.method.testing;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// Alert should be discussed before it
// The below web site also have same feature to practice
// https://chercher.tech/practice/practice-pop-ups-selenium-webdriver
public class N09_use_of_right_click_action {

	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\19294\\eclipse-workspace\\JavaCoding\\SeleniumMethod\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
				
	}
	
	@Test(enabled = true, priority = 1)
	public void rightClickAction() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement rc = driver.findElement(By.xpath("//span[text()='right click me']"));
		actions.moveToElement(rc).contextClick().build().perform(); // to do the right click, contextClick() is used
		
		// Below 2 is not relevant to right click, just doing some some extra, which we know already
		// Next: I want to click on Edit link on the displayed menu options
		WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
		Thread.sleep(5000);
		edit.click(); // a regular click , not a right click
		Thread.sleep(5000);
		
		// Switch to the alert box and click on OK button
		Alert alert = driver.switchTo().alert();
		System.out.println("\nAlert Text:" + alert.getText());
		alert.accept();	
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}