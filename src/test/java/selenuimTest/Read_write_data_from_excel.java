package selenuimTest;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_write_data_from_excel {
	public static String getDataFromExcelSheet(String filePath, String sheetName, int rowNo, int cellNo) throws IOException {
	    String data = "";

	    try (FileInputStream file = new FileInputStream(filePath);
	         Workbook workbook = WorkbookFactory.create(file)) {

	        Sheet sheet = workbook.getSheet(sheetName);
	        Row row = sheet.getRow(rowNo);

	        if (row != null) {
	            Cell cell = row.getCell(cellNo);

	            if (cell != null) {
	                try {
	                    data = cell.getStringCellValue();
	                } catch (IllegalStateException e) {
	                    double value = cell.getNumericCellValue();
	                    data = String.valueOf(value);
	                }
	            }
	        }
	    }

	    return data;
	}

	public static void main(String[] args) throws IOException {
		String data =getDataFromExcelSheet("D:\\ajeet\\Documents\\Book1.xlsx\\","Sheet1", 1, 0);
		System.out.println(data);
	}
}
