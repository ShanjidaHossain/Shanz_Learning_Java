package com.selenium.method.testing;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class O02_use_of_double_click_action {

	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\19294\\eclipse-workspace\\JavaCoding\\SeleniumMethod\\Driver\\chromedriver.exe");
		// WebDriver is an interface and ChromeDriver is a concrete class
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15000));
	}

	@Test(enabled = true, priority = 1)
	public void doubleClickActionTest() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement dc = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		actions.doubleClick(dc).build().perform(); // learning form this page
		Thread.sleep(4000);
		// This is not relevant with this feature, this is extra
		// Switch to the alert box and click on OK button
		Alert alert = driver.switchTo().alert();
		System.out.println("\nAlert Text:>>> " + alert.getText());
		alert.accept();
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
