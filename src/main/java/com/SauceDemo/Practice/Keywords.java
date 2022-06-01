package com.SauceDemo.Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Keywords
{
	
//	Priority Keyword
	
//	@Test(priority = -1)
//	public void testA()
//	{
//		System.out.println("Test A");
//	}
//
//	@Test(priority = -2)
//	public void testB()
//	{
//		System.out.println("Test B");
//	}
//	
//	@Test(priority = 1)
//	public void testC()
//	{
//		System.out.println("Test C");
//	}
//	
//	@Test(priority = 3)
//	public void testD()
//	{
//		System.out.println("Test D");
//	}
//	
//	@Test(priority = 2)
//	public void testE()
//	{
//		System.out.println("Test E");
//	}
	
	
//	invocationCount Keyword
	
	@Test(priority = 2)
	public void testA()
	{
		System.out.println("Test A");
		
		Assert.assertTrue(false);        
	}
	
//	@Test(priority = -2)
//	public void testB()
//	{
//		System.out.println("Test B");
//	}
	
//	@Test(priority = 1)
//	public void testC()
//	{
//		System.out.println("Test C");
//	}
//	
//	@Test(priority = 3)
//	public void testD()
//	{
//		System.out.println("Test D");
//	}
	
	
	@Test(dependsOnMethods = {"testA"}, priority=1)
	public void testC()
	{
		System.out.println("Test C");
	}
	
//	@Test(priority = 3)
//	public void testD()
//	{
//		System.out.println("Test D");
//	}
	
	
}
