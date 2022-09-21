package com.selenium.method.testing;

import java.util.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class O01_use_of_findElements {
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
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15000));
	}
	
	@Test 
	public void mouseHoverActionOnAboutUsTest() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement aboutUs = driver.findElement(By.xpath("//a[contains(text(), 'About Us') and @class='hidden-xs dropdown']"));
		actions.moveToElement(aboutUs).build().perform();
		Thread.sleep(6000);
		System.out.println("\nThe text of this web element is: "+ aboutUs.getText());
		List <WebElement> list = driver.findElements(By.xpath("//a[contains(text(), 'About Us')]////following-sibling::div//child::div//child::div"));
		int totalCount = list.size(); 
		System.out.println("Number of web Elements: "+totalCount); //TODO Nasir, why count is 1
		for(int i=0; i<totalCount; i++) {
			System.out.println(list.get(i).getText());
		}
	
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}