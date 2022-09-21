package com.selenium.method.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MountSinaiHomePage {
	WebDriver driver;
	
	// most common way to represent the web element
	@FindBy(xpath = "//img[@alt='Mount Sinai']")
	public static WebElement logo;
	
	@FindBy(xpath = "//a[contains(text(), 'Find a Doctor') and @class='hidden-xs dropdown']")
	public WebElement findADoctor;
	
	// another way to write
	By requestAnAppointment = By.xpath("//a[contains(text(), 'Request an Appointment') and @class='hidden-xs dropdown']");
	
	// Toughest way: you need to recognize if used in the office	
	@FindBy (how = How.XPATH, using = "(//span[text()='1-800-MD-SINAI'])[1]")
	public WebElement contactNumber;
	
	

	public boolean verifyLogo() {
		boolean flag = logo.isDisplayed();
		System.out.println(flag);
		return flag;
	}
	
	public void checkFindADoctor() {
		findADoctor.click();
	}
	
	public void checkRequestAnAppointment() {
		driver.findElement(requestAnAppointment).click();
	}
	
	public void checkContactNumber() {
		contactNumber.click();
	}
	
	
	

}