package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingPage 
{
   private WebDriver driver;
	
	@FindBy(xpath="//button[@id='finish']")
	private WebElement finish;
	
	public void Finish()
	{
		finish.click();
	}
	
	public BillingPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

}
