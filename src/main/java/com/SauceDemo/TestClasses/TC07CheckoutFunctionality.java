package com.SauceDemo.TestClasses;

import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.CartPage;
import com.SauceDemo.POMClasses.HomePage;

public class TC07CheckoutFunctionality extends TestBaseClass 
{
	
	@Test
	public void checkoutfunction()
	{
		HomePage hp = new HomePage(driver);
		
		hp.singleproduct();
		System.out.println("Single Product Added");
		
		hp.cart();
		System.out.println("Click on Cart");
		
		CartPage cp = new CartPage(driver);
		
		cp.Checkout();
		System.out.println("Click on Checkout");
		
		System.out.println("Validating the test case");
		
		  String ExpUrl = "https://www.saucedemo.com/checkout-step-one.html";
		    String ActUrl = driver.getCurrentUrl();
		    
		    if(ExpUrl.equals(ActUrl))
		    {
		    	System.out.println("Test Case Passed");
		    }
		    else
		    {
		    	System.out.println("Test case Failed");
		    }
		
	}

}
