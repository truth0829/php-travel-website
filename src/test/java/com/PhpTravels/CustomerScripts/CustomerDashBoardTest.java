package com.PhpTravels.CustomerScripts;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PhpTravels.constants.AutomationConstants;
import com.PhpTravels.customerpages.CustomerDashBoard;
import com.PhpTravels.customerpages.CustomerLoginPage;



public class CustomerDashBoardTest extends TestBase {
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

	public void ValidCustomerDashBoard() throws IOException, InterruptedException {
		
		objDash= new CustomerDashBoard(driver);
	
		
		objDash.clickDashBoard();
		 String expectedTitle="https://www.phptravels.net/account/dashboard";
		 String actualTitle=driver.getCurrentUrl();
		 Assert.assertEquals(expectedTitle,actualTitle); 
		 
		objDash.clickmyBooking();
		 String expectedTitle1="https://www.phptravels.net/account/bookings";
		 String actualTitle1=driver.getCurrentUrl();
		 Assert.assertEquals(expectedTitle1,actualTitle1); 
		objDash.clickaddFunds();
		
		 String expectedTitle2="https://www.phptravels.net/account/add_funds";
		 String actualTitle2=driver.getCurrentUrl();
		 Assert.assertEquals(expectedTitle2,actualTitle2); 
		objDash.clickmyProfile();
		
		 String expectedTitle3="https://www.phptravels.net/account/profile";
		 String actualTitle3=driver.getCurrentUrl();
		 Assert.assertEquals(expectedTitle3,actualTitle3); 
		objDash.clicklogout();
		
		 String expectedTitle4="https://www.phptravels.net/login";
		 String actualTitle4=driver.getCurrentUrl();
		 Assert.assertEquals(expectedTitle4,actualTitle4); 

	}
	
	

}


