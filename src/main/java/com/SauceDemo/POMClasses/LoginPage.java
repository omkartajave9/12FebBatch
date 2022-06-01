package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	private WebDriver driver;
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement Username;
	
	public void Username()
	{
		Username.sendKeys("standard_user");
	}
	
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement Password;
	
	public void Password()
	{
		Password.sendKeys("secret_sauce");
	}
	
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement Login;
	
	public void Login()
	{
		Login.click();
	}

	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement menu;
	
	public void Menu()
	{
		menu.click();
		
	}
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logout;
	
	public void Logout()
	{
		logout.click();
		
	}
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
}
