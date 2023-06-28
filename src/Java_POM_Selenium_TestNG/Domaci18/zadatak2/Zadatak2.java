package Java_POM_Selenium_TestNG.Domaci18.zadatak2;

import com.github.javafaker.Faker;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Zadatak2 {

    public static void main(String[] args) {
        String filePath = "5imena.xlsx";
        try {
            updateNames(filePath);
            System.out.println("Imena su ažurirana i upisana u novi sheet.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void updateNames(String filePath) throws IOException {
        FileInputStream inputStream = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(inputStream);

        Sheet sheet = workbook.getSheetAt(0);
        int rowCount = sheet.getPhysicalNumberOfRows();

        List<String> names = new ArrayList<>();

        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            Cell cell =  row.getCell(0);
            String name = cell.getStringCellValue();
            names.add(name);
        }

        Faker faker = new Faker();
        for (int i = 0; i < 5; i++) {
            String name = faker.name().firstName();
            names.add(name);
        }

        Sheet newSheet = workbook.createSheet("Updated Names");

        for (int i = 0; i < names.size(); i++) {
            Row row = newSheet.createRow(i);
            Cell cell = row.createCell(0);
            cell.setCellValue(names.get(i));
        }

        inputStream.close();

        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }
}