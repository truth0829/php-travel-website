package com.PhpTravels.Adminpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PhpTravels.utilities.PageUtility;

public class AdminBookingDelete {
	WebDriver driver;
	@FindBy(xpath ="/html/body/div[2]/div[2]/main/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[11]/select/option[3]")
	private WebElement cancelled;
	@FindBy(xpath ="/html/body/div[2]/div[2]/main/div/div[1]/div[3]/a/div/div/div/div[1]/div[1]")
	private WebElement cancelledStatus;
	public AdminBookingDelete(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	public void clickcancelled() throws InterruptedException {

		PageUtility.waitForElementTobeVisible(driver,cancelled,500);
		System.out.println(cancelled);
		cancelled.click();
		
	}
	 public String CheckCancelledDStatus(){
		    PageUtility.waitForElementTobeVisible(driver,cancelledStatus,500); 
			return cancelledStatus.getText();
		}
}
