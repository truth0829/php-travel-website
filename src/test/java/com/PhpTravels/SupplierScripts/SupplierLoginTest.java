package com.PhpTravels.SupplierScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.PhpTravels.SupplierPages.SupplierLogin;
import com.PhpTravels.constants.AutomationConstants;


public class SupplierLoginTest extends TestBase3 {
	
		SupplierLogin objLogin;

		@Test(priority = 4)

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
		@Test(priority = 1)

		public void ValidLoginWithInvalidUserName() throws IOException, InterruptedException {
			
			objLogin = new SupplierLogin(driver);
			//Reporter.log("---objlog Login-1.Selct icon--", true);
			 String username = "user@ph.com";
			 String password = "demosupplier";

		
			objLogin.setUserName(username);
			objLogin.setPassword(password);
			objLogin.clickLogin();
			
		
			String actualurl= AutomationConstants.LoginSupplierFailed;	 
		    String expectedUrl= driver.getCurrentUrl(); 
			Assert.assertEquals(expectedUrl,actualurl);
			Thread.sleep(5000);

			
		}
		@Test(priority = 3)

		public void ValidLoginWithInvalidUserAndInvalidPassword() throws IOException, InterruptedException {
			
			objLogin = new SupplierLogin(driver);
			 String username = "user@phpt.com";
			 String password = "demo";

		
			objLogin.setUserName(username);
			objLogin.setPassword(password);
			objLogin.clickLogin();
			
		
			String actualurl= AutomationConstants.LoginSupplierFailed;		 
			  String expectedUrl= driver.getCurrentUrl(); 
			Assert.assertEquals(expectedUrl,actualurl);
			Thread.sleep(5000);

		}
		
		@Test(priority = 2)

		public void ValidLoginWithInvalidpassword() throws IOException, InterruptedException {
			
			objLogin = new SupplierLogin(driver);
			 String username = "supplier@phptravels.com";
			 String password = "der";

		
			objLogin.setUserName(username);
			objLogin.setPassword(password);
			objLogin.clickLogin();
			
		
			String actualurl= AutomationConstants.LoginSupplierFailed;		 
			  String expectedUrl= driver.getCurrentUrl(); 
			Assert.assertEquals(expectedUrl,actualurl);
			Thread.sleep(5000);

		}

	}

