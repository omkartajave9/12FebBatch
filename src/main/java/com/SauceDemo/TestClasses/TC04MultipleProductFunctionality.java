package com.SauceDemo.TestClasses;

import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePage;

public class TC04MultipleProductFunctionality extends TestBaseClass
{
	
	@Test
	public void multiprodfunction()
	{
		HomePage hp = new HomePage(driver);
	    
	      hp.AddtoCart1();
	      System.out.println("Multiple Product Added");
	      
	      System.out.println("Validating Test case");
	      
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
