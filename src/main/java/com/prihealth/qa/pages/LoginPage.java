package com.prihealth.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.prihealth.qa.base.TestBase;

public class LoginPage extends TestBase {
	public static String validateloginpage()
	{
		String title = driver.getTitle();
		return title ;
	}
  @FindBy(name="email")
  WebElement Email;
  
  @FindBy(name="password")
  WebElement password;
  
  @FindBy(xpath="//div[@class='ui fluid large blue submit button']")
  WebElement Loginbutton;
  
  @FindBy(xpath="//div[@class='header item']")
  WebElement Homepagelogo;
  
  //Initializing Page Objects
  public LoginPage()
  {
	  PageFactory.initElements(driver, this);
  }
  //Actions
public String validateloginpagetitle()
{
	return driver.getTitle();
  }
public boolean validateCRMlogo()
{
	return Homepagelogo.isDisplayed();
}

public Homepage login(String un,String Pwd)
{
	Email.sendKeys(un);
	password.sendKeys(Pwd);
	Loginbutton.click();
	
	
	return new Homepage();
}















}
