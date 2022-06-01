package com.SauceDemo.TestClasses;

import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePage;

public class TC02AboutClassFunctionality extends TestBaseClass
{
	

	@Test
	public void aboutpage()
	{
		HomePage hp = new HomePage(driver);
		
		hp.Hamburger();
		System.out.println("Click on Hamburger");
		
		hp.About();
		System.out.println("Click on About");
		
		System.out.println("Validating test case");
		
		String ExpTitle = "Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs";
		String ActTitle = driver.getTitle();
		
		if(ExpTitle.equals(ActTitle))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test Case Failed");
		}
	}
}
