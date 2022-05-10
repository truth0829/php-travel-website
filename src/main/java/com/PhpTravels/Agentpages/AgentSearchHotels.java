package com.PhpTravels.Agentpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PhpTravels.utilities.PageUtility;

public class AgentSearchHotels {
	WebDriver driver;
	@FindBy(xpath="/html/body/section[1]/section/div/div/form/div/div/div[1]/div/div/div/span/span[1]/span/span[1]")
    private WebElement CityName;
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	private WebElement name;
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li")
	private WebElement Cityname;
	@FindBy(id="submit")
	private WebElement search;
	public AgentSearchHotels(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	 public void clickCityName() throws InterruptedException {

			PageUtility.waitForElementTobeVisible(driver,CityName,500);
			System.out.println(CityName);
			CityName.click();
		}
	 public void setCity(String strcityName) {
		
			PageUtility.waitForElementTobeVisible(driver,name,5000);
			name.sendKeys(strcityName);
		}
		
	 public void selectCityname() throws InterruptedException  {

			PageUtility.waitForElementTobeVisible(driver,Cityname,500);
			System.out.println(Cityname);
			Cityname.click();
		}
	 public void clickSearch() throws InterruptedException {

			PageUtility.waitForElementTobeVisible(driver,search,500);
			System.out.println(search);
			search.click();
		}
	
}