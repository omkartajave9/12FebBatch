package com.SauceDemo.TestClasses;

import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.LoginPage;

public class TC05LogoutFunctionality extends TestBaseClass
{
	
	@Test
	public void logoutfunction()
	{
		LoginPage lp = new LoginPage(driver);
		lp.Menu();
	    System.out.println("Click on Menu");
		lp.Logout();
		System.out.println("Logout button click");
		
		
		
		System.out.println("Validating Test Case");
		
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
