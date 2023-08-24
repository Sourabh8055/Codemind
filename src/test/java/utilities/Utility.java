package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	public WebDriver getDriver()
	{
		return driver;
	}

	public static String readProprety(String key)throws IOException
	{
		
		File file=new File("src/test/resources/testData.Properties");
		FileInputStream fileInputStream=new file FileInputStream(file);
		
		Properties properties=new Properties();
		Properties.load(FileInputStream);
		
		return properties.getProperty(key);
		
		
    }
	   public void readExeleFile()throws IOException
	  
	   {
		   File file=new File("src/test/resources/UserData..xlsx");
		   FileInputStream fileInputStream=new file FileInputStream(file);
		   
		   XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
		   XSSFSheet sheet=xssfWorkbook.getSheet("data");
		   
		   int lastRowNumber=sheet.getLastRowNum();
		   
		   for(int i=0; i<lastRowNumber; i++);
		   {
			  XSSFRow row= sheet.getRow(i);
			  int lastCellNumber row.getLastCellNum()
		   }
			 
	   }

}
