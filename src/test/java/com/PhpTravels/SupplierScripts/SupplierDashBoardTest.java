package com.PhpTravels.SupplierScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PhpTravels.SupplierPages.SupplierDashBoard;
import com.PhpTravels.SupplierPages.SupplierLogin;
import com.PhpTravels.constants.AutomationConstants;

public class SupplierDashBoardTest extends TestBase3 {
	SupplierDashBoard objDashboard;
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
	 public void verifyDashboard() throws InterruptedException {
			objDashboard =new SupplierDashBoard(driver);
			objDashboard.clickDashboard();
			String actualurl= AutomationConstants.LoginsSpplier;		 
			  String expectedUrl= driver.getCurrentUrl(); 
			Assert.assertEquals(expectedUrl,actualurl);
	}
	@Test(priority=2)
	 public void verifyText() throws InterruptedException {
		objDashboard =new SupplierDashBoard(driver);
	     String Title=objDashboard.validateText();
	     Assert.assertEquals(Title,"Sales overview & summary");

	 }

}
