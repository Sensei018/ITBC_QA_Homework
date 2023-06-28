package Java_POM_Selenium_TestNG.Domaci18;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteData {

    public static void main(String[] args) {
        String filePath = "domaci18.xlsx";
        try {
            calculateAverages(filePath);
            System.out.println("Proseci su izracunati i upisani u novi sheet.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void calculateAverages(String filePath) throws IOException {
        FileInputStream inputStream = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(inputStream);

        Sheet sheet = workbook.getSheetAt(0);
        int rowCount = sheet.getPhysicalNumberOfRows();

        Sheet newSheet = workbook.createSheet("Proseci");

        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            int cellCount = row.getPhysicalNumberOfCells();

            double sum = 0;
            for (int j = 0; j < cellCount; j++) {
                Cell cell = row.getCell(j);
                double cellValue = cell.getNumericCellValue();
                sum += cellValue;
            }

            double average = sum / cellCount;

            Row newRow = newSheet.createRow(i);
            Cell newCell = newRow.createCell(0);
            newCell.setCellValue(average);
        }

        inputStream.close();

        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }
}