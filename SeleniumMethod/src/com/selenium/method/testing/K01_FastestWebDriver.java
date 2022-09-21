package com.selenium.method.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class K01_FastestWebDriver {
	// clicking New User Registration button
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\19294\\eclipse-workspace\\JavaCoding\\SeleniumMethod\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions(); // FirefoxOptions for Firefox headless
		options.addArguments("--headless");	// also we can run in incognito	
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://portaldev.cms.gov/portal/");
		Thread.sleep(4000);	
		driver.findElement(By.xpath("//a[text()='New User Registration']")).click();
		Thread.sleep(5000);
		System.out.println("The Current URL is: "+driver.getCurrentUrl());	
		driver.quit();
	}
}