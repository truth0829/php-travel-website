package com.PhpTravels.SupplierScripts;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PhpTravels.SupplierPages.SupplierLogin;
import com.PhpTravels.SupplierPages.SupplierModules;
import com.PhpTravels.constants.AutomationConstants;


public class SupplierModuleTest extends TestBase3 {
	SupplierModules objModule;
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
	 public void VerifyModules()throws IOException, InterruptedException {
		 objModule=new SupplierModules(driver);
		 objModule.ClickWebsite();
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
	            String expectedTitle = "https://www.phptravels.net/";
	            
	            Assert.assertEquals(driver.getCurrentUrl(), expectedTitle);
		 
		 boolean Flag=objModule.flight();
	     Assert.assertTrue(Flag);
		 
	     boolean Flag1=objModule.tour();
		 Assert.assertTrue(Flag1);
		 
		 boolean Flag2=objModule.visa();
		 Assert.assertTrue(Flag2);
		 Thread.sleep(5000);
	 }

} 
}
}