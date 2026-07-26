package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    private static final String FILE_PATH = "TestData/InstituteData.xlsx";

    // Read Single Cell
    public static String getCellData(String sheetName, int rowNum, int cellNum) {

        try {
            FileInputStream fis = new FileInputStream(FILE_PATH);

            XSSFWorkbook workbook = new XSSFWorkbook(fis);

            XSSFSheet sheet = workbook.getSheet(sheetName);

            Row row = sheet.getRow(rowNum);

            DataFormatter formatter = new DataFormatter();

            String value = formatter.formatCellValue(row.getCell(cellNum));

            workbook.close();

            return value;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }

    // Read Complete Excel Data (DataProvider)
    public static Object[][] getTestData(String sheetName) {

        try {

            FileInputStream fis = new FileInputStream(FILE_PATH);

            XSSFWorkbook workbook = new XSSFWorkbook(fis);

            XSSFSheet sheet = workbook.getSheet(sheetName);

            int totalRows = sheet.getLastRowNum();
            int totalColumns = sheet.getRow(0).getLastCellNum();

            Object[][] data = new Object[totalRows][totalColumns];

            DataFormatter formatter = new DataFormatter();

            for (int i = 1; i <= totalRows; i++) {

                for (int j = 0; j < totalColumns; j++) {

                    data[i - 1][j] = formatter.formatCellValue(
                            sheet.getRow(i).getCell(j));
                }
            }

            workbook.close();

            return data;

        } catch (Exception e) {

            e.printStackTrace();

            return new Object[0][0];
        }
    }
}