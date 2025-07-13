package com.medimention.testCases;

import org.openqa.selenium.StaleElementReferenceException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.medimention.pageObject.AccountPage;
import com.medimention.pageObject.CreateAccPage;
import com.medimention.pageObject.EntryPage;
import com.medimention.pageObject.HomePage;
import com.medimention.utilities.DataProviders;

public class TC_Registration_DDT extends BaseClass{

	@Test(dataProvider="RegisterData", dataProviderClass= DataProviders.class, expectedExceptions= {StaleElementReferenceException.class})
	public void account_Register(String B_Name, String username, String email, String password, String confpassword) throws InterruptedException
	{
		CreateAccPage objcap= new CreateAccPage(driver);
		EntryPage objep= new EntryPage(driver);
		HomePage objhp= new HomePage(driver);
//		Faker fake= new Faker();
		AccountPage objap=new AccountPage(driver);
		
//		String pwd= fake.internet().password();
//		String bussName= fake.name().fullName();
//		String username= randomString()+randomNumber();
//		String bussEmail= fake.internet().emailAddress();
		
		objep.homBtn();
		objhp.registerBtn();
		objcap.selectGroup();
		objcap.bloodBank();
		objcap.Bname(B_Name);
		objcap.BUsername(username);
		objcap.BEmail(email);
		objcap.BPassword(password);
		objcap.BConfPass(confpassword);
		objcap.regAgree();
		objcap.registerBtn();
		
		System.out.println(B_Name+"\t"+username+"\t"+password+"\t"+email);
		
		boolean bn=objap.accountHead().contains(B_Name);
		boolean hn= objap.userHead().contains(username);
//		Assert.assertTrue(objap.accountHead().contains(B_Name));
//		Assert.assertTrue(objap.userHead().contains(username));
		
		Thread.sleep(2000);
		objap.userDrop();
		objap.logoutBtn();
		objhp.homeHeading();
	}
}
