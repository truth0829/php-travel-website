package com.PhpTravels.Adminpages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PhpTravels.utilities.PageUtility;

public class AdminBookingsLink {
	WebDriver driver;
	@FindBy(xpath = "/html/body/nav/div/div/ul/li[2]/a")
	private WebElement bookings ;
	@FindBy(xpath ="/html/body/div[2]/div[2]/main/div/div[2]/div/div/div[2]/div/table/tbody/tr/td[14]/a")
	private WebElement invoice;
	public AdminBookingsLink (WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	
	public void clickBookingslink() throws InterruptedException {

		PageUtility.waitForElementTobeVisible(driver,bookings,500);
		System.out.println(bookings);
		bookings.click();
		//WaitHelper.waitForElementTobeVisible(driver,login,500);
		
		//WaitHelper.hitenter(driver, login);
	}
	public void clickinvoicelink() throws InterruptedException {

		PageUtility.waitForElementTobeVisible(driver,invoice,500);
		System.out.println(invoice);
		invoice.click();
		//WaitHelper.waitForElementTobeVisible(driver,login,500);
		
		//WaitHelper.hitenter(driver, login);
	}
	

}
