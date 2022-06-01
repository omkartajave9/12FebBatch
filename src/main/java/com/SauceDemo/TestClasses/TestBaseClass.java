package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMClasses.LoginPage;

public class TestBaseClass 
{
	WebDriver driver;
	
	Logger log;

	@Parameters("browserName")
	@BeforeMethod
	public void setup(String browserName)
	{
		if(browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Omkar\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		log = Logger.getLogger("SaucedemoProjectv2");
		PropertyConfigurator.configure("log4j.properties");
		
		log.info("browser open");	
	
		}
		else if(browserName.equals("firefox"))
		{
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\Omkar\\Desktop\\New folder\\chromedriver_win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		log.info("browser open");		
		}
		else if(browserName.equals("edge"))
		{
		System.setProperty("webdriver.msedge.driver", 
				"C:\\Users\\Omkar\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		log.info("browser open");	
		}
		else
		{
			log.info("Error Message");	
		}
		
			driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		log.info("Url Open");	
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    
	    LoginPage lp = new LoginPage(driver);
	    
	    lp.Username();
	    log.info("Username Entered");	
	    
	    lp.Password();
	    log.info("Password Entered");	
	    
	    lp.Login();
	    log.info("Login Button Clicked");	
	}
	
	
	
	 @AfterMethod
	    public void teardown() throws InterruptedException
	    {
		 Thread.sleep(2000);
	    	driver.quit();
	    }

}



