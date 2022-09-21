package com.selenium.method.testing;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MountSinaiHomePageTest {
	WebDriver driver;
	MountSinaiHomePage ms;
	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\19294\\eclipse-workspace\\JavaCoding\\SeleniumMethod\\Driver\\chromedriver.exe");
		ms = new MountSinaiHomePage();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.get("https://www.mountsinai.org/");
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	@Test
	public void logoTest() {
		Assert.assertTrue(ms.verifyLogo(), "Application logo is not present...");
	}
	
	@Test
	public void titleTest() {
		String expected = "Mount Sinai Health System - New York City | Mount Sinai - New York";
		String actual = driver.getTitle();
		System.out.println("home page title is: " + actual);
		Assert.assertEquals(actual, expected, "Home Page Title doesn't match...");
	}
	
	@Test
	public void findADoctorTest() {
		ms.checkFindADoctor();
	}
	
	@Test
	public void contactNumberTest() {
		SoftAssert sa = new SoftAssert();
		ms.checkContactNumber();
		sa.assertTrue(false);
		sa.assertAll();
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}