package com.selenium.method.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class O05_AuthenticationPopUp {
	ChromeDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\19294\\eclipse-workspace\\JavaCoding\\SeleniumMethod\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String userName = "admin";
		String password = "admin";
		// adding user name, password with URL
		String url = "https://" + userName + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth"; // learn this line, important interview question
		driver.get(url);		
	}
	
	@Test (enabled = true, priority = 1)
	public void authenticationPopUpTest() throws InterruptedException {
		Thread.sleep(5000);
		// identify and get text after authentication of popup
		String t = driver.findElement(By.tagName("p")).getText(); // we use tag name as a locator in our course
		System.out.println("Text is: " + t);
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
