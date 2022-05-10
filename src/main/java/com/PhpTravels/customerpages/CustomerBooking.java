package com.PhpTravels.customerpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PhpTravels.utilities.PageUtility;

public class CustomerBooking {
	 WebDriver driver;
	 
	 @FindBy(xpath="/html/body/div[1]/div/div[3]/ul/li[2]/a")
	 private WebElement bookings;
	 @FindBy(xpath="/html/body/section[1]/div/div[2]/div/div[1]/div/div/div[2]/div/table/tbody/tr[1]/td[4]/div")
	 private WebElement voucher;
	 
	 public void ClickBookings() {
		 PageUtility.waitForElementTobeVisible(driver,bookings,5000);
		 bookings.click(); 
		 
	 }
	 public void ClickVoucher() {
		 PageUtility.waitForElementTobeVisible(driver,voucher,5000);
		 voucher.click();
	 } 
	 
	 public CustomerBooking(WebDriver driver) {
			this.driver = driver;
			// This initElements method will create all WebElements
			PageFactory.initElements(driver, this);
		}

}
