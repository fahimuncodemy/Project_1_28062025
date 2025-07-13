package com.medimention.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[text()='Join Us']")
	@CacheLookup
	WebElement regBtn;
	
	@FindBy(linkText="Login")
	@CacheLookup
	WebElement logBtn;
	
	@FindBy(xpath="//span[@class='user-info']")
	@CacheLookup
	WebElement cityBtn;
	
	@FindBy(xpath="//a[@class='navbar-brand']")
	@CacheLookup
	WebElement homeHead;
	
	public void registerBtn()
	{
		regBtn.click();
	}
	
	public void loginBtn()
	{
		logBtn.click();
	}
	
	public void homeHeading()
	{
		homeHead.click();
	}
}
