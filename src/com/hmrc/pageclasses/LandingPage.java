package com.hmrc.pageclasses;

import org.apache.bcel.generic.NEW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LandingPage {
	WebDriver driver;
	

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// .....................Webelements.................
	@FindBy(xpath = "//a[text()='Login']")
	public WebElement login;

	@FindBy(partialLinkText = "Hotel Management ")
	public WebElement HotelManagementPlatformHeader;

	@FindBy(linkText = "Home")
	public WebElement HomeHeader;

	@FindBy(id = "logout")
	public WebElement logout;

	@FindBy(linkText = "Search:")
	public WebElement search;

	@FindBy(id = "search")
	public WebElement searchBox;

	@FindBy(id = "hotelName")
	public WebElement hotelNameBox;

	@FindBy(id = "address")
	public WebElement addressBox;

	@FindBy(id = "owner")
	public WebElement ownerBox;

	@FindBy(id = "phone")
	public WebElement phoneNumberBox;

	@FindBy(id = "email")
	public WebElement emailBox;

	@FindBy(id = "createHotel")
	public WebElement createButton;

	// ...............................End......................

	// ....................Actions...........

	public void clearFeilds() {
		hotelNameBox.clear();
		addressBox.clear();
		ownerBox.clear();
		phoneNumberBox.clear();
		emailBox.clear();
	}
	
	public void clickLogout(){
		logout.click();
		
	}
	
	public void clickLogin(){
		login.click();
		
	}

	// ..........Navigations....
	public LoginPage navigateToLoginPage() {

		login.click();
		return new LoginPage(driver);

	}

}
