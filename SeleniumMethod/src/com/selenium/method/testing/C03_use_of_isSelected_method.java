package com.selenium.method.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// isSelected(), isEnabled(), isDisplayed() -- important interview question
// isSelected() is the method used to verify if the web element is selectable or
// not. isSelected() method is predominantly used with radio buttons, dropdowns
// and checkboxes.

public class C03_use_of_isSelected_method {
	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\19294\\eclipse-workspace\\JavaCoding\\SeleniumMethod\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.get("https://olui2.fs.ml.com/login/signin.aspx");
		Thread.sleep(4000);
	}
	
	// By default check box is not selected, so outcome is false
	@Test (enabled=true, priority = 1)
	public void loginButtonTest(){
		boolean checkBox =	driver.findElement(By.xpath("//input[@id='saveOnlineID']")).isSelected();
		System.out.println("Is the check Box Selected? Ans: "+checkBox);
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}