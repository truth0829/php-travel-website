package com.PhpTravels.customerpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PhpTravels.utilities.PageUtility;



public class CustomerLoginPage {

	WebDriver driver;

	/* All WebElements are identified by @FindBy annotation */
	
	@FindBy(name = "email")
	private WebElement email;
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/form/div[2]/div[1]/input")
	private WebElement password;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button")
	private WebElement btnLogin;  
	
	@FindBy(xpath ="/html/body/div[1]/div/div[2]/div[1]/div/p")
	private WebElement lblLogin;  
   

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
	
	public void lblLogin(String strPassword) {
		password.clear();
		PageUtility.waitForElementTobeVisible(driver,password,5000);
		password.sendKeys(strPassword);
	}

	public CustomerLoginPage(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	
	//Selecting user icon
	
	public void clickLogin() throws InterruptedException {

		PageUtility.waitForElementTobeVisible(driver,btnLogin,500);
		System.out.println(btnLogin);
		btnLogin.click();
		//WaitHelper.waitForElementTobeVisible(driver,login,500);
		
		//WaitHelper.hitenter(driver, login);
	}
	
	public String getError()
	{
		String str="";
		
		/*if(lblError!=null)
		{
			 str = lblError.getText().trim();
		}*/
		return str;
	}
		
}

