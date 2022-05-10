package com.PhpTravels.SupplierScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PhpTravels.SupplierPages.SupplierLogin;
import com.PhpTravels.SupplierPages.SupplierRevenue;
import com.PhpTravels.constants.AutomationConstants;
import com.PhpTravels.customerpages.SupplierBackEnd;

public class SupplierRevenueTest extends TestBase3 {
	SupplierRevenue objRevenue;
	SupplierLogin objLogin;

	@Test(priority = 0)

	public void verifyValidLogin() throws IOException, InterruptedException {
		
		objLogin = new SupplierLogin(driver);
		 String username = "supplier@phptravels.com";
		 String password = "demosupplier";

	
		objLogin.setUserName(username);
		objLogin.setPassword(password);
		objLogin.clickLogin();
		
	
		String actualurl= AutomationConstants.LoginsSpplier;		 
		  String expectedUrl= driver.getCurrentUrl(); 
		Assert.assertEquals(expectedUrl,actualurl);
		
		Thread.sleep(5000);
	}
	
	 @Test(priority=1)
	 public void VerifyRevenuebreakdown() throws IOException, InterruptedException {
		 
		 objRevenue =new SupplierRevenue(driver);
		 
		 boolean Flag= objRevenue.dashboardchart();
		 Assert.assertTrue(Flag);
		 Thread.sleep(5000);
	 }
}
