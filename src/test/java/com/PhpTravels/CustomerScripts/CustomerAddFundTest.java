package com.PhpTravels.CustomerScripts;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PhpTravels.constants.AutomationConstants;
import com.PhpTravels.customerpages.CustomerAddFund;
import com.PhpTravels.customerpages.CustomerLoginPage;


public class CustomerAddFundTest extends TestBase {
	CustomerAddFund objFund;
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

	public void checkMyfunds() throws IOException, InterruptedException {
		
		objFund= new CustomerAddFund(driver);		
		objFund.clickDashBoard();
		
		Thread.sleep(6000);
		String actualurl= "https://www.phptravels.net/payment/paypal";	 
		  String expectedUrl= driver.getCurrentUrl(); 
		Assert.assertEquals(expectedUrl,actualurl);

	}
	

}
