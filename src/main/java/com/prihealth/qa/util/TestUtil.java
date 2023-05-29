package com.prihealth.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.prihealth.qa.base.TestBase;


public class TestUtil extends TestBase {
	public static long page_load_timeout=20;
	public static long implicit_wait=10;
    static Workbook book;
  static Sheet sheet;
 
 
  public static String TESTSHEET_PATH="C:\\Users\\welcome\\eclipse-workspace\\PriHealthTest\\src\\"
  		+ "main\\java\\com\\prihealth\\qa\\testdata\\Testdata.xlsx";
	public void switchtoframe()
	{
		driver.switchTo().window("downloadFrame");
	}
	
	public static Object[][] gettestdata(String sheetName) throws EncryptedDocumentException
	{
		FileInputStream file=null;
		try
		{
			file=new FileInputStream(TESTSHEET_PATH);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		try
		{
			 book= WorkbookFactory.create(file);
		}
		catch(InvalidFormatException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	
		sheet=book.getSheet(sheetName);
		
		Object[][]data =new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++)
			{
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
		}
	return data;
}
	public static void getScreenShotAsEndOfTest() throws IOException
	{
		File srcFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user_dir");
		
		FileUtils.copyFile(srcFile, new File(currentDir+"/Screenshot/"+System.currentTimeMillis()+".png"));
		
	}
  

}












