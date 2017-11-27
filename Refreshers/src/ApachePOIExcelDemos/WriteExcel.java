package ApachePOIExcelDemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		File fileScr = new File("C:\\Users\\sadaf\\Desktop\\testfile.xlsx");
		
		FileInputStream fisObj = new FileInputStream(fileScr);
	
		//HSSFWorkbook can be used for XLS file
		XSSFWorkbook workBookObj = new XSSFWorkbook(fisObj);
		XSSFSheet sheet1Obj = workBookObj.getSheetAt(0); //Sheet1

		//code implementation
		sheet1Obj.getRow(0).createCell(3).setCellValue("Test Passed");
		sheet1Obj.getRow(1).createCell(3).setCellValue("Test Failed");

		FileOutputStream fOut = new FileOutputStream(fileScr);
		workBookObj.write(fOut);
		
		workBookObj.close();
		System.out.println("Excel File Test status written!");
	}

}
