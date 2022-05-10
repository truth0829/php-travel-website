package com.PhpTravels.Agentpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PhpTravels.utilities.PageUtility;

public class AgentDashBoard {
	WebDriver driver;

	/* All WebElements are identified by @FindBy annotation */
	
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/ul/li[1]/a")
	private WebElement dashBoard;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/ul/li[2]/a")
	private WebElement myBooking;  
	
	@FindBy(xpath ="/html/body/div[1]/div/div[3]/ul/li[3]/a")
	private WebElement addFunds;  
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/ul/li[4]/a")
	private WebElement myProfile;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/ul/li[5]/a")
	private WebElement logout;
	
	
	@FindBy(xpath = "/html/body/header/div[2]/div/div/div/div/div[2]/nav/ul/li[1]/a")
	private WebElement home;
	
	public void clickDashBoard() throws InterruptedException {

		PageUtility.waitForElementTobeVisible(driver,dashBoard,500);
		System.out.println(dashBoard);
		dashBoard.click();
	}
	
	public void clickmyBooking() throws InterruptedException {

		PageUtility.waitForElementTobeVisible(driver,myBooking,500);
		System.out.println(myBooking);
		myBooking.click();
	}
	
	public void clickaddFunds() throws InterruptedException {

		PageUtility.waitForElementTobeVisible(driver,addFunds,500);
		System.out.println(addFunds);
		addFunds.click();
	}
	
	public void clicklogout() throws InterruptedException {

		PageUtility.waitForElementTobeVisible(driver,logout,500);
		System.out.println(logout);
		logout.click();
	}
	
	public void clickmyProfile() throws InterruptedException {

		PageUtility.waitForElementTobeVisible(driver,myProfile,500);
		System.out.println(myProfile);
		myProfile.click();
	}
	
	public void clickHome() throws InterruptedException {

		PageUtility.waitForElementTobeVisible(driver,home,500);
		//System.out.println(myProfile);
		home.click();
	}
	
	public AgentDashBoard(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	


}
