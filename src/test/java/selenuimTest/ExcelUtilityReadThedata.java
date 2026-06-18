package selenuimTest;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilityReadThedata {

    public static void writeData(String filePath,
                                 String sheetName,
                                 int rowNum,
                                 int cellNum,
                                 String value) throws IOException {

        FileInputStream fis = new FileInputStream(filePath);

        Workbook workbook = WorkbookFactory.create(fis);

        Sheet sheet = workbook.getSheet(sheetName);

        if (sheet == null) {
            sheet = workbook.createSheet(sheetName);
        }

        Row row = sheet.getRow(rowNum);

        if (row == null) {
            row = sheet.createRow(rowNum);
        }

        Cell cell = row.getCell(cellNum);

        if (cell == null) {
            cell = row.createCell(cellNum);
        }

        cell.setCellValue(value);

        fis.close();

        FileOutputStream fos = new FileOutputStream(filePath);
        workbook.write(fos);

        fos.close();
        workbook.close();
    }
    public static void main(String[] args) throws IOException {
    	writeData("D:\\ajeet\\Documents\\Book2.xlsx","Sheet1",2,3,"this is a test doc");
	}
}