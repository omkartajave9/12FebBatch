package com.SauceDemo.TestClasses;

import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePage;

public class TC03SingleProductFunctionality extends TestBaseClass
{
	

	@Test
	public void singleprodfunction()
	{
		HomePage hp = new HomePage(driver);
		
		hp.singleproduct();
		System.out.println("Click on Single Product");
		
		
		System.out.println("Validating test case");
		
		String ExpTitle = "Swag Labs";
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
