package com.medimention.pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class EntryPage extends BasePage{

	WebDriver driver;
	
	public EntryPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[text()='Home']")
	@CacheLookup
	WebElement btnHome;
	
	@FindBy(xpath="//a[text()='About']")
	@CacheLookup
	WebElement btnAbout;
	
	@FindBy(xpath="//ul[contains(@class, 'menu-right')]//a")
	@CacheLookup
	List<WebElement> btnmenu;
	
//	public void homBtn()
//	{
//		btnHome.click();
//	}
	public void homBtn()
	{
		btnmenu.get(0).click();
	}
	
	public void AboBtn()
	{
		btnmenu.get(1).click();
	}
	
	public void feaBtn()
	{
		btnmenu.get(2).click();
	}
	
	public void botBtn()
	{
		btnmenu.get(3).click();
	}
}
