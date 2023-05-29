package com.prihealth.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.prihealth.qa.base.TestBase;

public class Homepage extends TestBase {

	public String validateHomepagetitle()
	{
		String title = driver.getTitle();
		return title;
	}
	
	@FindBy(xpath="//span[.='Basavaraj Kundur']")
	WebElement verifylabelname;
	
	@FindBy(xpath="//span[.='Calendar']")
	WebElement Calenderpage;
	
	@FindBy(xpath="//span[.='Contacts']")
	WebElement Contactlink;
	
	@FindBy(xpath="//span[.='Companies']")
	WebElement Companiespage;
	
	@FindBy(xpath="//span[.='Deals']")
	WebElement Dealspage;
	
	@FindBy(xpath="//div[3]//button[1]//i[1]")
	WebElement createnewcontact;
	
	public Homepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public boolean validateusernametest()
	{
		return verifylabelname.isDisplayed();
	}
	public String validateHomepagetitletest()
	{
		return driver.getTitle();
	}
	
	public Calenderpage clickcalenderpagelink()
	{
		Calenderpage.click();
		return new Calenderpage();
	}
	public Contactspage validatecontactspagetest()
	{
		Contactlink.click();
		return new Contactspage();
	}
	public Companiespage validatecompamiespagetest()
	{
		Companiespage.click();
		return new Companiespage();
	}
	public Dealspage validateDealspagetest()
	{
		Dealspage.click();
		return new Dealspage();
		
	}
	
	public void clickoncontactspagetest()
	{
		Actions act=new Actions(driver);
		act.moveToElement(Contactlink).build().perform();
		createnewcontact.click();
		
	}
}
