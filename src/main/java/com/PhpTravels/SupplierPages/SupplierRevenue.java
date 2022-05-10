package com.PhpTravels.SupplierPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PhpTravels.utilities.PageUtility;

public class SupplierRevenue {
	WebDriver driver;
	@FindBy(id="dashboardBarChart")
	private WebElement dashboardchart;
	 public SupplierRevenue(WebDriver driver) {
			this.driver = driver;
			// This initElements method will create all WebElements
			PageFactory.initElements(driver, this);
		}
	 public boolean dashboardchart() {
		 PageUtility.waitForElementTobeVisible(driver,dashboardchart,5000);
		 System.out.println(dashboardchart);
			return dashboardchart.isDisplayed(); 
		 }
} 
