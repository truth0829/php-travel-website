package com.PhpTravels.CustomerScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PhpTravels.constants.AutomationConstants;
import com.PhpTravels.customerpages.CustomerBooking;
import com.PhpTravels.customerpages.CustomerLoginPage;

public class CustomerBookingTest extends TestBase {
	CustomerLoginPage objLogin;
	CustomerBooking   objBooking;
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
	public void checkBookings() throws InterruptedException
	{
		objBooking= new CustomerBooking(driver);
		objBooking.ClickBookings();
		objBooking.ClickVoucher();
		String expectedTitle="https://www.phptravels.net/hotels/booking/invoice/3254/114";
		 String actualTitle=driver.getCurrentUrl();
		 Assert.assertEquals(expectedTitle,actualTitle); 
	}
}
