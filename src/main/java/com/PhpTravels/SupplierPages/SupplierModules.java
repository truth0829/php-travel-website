package com.PhpTravels.SupplierPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PhpTravels.utilities.PageUtility;

public class SupplierModules {
	WebDriver driver;
	 @FindBy( xpath="/html/body/nav/div/div/ul/li[1]/a")
	 private WebElement  website;
	
	 @FindBy(xpath="/html/body/section[1]/div/div/div/div/div[2]/ul/li[2]/button")
	 private WebElement Flight;
	 @FindBy(xpath="/html/body/section[1]/div/div/div/div/div[2]/ul/li[3]/button")
	 private WebElement Tour;
	 @FindBy(xpath ="/html/body/section[1]/div/div/div/div/div[2]/ul/li[4]/button")
	 private WebElement Visa;
	 
	 public SupplierModules(WebDriver driver)
	    {
	        this.driver=driver;
	        PageFactory.initElements(driver,this);
	    }
	 public void ClickWebsite() {
		 PageUtility.waitForElementTobeVisible(driver,website,5000);
			website.click(); 
		 }
		 public boolean flight() {
			 PageUtility.waitForElementTobeVisible(driver,Flight,5000);
			 Flight.click();
			 return Flight.isEnabled();
		 }
		 public boolean tour() {
			 PageUtility.waitForElementTobeVisible(driver,Tour,5000);
			Tour.click();
			return Tour.isEnabled();
		 }
		 public boolean visa() {
			 PageUtility.waitForElementTobeVisible(driver,Visa,5000);
			 Visa.click();
			 return Visa.isEnabled();
		 }
}
