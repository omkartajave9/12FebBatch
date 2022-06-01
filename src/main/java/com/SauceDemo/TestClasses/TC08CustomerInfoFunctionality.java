package com.SauceDemo.TestClasses;

import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.CartPage;
import com.SauceDemo.POMClasses.CustomerInfo;
import com.SauceDemo.POMClasses.HomePage;

public class TC08CustomerInfoFunctionality extends TestBaseClass
{
	@Test
	public void Customerinfofunction()
	{
		
        HomePage hp = new HomePage(driver);
		
		hp.singleproduct();
		System.out.println("Single Product Added");
		
		hp.cart();
		System.out.println("Click on Cart");
		
		CartPage cp = new CartPage(driver);
		
		cp.Checkout();
		System.out.println("Click on Checkout");
		
		
		CustomerInfo cm = new CustomerInfo(driver);
		
		cm.Fname();
		System.out.println("Entered first name");
		
		cm.Lname();
		System.out.println("Entered Last name");

		cm.Zipcode();
		System.out.println("Entered Zip code");

		cm.Continuebutton();
		System.out.println("Entered Continue button");

	}

		
	

}
