package com.PhpTravels.AgentScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PhpTravels.Agentpages.AgentLoginPage;
import com.PhpTravels.Agentpages.AgentUpperlinks;
import com.PhpTravels.constants.AutomationConstants;

public class AgentUpperlinksTest extends TestBase1 {
	AgentUpperlinks objUpperlinks;
	AgentLoginPage objLogin;
	@Test(priority = 0)

	public void verifyValidLogin() throws IOException, InterruptedException {
		
		objUpperlinks = new AgentUpperlinks(driver);
		objLogin=new AgentLoginPage(driver);
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
	 @Test(priority=1)
	 public void verifyUpperLinks() throws InterruptedException {
		 objUpperlinks = new AgentUpperlinks(driver);
		 objUpperlinks.clickHome();
		String actualTitle=driver.getCurrentUrl();
		 Assert.assertEquals(actualTitle,"https://www.phptravels.net/");
		 
		 objUpperlinks.clickHotels();
		 String actualTitle1=driver.getCurrentUrl();
		 Assert.assertEquals(actualTitle1,"https://www.phptravels.net/hotels");
		
		 objUpperlinks.clickFlights();
		 String actualTitle3=driver.getCurrentUrl();
		 Assert.assertEquals(actualTitle3,"https://www.phptravels.net/flights");
		 objUpperlinks.clickTours();
		 String actualTitle5=driver.getCurrentUrl();
		 Assert.assertEquals(actualTitle5,"https://www.phptravels.net/tours");  
		 objUpperlinks.clickVisa();
		 String actualTitle6=driver.getCurrentUrl();
		 Assert.assertEquals(actualTitle6,"https://www.phptravels.net/visa"); 
		 objUpperlinks.clickBlog();
		 String actualTitle2=driver.getCurrentUrl();
		 Assert.assertEquals(actualTitle2,"https://www.phptravels.net/blog");   
		 objUpperlinks.clickOffers();
		 String actualTitle4=driver.getCurrentUrl();
		 Assert.assertEquals(actualTitle4,"https://www.phptravels.net/offers");  
		 
	 }


}
