package excelGroupID.artifact;

import java.io.*;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ReadExcel {
	
	//public variables
	Workbook myExcel = null;
	
	XSSFSheet sheet;
	XSSFWorkbook workbook;
	
	String fileName = "testfile.xlsx";
	String sheetName = "Sheet 1";
	
	@BeforeMethod
	public void openExcel () throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\sadaf\\OneDrive\\Documents\\" + 
													"QAWorkspace\\artifactExcel\\src\\test\\java\\" +
													"excelGroupID\\artifact\\" + fileName);
		workbook = new XSSFWorkbook(file);
		sheet = workbook.getSheetAt(0);
				
		/*
		//finding the excel file
		String file_extension = fileName.substring(fileName.indexOf("."));
		
		if(file_extension.equals(".xlsx")) {
			myExcel = new XSSFWorkbook(inputStream);
		}
		
		else if (file_extension.equals(".xls")) {
			myExcel = new HSSFWorkbook(inputStream);
		}		*/
	}
	
	@Test
	public void readingExcel() {
		
		/*Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println(cell);
		
		System.out.println(rowCount);*/
		
		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

		for(int i=0; i < rowCount +1; i++) {
			Row row = sheet.getRow(i);
			
			for(int j=0; j < row.getLastCellNum(); j++) {
				System.out.print(row.getCell(j).getStringCellValue() + "|| ");
			}
			System.out.println();
		}
	}//end of readingExcel()
}
