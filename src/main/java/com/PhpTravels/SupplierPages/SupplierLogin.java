package com.PhpTravels.SupplierPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PhpTravels.utilities.PageUtility;

public class SupplierLogin {
	WebDriver driver;
	 
	 @FindBy(name="email")
	 private WebElement email;
	 @FindBy(name="password")
	 private WebElement password;
	 @FindBy(xpath="/html/body/div/div[1]/main/div/div/div/div[1]/div/form/div[4]/button")
	 private WebElement btnLogin;
	 public SupplierLogin(WebDriver driver) {
			this.driver = driver;
			// This initElements method will create all WebElements
			PageFactory.initElements(driver, this);
		}
		
		// Set user name in textbox
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
			public void clickLogin() throws InterruptedException {

				PageUtility.waitForElementTobeVisible(driver,btnLogin,500);
				System.out.println(btnLogin);
				btnLogin.click();
				
			}
}
