package ApachePOIExcelDemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibConfig {
	
	//global variables
	XSSFWorkbook workBookObj;
	XSSFSheet sheetObj;
	
	//constructor
	public ExcelLibConfig(String excelFilePath) throws FileNotFoundException, IOException {
		
		File fileSrc = new File(excelFilePath);
		
		FileInputStream fisObj = new FileInputStream(fileSrc);
		
		workBookObj = new XSSFWorkbook(fisObj);
	}

	public String getData(int sheetNum, int rowNum, int colNum) {
		
		sheetObj = workBookObj.getSheetAt(sheetNum);
		
		String data = sheetObj.getRow(rowNum).getCell(colNum).getStringCellValue();
		return data;
	}
	
	public int getRowCount(int sheetIndex) {
		
		return workBookObj.getSheetAt(sheetIndex).getLastRowNum() +1;
		
	}
	
}
