package com.SauceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	private WebDriver driver;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement> AddToCart1;
	
	public void AddtoCart1()
	{
	    for(int i=0; i<=2; i++)
	    {
	    	AddToCart1.get(i).click();
	    }
	}
	
	
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	private WebElement SingleProduct;
	
	public void singleproduct()
	{
		SingleProduct.click();
	}

	
	
	@FindBy(xpath="//span[@class='select_container']")
	private WebElement filter;
	
	public void Filter()
	{
		filter.click();
	}
	
	@FindBy(xpath="//option[text()='Price (low to high)']")
	private WebElement option;
	
	public void OptionLtoH()
	{
		option.click();
	}
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement Cart;
	
	public void cart()
	{
		Cart.click();
	}
	
	@FindBy(xpath="//button[text()='Open Menu']")
	private WebElement menu;
	
	public void Hamburger()
	{
		menu.click();
	}
	
	
	@FindBy(xpath="//a[text()='All Items']")
	private WebElement items;
	
	public void Allitems()
	{
		items.click();
	}
	
	
	@FindBy(xpath="//a[@id='about_sidebar_link']")
	private WebElement about;
	
	public void About()
	{
		about.click();
	}
	
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement Logout;
	
	public void LogOut()
	{
		Logout.click();
	}
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	

}
