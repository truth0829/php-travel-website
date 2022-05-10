package com.PhpTravels.AgentScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PhpTravels.Agentpages.AgentLoginPage;
import com.PhpTravels.constants.AutomationConstants;

public class AgentLoginPageTest extends TestBase1 {
	AgentLoginPage objLogin;
	@Test(priority = 0)
	public void launchApp() throws IOException, InterruptedException {
		// Create Login Page object		
		objLogin = new AgentLoginPage(driver);// login to application		
		objLogin.clickLogin();
	}

	@Test(priority = 4)

	public void verifyValidLogin() throws IOException, InterruptedException {
		
		objLogin = new AgentLoginPage(driver);
		 String username = "agent@phptravels.com";
		 String password = "demoagent";

	
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
		
		objLogin = new AgentLoginPage(driver);
		//Reporter.log("---objlog Login-1.Selct icon--", true);
		 String username = "user@ph.com";
		 String password = "demoagent";

	
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
		
		objLogin = new AgentLoginPage(driver);
		 String username = "user@phpt.com";
		 String password = "deo";

	
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
		
		objLogin = new AgentLoginPage(driver);
		 String username = "agent@phptravels.com";
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



