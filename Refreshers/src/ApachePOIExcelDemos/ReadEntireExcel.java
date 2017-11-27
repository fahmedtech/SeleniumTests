package ApachePOIExcelDemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadEntireExcel {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		
		File fileScr = new File("C:\\Users\\sadaf\\Desktop\\testfile.xlsx");
		
		FileInputStream fisObj = new FileInputStream(fileScr);
	
		XSSFWorkbook workBookObj = new XSSFWorkbook(fisObj);
		XSSFSheet sheet1Obj = workBookObj.getSheetAt(0); //Sheet1
		
		int rowCount = sheet1Obj.getLastRowNum() +1;
		System.out.println("Total Rows: " + rowCount);
		
		for(int i=0; i < rowCount; i++) {
			
			String data0 = sheet1Obj.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Data from Row " + i + " is " + data0);
		}
		
		workBookObj.close();
	}
	
}
