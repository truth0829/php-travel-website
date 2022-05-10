package com.PhpTravels.AgentScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PhpTravels.Agentpages.AgentLoginPage;
import com.PhpTravels.Agentpages.AgentSearchHotels;
import com.PhpTravels.Agentpages.AgentUpperlinks;
import com.PhpTravels.constants.AutomationConstants;

public class AgentSearchHotelTest extends TestBase1 {
	AgentSearchHotels objHotels;
	AgentUpperlinks objUpperlinks;
	AgentLoginPage objLogin;
	@Test(priority = 0)

	public void verifyValidLogin() throws IOException, InterruptedException {
		
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
	@Test(priority = 1)
	 public void verifySearchHotels() throws InterruptedException {
	 objUpperlinks = new AgentUpperlinks(driver);
	 objHotels=new AgentSearchHotels(driver);
	 objUpperlinks.clickHotels();
	 objHotels.clickCityName();
	 
	 String name="Dubai";
	 objHotels.setCity(name);
	 objHotels.selectCityname();
	 objHotels.clickSearch();
	 Thread.sleep(5000);
	 String actualurl= "https://www.phptravels.net/hotels/en/usd/dubai/05-05-2022/06-05-2022/1/2/0/US";	 
	 String expectedUrl= driver.getCurrentUrl(); 
	Assert.assertEquals(expectedUrl,actualurl);
}
}