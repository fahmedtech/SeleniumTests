package ApachePOIExcelDemos;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelLibConfigTC {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		ExcelLibConfig excelObj = new ExcelLibConfig("C:\\Users\\sadaf\\Desktop\\testfile.xlsx");
		
		//Sheet1, row 0, column 0
		System.out.println(excelObj.getData(0, 0, 0));
	}

}
