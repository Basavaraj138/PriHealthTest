package com.prihealth.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.prihealth.qa.base.TestBase;

public class Contactspage extends TestBase {
	
	@FindBy(xpath="//span[.='Contacts']")
	WebElement Contactlabel;
	
	@FindBy(xpath="(//div[3]//button[1]//i[1]]")
	WebElement createnewcontact;
	
	@FindBy(xpath="//label[.='First Name']")
	WebElement firstname;
	
	@FindBy(name="last_name")
	WebElement lastname;
	

	@FindBy(name="company")
	WebElement company;
	

	@FindBy(xpath="//button[.='Save']")
	WebElement savebutton;
	
	public Contactspage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifycontactpagelabel()
	{
		return Contactlabel.isDisplayed();
	}
	
	public void selectallcontacts()
	{
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]")).click();
	}
	
    public void createnewcontact(String fn, String ln,String Com)
    {
    	firstname.sendKeys(fn);
    	lastname.sendKeys(ln);
    	company.sendKeys(Com);
    	savebutton.click();
    }
}
