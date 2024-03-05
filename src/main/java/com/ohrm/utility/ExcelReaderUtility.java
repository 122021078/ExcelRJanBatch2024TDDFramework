package com.ohrm.utility;                            // 29-02-2024

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderUtility {

	public static Object[][] getData(String filepath, String sheetname)  {
		
		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(filepath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet sheet = wb.getSheet(sheetname);
		int rowcount = sheet.getPhysicalNumberOfRows();
		int colcount = sheet.getRow(0).getLastCellNum();
		
//		System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
//		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
//		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
//		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
//		System.out.println(sheet.getRow(2).getCell(0).getStringCellValue());
//		System.out.println(sheet.getRow(2).getCell(1).getStringCellValue());
		
		//for loop
		//for (int row = 0; row < rowcount; row++) {
		//	for (int col = 0; col < colcount; col++) {
		//		System.out.println(sheet.getRow(row).getCell(col).getStringCellValue());
				
	//		}
    //		}
		
		Object[][] data = new Object[rowcount][colcount];
		
		for (int row = 0; row < rowcount; row++) {
		    for (int col = 0; col < colcount; col++) {
			    data[row][col] = sheet.getRow(row).getCell(col).getStringCellValue();
		    }
        }
		return data;
		
	}

}

