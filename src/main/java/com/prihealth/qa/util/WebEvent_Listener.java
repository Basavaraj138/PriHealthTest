package com.prihealth.qa.util;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.prihealth.qa.base.TestBase;

public class WebEvent_Listener extends TestBase {
	public void beforeNavigateTo(String url, WebDriver driver)
	{
		System.out.println("Before navigate to: "+url+"");
	}
	public void afterNavigateTo(String url, WebDriver driver)
	{
		System.out.println("Navigated to: "+url+"");
	}
	public void beforeChangeValueOf(WebElement element,WebDriver driver)
	{
		System.out.println("Value of the: "+element.toString()+"before any changes made");
	}
	public void afterChangeValueOf(WebElement element,WebDriver driver)
	{
		System.out.println("Element value change to: "+element.toString());
	}

public void beforeClickOn(WebElement element,WebDriver driver)
{
	System.out.println("Trying to clickon: "+element.toString());
}  
public void afterClickOn(WebElement element,WebDriver driver)
{
	System.out.println("clickedOn: "+element.toString());
} 
public void beforeNavigateBack(WebDriver driver)
{
	System.out.println("Navigating back to previous page");
} 
public void afterNavigateBack(WebDriver driver)
{
	System.out.println("Navigating back to previous page");
} 
public void beforeNavigateBackForward(WebDriver driver)
{
	System.out.println("Navigating forward to next page");
} 
public void afterNavigateBackForward(WebDriver driver)
{
	System.out.println("Navigating forward to next page");
} 
public void onException(Throwable error, WebDriver driver)
{
	System.out.println("Exception occured" +error);
	try
	{
		TestUtil.getScreenShotAsEndOfTest();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}
	public void beforeFindBy(By by,WebElement element, WebDriver driver)
	{
		System.out.println("Trying to find Elementby:"+by.toString());
	}
	public void afterFindBy(By by,WebElement element, WebDriver driver)
	{
		System.out.println("Find Element By:"+by.toString());
	}
	public void beforeScript(String script, WebDriver driver)
	{
	}
	public void afterScript(String script, WebDriver driver)
	{
	}
	public void beforeAlertAccept(WebDriver driver)
	{
	}
	public void afterAlertAccept(WebDriver driver)
	{
	}
}



















}
