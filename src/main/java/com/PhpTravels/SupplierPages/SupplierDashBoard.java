package com.PhpTravels.SupplierPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PhpTravels.utilities.PageUtility;

public class SupplierDashBoard {
	WebDriver driver;
	 @FindBy(xpath="/html/body/nav/div/button")
	 private WebElement Dashboard;
	 @FindBy(xpath="/html/body/div[2]/div[2]/main/div/div[1]/div[1]/div")
	 private WebElement text;
	 public SupplierDashBoard(WebDriver driver)
	    {
	        this.driver=driver;
	        PageFactory.initElements(driver,this);
	    }
	 public void clickDashboard() throws InterruptedException {

			PageUtility.waitForElementTobeVisible(driver,Dashboard,500);
			System.out.println(Dashboard);
			Dashboard.click();
			
		}
 public String validateText(){
    PageUtility.waitForElementTobeVisible(driver,Dashboard,500); 
	return text.getText();
}
}