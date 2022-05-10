package com.PhpTravels.AdminScripts;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PhpTravels.Adminpages.AdminBookingsLink;
import com.PhpTravels.Adminpages.AdminLogin;
import com.PhpTravels.constants.AutomationConstants;

public class AdminBookingsLinkTest extends TestBase2 {
	 AdminLogin objLogin;
     AdminBookingsLink objBookings;

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
	public void verifyBookingsLink() throws IOException, InterruptedException {
		objBookings=new  AdminBookingsLink(driver);
		objBookings.clickBookingslink();
		String actualurl= "https://www.phptravels.net/api/admin/bookings";	 
		  String expectedUrl= driver.getCurrentUrl(); 
		Assert.assertEquals(expectedUrl,actualurl);
		Thread.sleep(5000);

	}
	@Test(priority = 2)
	public void verifyInvoice() throws IOException, InterruptedException {
		objBookings=new AdminBookingsLink(driver);
		objBookings.clickinvoicelink();
		Thread.sleep(5000);
		 String parentWin = driver.getWindowHandle();     
	     Set<String> windows = driver.getWindowHandles();  
	      Iterator<String> it = windows.iterator();
	     
	       while(it.hasNext()) {
	            
	            String childWin = it.next();
	            
	            if(!parentWin.equals(childWin)) {
	                
	            driver.switchTo().window(childWin);
	            Thread.sleep(5000);
	            // Verify title of the child window
	            System.out.println(driver.getCurrentUrl()); 
	            String expectedTitle = "https://www.phptravels.net/flights/booking/invoice/3904/3";
	            Assert.assertEquals(driver.getCurrentUrl(), expectedTitle);
	            }}
	}
		
}
