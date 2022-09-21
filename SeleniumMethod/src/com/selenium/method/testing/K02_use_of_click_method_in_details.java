package com.selenium.method.testing;

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

public class K02_use_of_click_method_in_details {
	WebDriver driver;
	JavascriptExecutor js;
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\19294\\eclipse-workspace\\JavaCoding\\SeleniumMethod\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver; // casting JavascriptExecutor
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://portaldev.cms.gov/portal/");
	}
	
	@Test (priority = 1)
	public void loginButtonTest01() throws InterruptedException {
		driver.findElement(By.id("cms-login-submit")).click();
		Thread.sleep(4000);
	}
	
	// alternative of above function
	// But follow the next one, why not this one, because when you use xpath, it doesn't execute
	@Test (priority = 2)
	public void loginButtonTest02() throws InterruptedException {
		js.executeScript("document.getElementById('cms-login-submit').click();");
		Thread.sleep(4000);
	}
	
	// "arguments[0].click()" --- easy to memorize, memorize it
	// follow this one, because you can use any kind of locator
	// alternative to click an web element or how to find a hidden web element-- very important interview question 
	@Test (priority = 3)
	public void loginButtonTest03() throws InterruptedException {
		WebElement loginButton = driver.findElement(By.xpath("//button[@id='cms-login-submit']"));
		js.executeScript("arguments[0].click()", loginButton);
		Thread.sleep(4000);
	}
	
	@Test (priority = 4)
	public void loginButtonTest04() {
		driver.findElement(By.id("cms-login-submit")).sendKeys(Keys.ENTER);
	}
	
	@Test (priority = 5)
	public void loginButtonTest05() {
		driver.findElement(By.id("cms-login-submit")).sendKeys(Keys.RETURN);
	}
	// Keys.TAB -- also work
	
	// until line 60, fine
	// if you are crazy like me , see below
	
	
	
	
	
	
	// From here till end, this is high level, so just see, don't take them seriously
	// alternative to click an web element in many ways (never memorize, a collection of code)
	@Test(priority = 6)
	public void homepageLoginButtonTest06() {
		Actions actions = new Actions(driver);
		WebElement homepageLoginButton = driver.findElement(By.xpath("//button[@id='cms-login-submit']"));
		actions.click(homepageLoginButton).perform();
	}
	
	@Test(priority = 7)
	public void homepageLoginButtonTest07() {
		Actions actions = new Actions(driver);
		WebElement homepageLoginButton = driver.findElement(By.xpath("//button[@id='cms-login-submit']"));
		actions.moveToElement(homepageLoginButton).click().perform();
	}

	@Test(priority = 8)
	public void homepageLoginButtonTest08() {
		Actions actions = new Actions(driver);
		WebElement homepageLoginButton = driver.findElement(By.xpath("//button[@id='cms-login-submit']"));
		actions.clickAndHold(homepageLoginButton).release().perform();
	}

	@Test(priority = 9)
	public void homepageLoginButtonTest09() {
		Actions actions = new Actions(driver);
		WebElement homepageLoginButton = driver.findElement(By.xpath("//button[@id='cms-login-submit']"));
		actions.sendKeys(homepageLoginButton, Keys.RETURN).perform();
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}


}