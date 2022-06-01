package com.SauceDemo.TestClasses;

import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePage;

public class TC06FilterFunctionality extends TestBaseClass
{
	
	@Test
	public void filterfunction()
	{
		HomePage hp = new HomePage(driver);
		
		hp.Filter();
		System.out.println("Filter added");
		
		hp.OptionLtoH();
		System.out.println("Option Selected");
	}

}
