package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage 
{
	private WebDriver driver;
	
	@FindBy(xpath="//button[@id='continue-shopping']")
	private WebElement Continueshopping;
	
	public void ContinueShopping()
	{
		Continueshopping.click();
	}

	
	@FindBy(xpath="//button[text()='Remove']")
	private WebElement Remove;
	
	public void Remove()
	{
		Remove.click();
	}
	
	
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement checkout;
	
	public void Checkout()
	{
		checkout.click();
	}
	
	public CartPage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
}
