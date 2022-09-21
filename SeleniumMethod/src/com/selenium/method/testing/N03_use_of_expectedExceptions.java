package com.selenium.method.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.TimeBombSkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class N03_use_of_expectedExceptions {
	WebDriver driver;
	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\19294\\eclipse-workspace\\JavaCoding\\SeleniumMethod\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mountsinai.org/");
		Thread.sleep(2000);
	}	
	@Test
	public void testNGExceptionTest1() {
		System.out.println("We can verify whether a code throws the expected exception or not. Here it will fail");
		int i = 1 / 0;
	}	
	@Test(expectedExceptions = ArithmeticException.class)
	public void testNGExceptionTest2() {
		System.out.println(
				"We can verify whether a code throws the expected exception or not. Here it will pass as expected exception is put");
		int i = 1 / 0;
	}	
	@Test(expectedExceptions = NoSuchElementException.class)
	public void sameDayTest(){
		driver.findElement(By.xpath("//span[text()='Same-Day' and @class='hpcards__container--content--title']")).click();
	}
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}