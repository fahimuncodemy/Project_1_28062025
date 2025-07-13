package com.medimention.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CreateAccPage extends BasePage{

	WebDriver driver;
	
	public CreateAccPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//button[@data-id='UserRole']")
	@CacheLookup
	WebElement groupBtn;
	
	@FindBy(xpath="//span[text()='Blood Bank']")
	@CacheLookup
	WebElement bbOpt;
	
	@FindBy(id="DetailName")
	@CacheLookup
	WebElement bbName;
	
	@FindBy(id="UserUsername")
	@CacheLookup
	WebElement bbUsername;
	
	@FindBy(name="data[User][Email]")
	@CacheLookup
	WebElement bbUserEmail;
	
	@FindBy(id="UserPassword")
	@CacheLookup
	WebElement bbUserPassword;
	
	@FindBy(id="UserPassword1")
	@CacheLookup
	WebElement bbConfPassword;
	
	@FindBy(name="terms")
	@CacheLookup
	WebElement regAgreement;
	
	@FindBy(xpath="//span[text()='Register']")
	@CacheLookup
	WebElement regisBtn;
	
	public void selectGroup()
	{
		groupBtn.click();
	}
	
	public void bloodBank()
	{
		bbOpt.click();
	}
	
	public void Bname(String name)
	{
		bbName.sendKeys(name);
	}
	
	public void BUsername(String username)
	{
		bbUsername.sendKeys(username);
	}
	
	public void BEmail(String email)
	{
		bbUserEmail.sendKeys(email);
	}
	
	public void BPassword(String password)
	{
		bbUserPassword.sendKeys(password);
	}
	
	public void BConfPass(String password)
	{
		bbConfPassword.sendKeys(password);
	}
	
	public void regAgree()
	{
		regAgreement.click();
	}
	
	public void registerBtn()
	{
		regisBtn.click();
	}
}
