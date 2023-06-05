package com.Actitime.GenericLibaray;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLibrary {
	/**
	 * this method is a generic method which is used to read data from property file
	 * @return
	 * @throws IOException
	 */
	
	public String ReaddataFromPropertFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./Testdata/CommonData.property");
		Properties p=new Properties();
		p.load(fis);
		String value=p.getProperty(key);
		return value;
		
		
	}
	/**
	 * 
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws EcryptedDocumentException
	 * @throws IOException
	 */
	
	public String readDataFromExcel(String sheetname, int row, int cell) throws IOException {
		FileInputStream fis =new FileInputStream("./Testdata/TestData1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		  String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	
}


