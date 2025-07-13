package com.medimention.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.medimention.pageObject.AccountPage;
import com.medimention.pageObject.CreateAccPage;
import com.medimention.pageObject.EntryPage;
import com.medimention.pageObject.HomePage;

public class TC_Registration extends BaseClass{

	@Test(groups= {"sanity"})
	public void account_Register()
	{
		CreateAccPage objcap= new CreateAccPage(driver);
		EntryPage objep= new EntryPage(driver);
		HomePage objhp= new HomePage(driver);
		Faker fake= new Faker();
		AccountPage objap=new AccountPage(driver);
		
		String pwd= fake.internet().password();
		String bussName= fake.name().fullName();
		String username= randomString()+randomNumber();
		String bussEmail= fake.internet().emailAddress();
		
		objep.homBtn();
		objhp.registerBtn();
		objcap.selectGroup();
		objcap.bloodBank();
		objcap.Bname(bussName);
		objcap.BUsername(username);
		objcap.BEmail(bussEmail);
		objcap.BPassword(pwd);
		objcap.BConfPass(pwd);
		objcap.regAgree();
		objcap.registerBtn();
		
//		System.out.println(pwd+"\t"+bussName+"\t"+username+"\t"+bussEmail);
		
		Assert.assertTrue(objap.accountHead().contains(bussName));
		Assert.assertTrue(objap.userHead().contains(username));
		
//		objap.userDrop();
//		objap.logoutBtn();
//		objhp.homeHeading();
	}
}
