package com.PhpTravels.CustomerScripts;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PhpTravels.constants.AutomationConstants;
import com.PhpTravels.customerpages.CustomerDashBoard;
import com.PhpTravels.customerpages.CustomerLoginPage;
import com.PhpTravels.customerpages.CustomerProfile;


public class CustomerProfileTest extends TestBase {
	CustomerProfile  objProf;
	CustomerDashBoard objDash;
	CustomerLoginPage objLogin;
	
	@Test(priority = 0)

	public void verifyValidLogin() throws IOException, InterruptedException {
		
		objLogin = new CustomerLoginPage(driver);
		 String username = "user@phptravels.com";
		 String password = "demouser";

	
		objLogin.setUserName(username);
		objLogin.setPassword(password);
		objLogin.clickLogin();
		
	
		String actualurl= AutomationConstants.LoginURL;		 
		  String expectedUrl= driver.getCurrentUrl(); 
		Assert.assertEquals(expectedUrl,actualurl);
		
		Thread.sleep(5000);
	}
	@Test(priority = 1)
	public void checkProfile() throws InterruptedException
	{
		objDash= new CustomerDashBoard(driver);
		objDash.clickmyProfile();
	}
	@Test(priority = 2)
	public void updateProfile()
	{
		objProf = new CustomerProfile (driver);
		 
		 String address1 = "Gopuran House', Koratty Po ,Pin 123456";
		 String address2 = "Anchery House, Thalore PO ,Pin234567";
		 objProf.setAddress1(address1);
		 objProf.setAddress2(address2);
		 
		 try {
			objProf.updateProfile();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
	


