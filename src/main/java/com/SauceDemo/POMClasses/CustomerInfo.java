package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerInfo 
{
private WebDriver driver;
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement fname;
	
	public void Fname()
	{
		fname.sendKeys("Omkar");
	}
	
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement lname;
	
	public void Lname()
	{
		lname.sendKeys("Tajave");
	}
	
	
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement zipcode;
	
	public void Zipcode()
	{
		zipcode.sendKeys("123");
	}
	
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continue1;
	
	public void Continuebutton()
	{
		continue1.click();
	}
	
	public  CustomerInfo(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

}
