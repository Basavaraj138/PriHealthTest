package com.prihealth.qa.testcases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.prihealth.qa.base.TestBase;
import com.prihealth.qa.pages.Homepage;
import com.prihealth.qa.pages.LoginPage;

public class LoginpageTest extends TestBase {
    WebDriver driver;
	LoginPage loginpage;
	Homepage homepage;
	LoginpageTest()
	{
		super();
	}

	@BeforeMethod
	public void setup()
	{
		initilization();
	    loginpage =new LoginPage();
	}
	
	@Test(priority = 1)
	public void loginpagetitletest()
	{
	String title =loginpage.validateloginpagetitle();
	Assert.assertEquals(title, "Cogmento CRM");
	}
	@Test(priority = 2)
	public void loginpagelogotest()
	{
		boolean flag = loginpage.validateCRMlogo();
		assertTrue(flag);
	}
	@Test(priority = 3)
	public void loginpagedetail()
	{
		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		
		
	}
	
	
	
	
	
	
	
	@AfterMethod
	
		public void tearDown()
		{
			driver.quit();
		}
	}

