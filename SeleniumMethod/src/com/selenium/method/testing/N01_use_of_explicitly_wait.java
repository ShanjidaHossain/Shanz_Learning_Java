package com.selenium.method.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class N01_use_of_explicitly_wait {
	WebDriver driver;
	WebDriverWait wait;
		
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\19294\\eclipse-workspace\\JavaCoding\\SeleniumMethod\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.get("https://www.mountsinai.org/");
	}
	
	@Test
	public void requestAnAppointmentTest() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), 'Request an Appointment') and @class='hidden-xs dropdown']"))).click();
		driver.findElement(By.xpath("(//input[@name='name'])[2]")).sendKeys("Andrea Perez", Keys.RETURN);
		Thread.sleep(2000);
		Assert.assertTrue(true);
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}