package com.PhpTravels.customerpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.PhpTravels.utilities.PageUtility;



public class SupplierBackEnd {
	WebDriver driver;
	 @FindBy(linkText="http://www.phptravels.net/supplier")
	 private WebElement supplierbackend;
	 @FindBy(xpath="/html/body/div/div[1]/main/div/div/div/div[1]/div/form/div[1]/label/span")
	 private WebElement email;
	 @FindBy(xpath="/html/body/div/div[1]/main/div/div/div/div[1]/div/form/div[2]/label/span")
	 private WebElement password;
	 @FindBy(xpath="/html/body/div/div[1]/main/div/div/div/div[1]/div/form/div[4]/button/span[1]")
	 private WebElement login;
	 @FindBy(linkText="Sales overview & summary")
	 private WebElement text;
	 @FindBy(id="dashboardBarChart")
	 private WebElement dashboardchart;
	 @FindBy(linkText="https://www.phptravels.net/api/supplier/bookings")
	 private WebElement bookings;
	 @FindBy(xpath="//*[@id=\"booking_status\"]")
	 private WebElement bookingDropDown;
	 @FindBy( xpath="/html/body/nav/div/div/ul/li[1]/a")
	 private WebElement  website;
	
	 @FindBy(id =" l.,")
	 private WebElement Flight;
	 @FindBy( id="tours-tab")
	 private WebElement Tour;
	 @FindBy(id ="visa-tab")
	 private WebElement Visa;
	 
	 public SupplierBackEnd(WebDriver driver)
	    {
	        this.driver=driver;
	        PageFactory.initElements(driver,this);
	    }
	 public void clickSupplierBackend() {
		 supplierbackend.click();  
	  }
	 public void setUserName(String strUserName) {
			email.clear();
			PageUtility.waitForElementTobeVisible(driver,email,5000);
			email.sendKeys(strUserName);
		}

		// Set password in password textbox
		public void setPassword(String strPassword) {
			password.clear();
			PageUtility.waitForElementTobeVisible(driver,password,5000);
			password.sendKeys(strPassword);
		}
		
		public void lblLogin(String strPassword) {
			password.clear();
			PageUtility.waitForElementTobeVisible(driver,password,5000);
			password.sendKeys(strPassword);
		}

		
		
		//Selecting user icon
		
		/*public void clickLogin() throws InterruptedException {

			PageUtility.waitForElementTobeVisible(driver,btnLogin,500);
			System.out.println(btnLogin);
			btnLogin.click();
			//WaitHelper.waitForElementTobeVisible(driver,login,500);
			
			//WaitHelper.hitenter(driver, login);
		}*/
		
		public String getError()
		{
			String str="";
			
			/*if(lblError!=null)
			{
				 str = lblError.getText().trim();
			}*/
			return str;
		}
	 
	 public String validateText(){ 
			return text.getText();
		}
	 public boolean dashboardchart() {
		return dashboardchart.isDisplayed(); 
	 }
	 public void bookings() {
		 bookings.click();
	 }
	 public String bookingstatus() {
		 Select BookingStatus=new Select(bookingDropDown);
		 BookingStatus.selectByVisibleText("CONFIRMED");
		return bookingDropDown.getText();
	 }
	 public void Website() {
		website.click(); 
	 }
	 public boolean flight() {
		 Flight.click();
		 return Flight.isEnabled();
	 }
	 public boolean tour() {
		Tour.click();
		return Tour.isEnabled();
	 }
	 public boolean visa() {
		 Visa.click();
		 return Visa.isEnabled();
	 }
}

