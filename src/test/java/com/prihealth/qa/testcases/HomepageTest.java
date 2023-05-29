package com.prihealth.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.prihealth.qa.base.TestBase;
import com.prihealth.qa.pages.Contactspage;
import com.prihealth.qa.pages.Homepage;
import com.prihealth.qa.pages.LoginPage;
import com.prihealth.qa.util.TestUtil;

public class HomepageTest extends TestBase{
	WebDriver driver;
	LoginPage loginpage;
	Homepage homepage;
	TestUtil util;
	  Contactspage ctspage;
	public HomepageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initilization();
		loginpage=new LoginPage();
		
	    util=new TestUtil();
	    ctspage=new Contactspage();
		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
   @Test
   public void verifyhomepagetitletest()
   {
	   String homepagetitle = homepage.validateHomepagetitle();
	   Assert.assertEquals(homepagetitle, "Cogmento CRM");
   }
   
   @Test
   public void verifyusernametest()
   {
	 util.switchtoframe();
	  Assert.assertTrue(homepage.validateusernametest());
   }
   
   @Test
   public void clickcontactlinkstest()
   {
	   ctspage= homepage.validatecontactspagetest();
	   
	   
   }
   @AfterMethod
   public void teardown()
   {
	   driver.close();
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
