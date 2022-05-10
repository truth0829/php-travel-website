package com.PhpTravels.customerpages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.PhpTravels.utilities.PageUtility;

public class CustomerProfile {
WebDriver driver;
	@FindBy(name = "address1")
	private WebElement address1;
	@FindBy(name = "address2")
	private WebElement address2;
	@FindBy(xpath = "/html/body/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button")
	private WebElement btnUpdate;
	 
	public void setAddress1(String strAddress1) {
		address1.clear();
		PageUtility.waitForElementTobeVisible(driver,address1,5000);
		address1.sendKeys(strAddress1);
	}
	public void setAddress2(String strAddress2) {
		address2.clear();
		PageUtility.waitForElementTobeVisible(driver,address2,5000);
		address2.sendKeys(strAddress2);
	}

	
	public void updateProfile() throws InterruptedException {

		
		PageUtility.waitForElementTobeVisible(driver,btnUpdate,500);
		
		btnUpdate.click();
		Thread.sleep(6000);
		
	}
	public CustomerProfile(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
}
