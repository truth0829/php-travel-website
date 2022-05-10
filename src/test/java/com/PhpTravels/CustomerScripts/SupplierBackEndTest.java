package com.PhpTravels.CustomerScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PhpTravels.customerpages.SupplierBackEnd;


public class SupplierBackEndTest extends TestBase {
	SupplierBackEnd supplierbackend;
	@Test(priority=0)
    public void LoginSupplierBackEndPage() throws InterruptedException {
		 
		supplierbackend =new SupplierBackEnd(driver);
		supplierbackend.clickSupplierBackend();
		 Thread.sleep(1000);
		 String actualTitle=driver.getCurrentUrl();
		 Thread.sleep(1000);
		/* String expectedTitle="https://www.phptravels.net/api/supplier";
		 Assert.assertEquals(actualTitle,expectedTitle); */		 
	 }
	
 @Test(priority=1)
	 public void verifycustomerFrontEndWithValidData() throws InterruptedException {
		 supplierbackend =new SupplierBackEnd(driver);
		 supplierbackend.clickSupplierBackend();
		 String Email = "user@phptravels.com";
		 String Password ="demouser";
		 supplierbackend.setUserName(Email);
		 Thread.sleep(500);
		 supplierbackend.setPassword(Password);
		 Thread.sleep(500);
		 supplierbackend.lblLogin(Password);
		/* String expectedTitle="https://www.phptravels.net/account/dashboard";
		 String actualTitle=driver.getCurrentUrl();
		 Assert.assertEquals(expectedTitle,actualTitle);  */
				 	 
	 }
 @Test(priority=2)
 public void verifyText() throws InterruptedException {
	 supplierbackend =new SupplierBackEnd(driver);
     String Title=supplierbackend.validateText();
     Assert.assertEquals(Title,"Sales overview & summary");

 }
 @Test(priority=3)
 public void VerifyRevenuebreakdown() {
	 supplierbackend =new SupplierBackEnd(driver);
	 boolean Flag= supplierbackend.dashboardchart();
	 Assert.assertTrue(Flag);
 }
 @Test(priority=3)
 public void VerifyBookingStatus() {
	 supplierbackend =new SupplierBackEnd(driver);
	 supplierbackend.bookings();
	 String Title=supplierbackend.bookingstatus();
     Assert.assertNotEquals(Title,"PENDING"  );
}
 @Test(priority=3)
 public void VerifyModules() {
	 supplierbackend =new SupplierBackEnd(driver);
	 boolean Flag= supplierbackend.flight();
      Assert.assertTrue(Flag);
	 
      boolean Flag1= supplierbackend.tour();
	 Assert.assertTrue(Flag1);
	 
	 boolean Flag2= supplierbackend.visa();
	 Assert.assertTrue(Flag2);
 }
 
}