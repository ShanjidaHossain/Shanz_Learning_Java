package com.selenium.method.testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B06_use_of_click_method_by_cssSelector_locator_using_class {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\19294\\eclipse-workspace\\JavaCoding\\SeleniumMethod\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://portal.cms.gov/portal/");
		
	}
	
	@Test
	public void newUserRegistrationTest() throws InterruptedException {
		driver.findElement(By.cssSelector("a.cms-newuser-reg")).click();
		Thread.sleep(5000);// not part of test.. just for us to see the action
		
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
	
	
	
}
