package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BackHome 
{
	 private WebDriver driver;
		
		@FindBy(xpath="//button[text()='Back Home']")
		private WebElement backhome;
		
		public void Backhome()
		{
			backhome.click();
		}
		
		public BackHome(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

}
