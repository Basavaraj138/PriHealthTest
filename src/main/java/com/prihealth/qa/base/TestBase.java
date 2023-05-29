package com.prihealth.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
     
	public TestBase()
	{
		
		try 
		{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\welcome\\eclipse-workspace\\PriHealthTest\\src\\main\\java\\com\\prihealth\\qa\\config\\Config.properties");
		prop.load(fis);
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	

	public static void initilization()
	{
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browsername.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
		driver.get(prop.getProperty("url"));
		
		
		
		}
}
