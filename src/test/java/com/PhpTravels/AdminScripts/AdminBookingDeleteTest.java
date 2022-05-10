package com.PhpTravels.AdminScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PhpTravels.Adminpages.AdminBookingConfirm;
import com.PhpTravels.Adminpages.AdminBookingDelete;
import com.PhpTravels.Adminpages.AdminBookingsLink;
import com.PhpTravels.Adminpages.AdminLogin;

public class AdminBookingDeleteTest extends TestBase2 {
	AdminBookingDelete objCancel;
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

	public void verifyBookingcancelled() throws IOException, InterruptedException {
		objBookings=new AdminBookingsLink(driver);
		objBookingsconfirm= new AdminBookingConfirm(driver);
		 objCancel=new AdminBookingDelete (driver);
         objBookings.clickBookingslink();
        objBookingsconfirm.clickStatus();
		objBookingsconfirm.clickconfirmed();
		Thread.sleep(5000);
		 objBookingsconfirm.clickStatus();
		objCancel.clickcancelled();
		Thread.sleep(5000);
		String Title=objCancel.CheckCancelledDStatus();
	    Assert.assertEquals(Title,"1");
}
}