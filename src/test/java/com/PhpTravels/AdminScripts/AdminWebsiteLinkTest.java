package com.PhpTravels.AdminScripts;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PhpTravels.Adminpages.AdminLogin;
import com.PhpTravels.Adminpages.AdminWebsiteLink;
import com.PhpTravels.constants.AutomationConstants;

public class AdminWebsiteLinkTest extends TestBase2 {
     AdminLogin objLogin;
     AdminWebsiteLink objWebsite;

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
	public void verifyWebsiteLink() throws IOException, InterruptedException {
		
		objWebsite=new AdminWebsiteLink(driver);
		 String parentWin = driver.getWindowHandle();     
	     Set<String> windows = driver.getWindowHandles();
	        
	      Iterator<String> it = windows.iterator();
	      objWebsite.clickWebsitelink();
	       while(it.hasNext()) {
	            
	            String childWin = it.next();
	            
	            if(!parentWin.equals(childWin)) {
	                
	            driver.switchTo().window(childWin);
	            Thread.sleep(5000);
	            // Verify title of the child window
	            System.out.println(driver.getCurrentUrl()); 
	            String expectedTitle = "https://www.phptravels.net/";
	            Assert.assertEquals(driver.getCurrentUrl(), expectedTitle);
		
		
	}
	        }
	}
}