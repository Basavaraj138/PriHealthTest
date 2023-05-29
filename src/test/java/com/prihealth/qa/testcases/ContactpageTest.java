package com.prihealth.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.prihealth.qa.base.TestBase;
import com.prihealth.qa.pages.Contactspage;
import com.prihealth.qa.pages.Homepage;
import com.prihealth.qa.pages.LoginPage;
import com.prihealth.qa.util.TestUtil;

public class ContactpageTest extends TestBase {
	WebDriver driver;
	LoginPage loginpage;
	Homepage homepage;
	TestUtil util;
	Contactspage ctspage;
	String sheetName="Contacts";
	
	public ContactpageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initilization();
		loginpage=new LoginPage();
		homepage=new Homepage();
	    util=new TestUtil();
	    util.switchtoframe();
	     ctspage=new Contactspage();
		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage.
	}
	
	@Test
	public void verifycontactlabeltest()
	{
		
		Assert.assertTrue(ctspage.clickoncontactLink(), "contact label is missing on the page");
	}
	
	public void verifyselectcontacttest()
	{
		ctspage.selectallcontacts();
	}
	
	@DataProvider
	public Object[][] getprihealthtestdata()
	{
		
		Object [][]data=TestUtil.gettestdata(sheetName);
		return data;
	}
	public void validatecreatenewcontacttest(String title,String fn,String ln,String Company)
	{
		homepage.clickoncontactspagetest();
		ContactpageTest.createnewcontactbutton(title,fn,ln,Company);
	
		
	}
}
