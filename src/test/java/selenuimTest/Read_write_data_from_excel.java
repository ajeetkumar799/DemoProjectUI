package selenuimTest;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_write_data_from_excel {
	public static String getDataFromExcelSheet(String filePath,String sheetName, int rowNo, int cellNo) throws IOException 
	{
		
		String data = "";
		FileInputStream file = new FileInputStream(filePath);
		Workbook workbook = WorkbookFactory.create(file);
	    Sheet sheet = workbook.getSheet(sheetName);
         Row roww = sheet.getRow(rowNo);
		  Cell cell = roww.getCell(cellNo);
	
			try {
				data = cell.getStringCellValue();
			}
			catch(IllegalStateException e)
			{
				double value = cell.getNumericCellValue();
			      //int intValue = (int) Math.round(value);
				long doubleToLong = (long)value;
				
				String  longToString = String.valueOf(doubleToLong);
				
				data = longToString;
			}
			catch(NullPointerException e)
			{
				//System.out.println("Cell is Blank");
			}
		
	    workbook.close();
	    return data;   
}

	public static void main(String[] args) throws IOException {
		String data =getDataFromExcelSheet("D:\\ajeet\\Documents\\Book1.xlsx\\","Sheet1", 1, 0);
		System.out.println(data);
	}
}
