package com.PhpTravels.AdminScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PhpTravels.Adminpages.AdminBookingConfirm;
import com.PhpTravels.Adminpages.AdminBookingsLink;
import com.PhpTravels.Adminpages.AdminLogin;

public class AdminBookingconfirmTest extends TestBase2 {
	AdminLogin objLogin;
	 AdminBookingsLink objBookings;
    AdminBookingConfirm objBookingsconfirm;

	@Test(priority = 0)

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
	@Test(priority = 1)
	public void verifyBookingConfirm() throws IOException, InterruptedException {
		objBookings=new AdminBookingsLink(driver);
		objBookingsconfirm= new AdminBookingConfirm(driver);
		objBookings.clickBookingslink();
		
		objBookingsconfirm.clickStatus();
		
		Thread.sleep(5000);
		objBookingsconfirm.clickconfirmed();
	    String Title=objBookingsconfirm.CheckconfirmedDStatus();
	    Assert.assertEquals(Title,"1");
	    
	}
}
