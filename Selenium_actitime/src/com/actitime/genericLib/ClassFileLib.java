package com.actitime.genericLib;



import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ClassFileLib {
/**
 * 
 * It is used to read the data from excel workbook,Data base and propertiesfile from data folder.
 * 
 * @author deepak
 * @throws Throwable 
 * 
 */
	public  String getPropertyValue(String key) throws Throwable
	
	{
		FileInputStream fis = new FileInputStream("./testdata/data.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String data = pobj.getProperty(key);
		return data;
		
	}
	/*to read the data from testscriptdata.xlx file*/

	public  String getExcelData(String sheetName, int rowNum, int cellNum) throws Throwable
	{
		FileInputStream fis = new FileInputStream("./testdata/commondata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		String data = row.getCell(cellNum).getStringCellValue();
		return data;
	}
}
