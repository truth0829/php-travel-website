package com.PhpTravels.Adminpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PhpTravels.utilities.PageUtility;

public class AdminBookingConfirm {
	WebDriver driver;
	@FindBy(xpath ="/html/body/div[2]/div[2]/main/div/div[2]/div/div/div[2]/div/table/tbody/tr/td[11]/select")
	private WebElement bookingStatus ;
	@FindBy(xpath ="/html/body/div[2]/div[2]/main/div/div[2]/div/div/div[2]/div/table/tbody/tr/td[11]/select/option[2]")
	private WebElement confirmed;
	@FindBy(xpath="/html/body/div[2]/div[2]/main/div/div[1]/div[1]/a/div/div/div/div[1]/div[1]")
	private WebElement confirmedStatus;
	public AdminBookingConfirm(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	public void clickStatus() throws InterruptedException {

		PageUtility.waitForElementTobeVisible(driver,bookingStatus,500);
		System.out.println(bookingStatus);
		bookingStatus.click();
		
	}
	public void clickconfirmed() throws InterruptedException {

		PageUtility.waitForElementTobeVisible(driver,confirmed,500);
		System.out.println(confirmed);
		confirmed.click();
		
	}
	 public String CheckconfirmedDStatus(){
		    PageUtility.waitForElementTobeVisible(driver,confirmedStatus,500); 
			return confirmedStatus.getText();
		}
	

}
