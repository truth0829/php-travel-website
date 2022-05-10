package com.PhpTravels.Adminpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PhpTravels.utilities.PageUtility;

public class AdminWebsiteLink {
	WebDriver driver;
	@FindBy(xpath = "/html/body/nav/div/div/ul/li[1]/a")
	private WebElement website;
	public AdminWebsiteLink(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	public void clickWebsitelink() throws InterruptedException {

		PageUtility.waitForElementTobeVisible(driver,website,500);
		System.out.println(website);
		website.click();
		//WaitHelper.waitForElementTobeVisible(driver,login,500);
		
		//WaitHelper.hitenter(driver, login);
	}
}
