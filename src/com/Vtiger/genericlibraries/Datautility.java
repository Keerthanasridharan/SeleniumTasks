package com.Vtiger.genericlibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Datautility {

	public String getDatafromproperty (String key) throws IOException{
		FileInputStream fis=new FileInputStream("./Datastorage/Login.properties");
		Properties ab=new Properties();
		ab.load(fis);
		String value = ab.getProperty(key);
		return value;
	}
	public String getDatafromExcel(String Sheet,int rownum, int cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis1=new FileInputStream("./Datastorage/Login_Excel.xlsx");
		Workbook book=WorkbookFactory.create(fis1);
		org.apache.poi.ss.usermodel.Sheet sh=book.getSheet(Sheet);
		String value=sh.getRow(rownum).getCell(cellnum).getStringCellValue();
		return value;
		}
}
