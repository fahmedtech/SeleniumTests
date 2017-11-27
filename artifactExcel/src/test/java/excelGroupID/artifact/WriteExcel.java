package excelGroupID.artifact;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WriteExcel {

	//public variables
	Workbook myExcelbook = null;
	XSSFSheet sheet;
	//XSSFWorkbook workbook;
	
	String fileName = "testfile.xlsx";
	String sheetName = "Sheet2";
	
	String[] data = {"name","place","animal",
	                 "faizan","jeddah","lion"};
	
	FileInputStream file;
	
	@BeforeMethod 
	public void openExcel() throws IOException {
		
		 File src=new File("C:\\Users\\sadaf\\OneDrive\\Documents\\" + 
					"QAWorkspace\\artifactExcel\\src\\test\\java\\" +
					"excelGroupID\\artifact\\" + fileName);
		 
		  // Load the file
		 
		  FileInputStream fis=new FileInputStream(src);
		 
		   // load the workbook
		 
		   XSSFWorkbook wb=new XSSFWorkbook(fis);
		 
		  // get the sheet which you want to modify or create
		 
		   XSSFSheet sh1= wb.getSheetAt(0);
		 
		 // getRow specify which row we want to read and getCell which column
		 
		 System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
		 
		 System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
		 
		 System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
		 
		 System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
		 
		 System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
		 
		 System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
		 
		// here createCell will create column
		 
		// and setCellvalue will set the value
		 
		 sh1.getRow(0).createCell(2).setCellValue("password");
		 
		 sh1.getRow(1).createCell(2).setCellValue("2.5");
		 
		 sh1.getRow(2).createCell(2).setCellValue("2.39");
		 
		 
		// here we need to specify where you want to save file
		 
		 FileOutputStream fout=new FileOutputStream(new File("C:\\Users\\sadaf\\OneDrive\\Documents\\" + 
					"QAWorkspace\\artifactExcel\\src\\test\\java\\" +
					"excelGroupID\\artifact\\" + fileName));
		 
		 
		// finally write content 
		 
		 wb.write(fout);
		 
		// close the file
		 
		 fout.close();
		
		/*FileOutputStream fos = new FileOutputStream("C:\\Users\\sadaf\\OneDrive\\Documents\\" + 
				"QAWorkspace\\artifactExcel\\src\\test\\java\\" +
				"excelGroupID\\artifact\\" + fileName);
		
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet worksheet = workbook.createSheet("worksheet");
		
		HSSFRow row1 = worksheet.createRow(0);
		HSSFCell cell1 = row1.createCell(0);
		cell1.setCellValue("abc");

		HSSFCell cell2 = row1.createCell(1);
		cell2.setCellValue("123");
		
		fos.close();*/
	}
	
	@Test
	public void writingExcel() throws IOException {
		
		/*file = new FileInputStream("C:\\Users\\sadaf\\OneDrive\\Documents\\" + 
				"QAWorkspace\\artifactExcel\\src\\test\\java\\" +
				"excelGroupID\\artifact\\" + fileName);

		workbook = new XSSFWorkbook(file);
		sheet = workbook.getSheet(sheetName);
		
		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		
		Row row = sheet.getRow(0);
		
		Row newRow = sheet.createRow(rowCount +1);
		
		//create loop over cell of newly created row
		for(int j=0; j < row.getLastCellNum(); j++) {
			Cell cell = newRow.createCell(j);
			cell.setCellValue(data[j]);
		}
		
		file.close();
		
		FileOutputStream outputStream = new FileOutputStream("C:\\Users\\sadaf\\OneDrive\\Documents\\" + 
				"QAWorkspace\\artifactExcel\\src\\test\\java\\" +
				"excelGroupID\\artifact\\" + fileName);
		
		workbook.write(outputStream);
		outputStream.close();*/
	}
	
	@AfterMethod
	public void tearDown() {

		System.out.println("Excel file written!");
	}
}
