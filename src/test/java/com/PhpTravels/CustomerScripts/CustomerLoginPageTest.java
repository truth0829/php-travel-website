package com.PhpTravels.CustomerScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.PhpTravels.CustomerScripts.*;
import com.PhpTravels.constants.*;
import com.PhpTravels.customerpages.CustomerLoginPage;
	

	
	public class CustomerLoginPageTest extends TestBase {
		CustomerLoginPage objLogin;
		@Test(priority = 0)
		public void launchApp() throws IOException, InterruptedException {
			// Create Login Page object		
			objLogin = new CustomerLoginPage (driver);// login to application		
			objLogin.clickLogin();
		}

		@Test(priority = 4)

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

		public void ValidLoginWithInvalidUserName() throws IOException, InterruptedException {
			
			objLogin = new CustomerLoginPage(driver);
			//Reporter.log("---objlog Login-1.Selct icon--", true);
			 String username = "user@ph.com";
			 String password = "demouser";

		
			objLogin.setUserName(username);
			objLogin.setPassword(password);
			objLogin.clickLogin();
			
		
			String actualurl= AutomationConstants.LoginFailed;	 
		    String expectedUrl= driver.getCurrentUrl(); 
			Assert.assertEquals(expectedUrl,actualurl);
			Thread.sleep(5000);

			
		}
		@Test(priority = 3)

		public void ValidLoginWithInvalidUserAndInvalidPassword() throws IOException, InterruptedException {
			
			objLogin = new CustomerLoginPage(driver);
			 String username = "user@phpt.com";
			 String password = "demo";

		
			objLogin.setUserName(username);
			objLogin.setPassword(password);
			objLogin.clickLogin();
			
		
			String actualurl= AutomationConstants.LoginFailed;		 
			  String expectedUrl= driver.getCurrentUrl(); 
			Assert.assertEquals(expectedUrl,actualurl);
			Thread.sleep(5000);

		}
		
		@Test(priority = 2)

		public void ValidLoginWithInvalidpassword() throws IOException, InterruptedException {
			
			objLogin = new CustomerLoginPage(driver);
			 String username = "user@phptravels.com";
			 String password = "der";

		
			objLogin.setUserName(username);
			objLogin.setPassword(password);
			objLogin.clickLogin();
			
		
			String actualurl= AutomationConstants.LoginFailed;		 
			  String expectedUrl= driver.getCurrentUrl(); 
			Assert.assertEquals(expectedUrl,actualurl);
			Thread.sleep(5000);

		}


	}


