package com.PhpTravels.customerpages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PhpTravels.utilities.*;

public class CustomerAddFund {
	WebDriver driver;
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/ul/li[3]/a")
	private WebElement paypal;
	@FindBy(xpath = "/html/body/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div/div[1]/div/div[2]/div/ul/div[4]/div/div")
	private WebElement paypalRadio;
	@FindBy(xpath = "/html/body/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div/div[2]/div/button")
	private WebElement paypalPayBtn;
	
	public void clickDashBoard() throws InterruptedException {

		PageUtility.waitForElementTobeVisible(driver,paypal,500);
		//System.out.println("jkko");
		paypal.click();
		Thread.sleep(6000);
		paypalRadio.click();
		paypalPayBtn.click();
	}
	public CustomerAddFund(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	
	

}


