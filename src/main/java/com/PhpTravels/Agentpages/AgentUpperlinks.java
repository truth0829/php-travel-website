package com.PhpTravels.Agentpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PhpTravels.utilities.PageUtility;

public class AgentUpperlinks {
	WebDriver driver;
	@FindBy(xpath="/html/body/header/div[2]/div/div/div/div/div[2]/nav/ul/li[1]/a")
    private WebElement Home;
	 @FindBy(xpath="/html/body/header/div[2]/div/div/div/div/div[2]/nav/ul/li[2]/a")
	 private WebElement Hotels;
	 @FindBy(xpath="/html/body/header/div[2]/div/div/div/div/div[2]/nav/ul/li[3]/a")
	 private WebElement Flights;
	 @FindBy(xpath="/html/body/header/div[2]/div/div/div/div/div[2]/nav/ul/li[4]/a")
	 private WebElement Tours;
	 @FindBy(xpath="/html/body/header/div[2]/div/div/div/div/div[2]/nav/ul/li[5]/a")
    private WebElement Visa;
    @FindBy(xpath="/html/body/header/div[2]/div/div/div/div/div[2]/nav/ul/li[6]/a")
    private WebElement Blog;
    @FindBy(xpath="/html/body/header/div[2]/div/div/div/div/div[2]/nav/ul/li[7]/a")
    private WebElement Offers;
    public AgentUpperlinks(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
    public void clickHome() throws InterruptedException {

		PageUtility.waitForElementTobeVisible(driver,Home,500);
		System.out.println(Home);
		Home.click();
	}
    public void clickHotels() throws InterruptedException {

		PageUtility.waitForElementTobeVisible(driver,Hotels,500);
		System.out.println(Hotels);
		Hotels.click();
	}
    public void clickFlights() throws InterruptedException {

		PageUtility.waitForElementTobeVisible(driver,Flights,500);
		System.out.println(Flights);
		Flights.click();
	}
    public void clickTours() throws InterruptedException {

		PageUtility.waitForElementTobeVisible(driver,Tours,500);
		System.out.println(Tours);
		Tours.click();
	}
    public void clickVisa() throws InterruptedException {

		PageUtility.waitForElementTobeVisible(driver,Visa,500);
		System.out.println(Visa);
		Visa.click();
	}
    public void clickBlog() throws InterruptedException {

		PageUtility.waitForElementTobeVisible(driver,Blog,500);
		System.out.println(Blog);
		Blog.click();
	}
    public void clickOffers() throws InterruptedException {

		PageUtility.waitForElementTobeVisible(driver,Offers,500);
		System.out.println(Offers);
		Offers.click();
	}
}
