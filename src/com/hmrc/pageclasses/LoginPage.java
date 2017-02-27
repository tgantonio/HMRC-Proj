package com.hmrc.pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class LoginPage {
	
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	public  WebElement usernameBox;
	

	@FindBy(id="password")
	public   WebElement passwordBox;
	
	@FindBy(id="doLogin")
	public  WebElement loginButton;
	

	@FindBy(xpath="//button[text()='Close']")
	public   WebElement closeButton;
	
	public  void doLogin(){
		
		usernameBox.sendKeys("admin");
		passwordBox.sendKeys("password");
		loginButton.click();
		
				
		
	}

}
