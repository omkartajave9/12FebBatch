package com.SauceDemo.TestClasses;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TC01LoginFunctionality extends TestBaseClass
{
	@Test
	public void Loginfunction() throws IOException 
	{
	

 
//		ScreenshotClass.Screenshotmethod(driver);
    
    System.out.println("Validating test case");
    
    String expectedtitle = "Swag Labs";
    String actualtitle = driver.getTitle();
    
//    if(expectedtitle.equals(actualtitle))
//    {
//    	System.out.println("Test case pass");
//    }
//    else
//    {
//    	System.out.println("Test case fail");
//    }
    
//    Assert.assertEquals(expectedtitle, actualtitle);
    
    SoftAssert soft = new SoftAssert();
    
    soft.assertEquals(actualtitle, expectedtitle);
    
    
    
    
    
    
    

    }

   
    
   
    
    
    
    
    
    
    

	}

