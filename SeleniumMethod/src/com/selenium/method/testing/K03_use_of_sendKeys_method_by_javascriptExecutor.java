package com.selenium.method.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class K03_use_of_sendKeys_method_by_javascriptExecutor {
	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\19294\\eclipse-workspace\\JavaCoding\\SeleniumMethod\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
	}
	// Regular way to click a submit button to search something	
	@Test (enabled=true, priority = 1)
	public void searchAProductTest01() throws InterruptedException{		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
		Thread.sleep(3000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		System.out.println("Current URL is: "+driver.getCurrentUrl());
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPad");
		Thread.sleep(3000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		Thread.sleep(3000);
	}
	
	// click submit button by Enter key from keyboard	
	@Test (enabled=true, priority = 2)
	public void searchAProductTest02() throws InterruptedException{		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop", Keys.ENTER);
		Thread.sleep(3000);
		System.out.println("Current URL is: "+driver.getCurrentUrl());
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPad", Keys.RETURN);
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell XPS 15", Keys.TAB);
		Thread.sleep(3000);
		
	}
	
	// Alternative of sending value in text field --- By using JavascriptExecutor 01
	// TODO Failed, have to look again. doom is not loading
	@Test(enabled = true, priority = 3)
	public void searchItemByclickingSearchButtonTest02() throws InterruptedException {
		WebElement searchField = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Macbook' ", searchField);
		Thread.sleep(4000);
		js.executeAsyncScript("arguments[0].click()", searchButton);
		Thread.sleep(4000);
	}

	// Alternative of sending value in text field --- By using JavascriptExecutor 02
	// Use above one, this one I don't like
	// because using xpath is difficult
	@Test(enabled = true, priority = 4)
	public void searchItemByclickingSearchButtonTest03() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('twotabsearchtextbox').value = 'iPad';");
		Thread.sleep(4000);
		js.executeScript("document.getElementById('nav-search-submit-button').click();");
		Thread.sleep(4000);
	}

	
	
	
	
		
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}