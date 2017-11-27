package ApachePOIExcelDemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDemo {
	
	public static void main(String[] args) throws IOException, FileNotFoundException {
		
		File fileScr = new File("C:\\Users\\sadaf\\Desktop\\testfile.xlsx");
		
		FileInputStream fisObj = new FileInputStream(fileScr);
	
		//HSSFWorkbook can be used for XLS file
		XSSFWorkbook workBookObj = new XSSFWorkbook(fisObj);
		XSSFSheet sheet1Obj = workBookObj.getSheetAt(0); //Sheet1
		
		String data0 = sheet1Obj.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data0);
		
		String data1 = sheet1Obj.getRow(0).getCell(1).getStringCellValue();
		System.out.println(data1);
		
		workBookObj.close();
	}

}
