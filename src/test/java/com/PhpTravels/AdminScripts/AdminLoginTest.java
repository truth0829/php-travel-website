package com.PhpTravels.AdminScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PhpTravels.Adminpages.AdminLogin;

import com.PhpTravels.constants.AutomationConstants;

public class AdminLoginTest extends TestBase2 {
	AdminLogin objLogin;
	

	@Test(priority = 3)

	public void verifyValidLogin() throws IOException, InterruptedException {
		
		objLogin = new AdminLogin(driver);
		 String username ="admin@phptravels.com";
		 String password ="demoadmin";
 
	
		objLogin.setUserName(username);
		objLogin.setPassword(password);
		objLogin.clickLogin();
		Thread.sleep(5000);
	
		String actualurl= "Dashboard";	 
		  String expectedUrl= driver.getTitle();
		Assert.assertEquals(expectedUrl,actualurl);
		
		Thread.sleep(5000);
	}
	@Test(priority = 0)

	public void ValidLoginWithInvalidUserName() throws IOException, InterruptedException {
		
		objLogin = new AdminLogin(driver);
		//Reporter.log("---objlog Login-1.Selct icon--", true);
		 String username = "user@ph.com";
		 String password = "demoadmin";

	
		objLogin.setUserName(username);
		objLogin.setPassword(password);
		objLogin.clickLogin();
		
	
		String actualurl= AutomationConstants.LoginAdminFailed;	 
	    String expectedUrl= driver.getCurrentUrl(); 
		Assert.assertEquals(expectedUrl,actualurl);
		Thread.sleep(5000);

		
	}
	@Test(priority = 2)

	public void ValidLoginWithInvalidUserAndInvalidPassword() throws IOException, InterruptedException {
		
		objLogin = new AdminLogin(driver);
		 String username = "user@phpt.com";
		 String password = "deo";

	
		objLogin.setUserName(username);
		objLogin.setPassword(password);
		objLogin.clickLogin();
		
	
		String actualurl= AutomationConstants.LoginAdminFailed;		 
		  String expectedUrl= driver.getCurrentUrl(); 
		Assert.assertEquals(expectedUrl,actualurl);
		Thread.sleep(5000);

	}
	
	@Test(priority = 1)

	public void ValidLoginWithInvalidpassword() throws IOException, InterruptedException {
		
		objLogin = new AdminLogin(driver);
		 String username = "admin@phptravels.com";
		 String password = "demo";

	
		objLogin.setUserName(username);
		objLogin.setPassword(password);
		objLogin.clickLogin();
		
	
		String actualurl= AutomationConstants.LoginAdminFailed;		 
		  String expectedUrl= driver.getCurrentUrl(); 
		Assert.assertEquals(expectedUrl,actualurl);
		Thread.sleep(5000);

	}


}
