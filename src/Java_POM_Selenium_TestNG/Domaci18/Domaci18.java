package Java_POM_Selenium_TestNG.Domaci18;

import java.io.*;


import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Domaci18 {
    public Domaci18() throws FileNotFoundException {
    }

    public static void main(String[] args) {


        try {
            readData("domaci18.xlsx");
        } catch (FileNotFoundException fnfe) {
            System.out.println("Nevalidna putanja");
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }


    public static void readData(String relativePath) throws IOException {

        FileInputStream inputStream = new FileInputStream(relativePath);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);
        double cellValue = (double) sheet.getRow(0).getCell(0).getNumericCellValue();


        double rowCount = sheet.getPhysicalNumberOfRows();

        for (int i = 0; i < rowCount; i++) {
            XSSFRow row = sheet.getRow(i);

            int cellCount = row.getPhysicalNumberOfCells();
            double sum=0;
            for (int j = 0; j < cellCount; j++) {
                XSSFCell cell = row.getCell(j);
                cellValue = cell.getNumericCellValue();
                sum+=cellValue;
                System.out.print(" || " + cellValue);

                double average = sum/cellCount;

                XSSFCell averageCell= row.createCell(cellCount);
                averageCell.setCellValue(average);


            }
        }
        inputStream.close();
        workbook.close();

    }
        FileOutputStream outputStream= new FileOutputStream("domaci18.xlsx");
    public static int getCellValue(XSSFCell cell) {
        switch (cell.getCellType()) {
            case NUMERIC:                          //Ukoliko zelimo da pokrijemo i ostale tipove podataka,
                                                    // u Switch-u cemo uneti case: BOOLEAN, case:String
                return (int) cell.getNumericCellValue();

            default:
                break;

        }

        return 0;
    }






//    public static void writeData() throws IOException {
//        XSSFWorkbook workbook = new XSSFWorkbook();
//        XSSFSheet proracun = workbook.createSheet("Proracun");
//
//        int rowCount=proracun.getPhysicalNumberOfRows();
//
//        for (int i = 0; i < rowCount; i++) {
//            XSSFRow row = proracun.createRow(i);
//            XSSFCell cell = row.createCell(0);
//            int cellCount=row.getPhysicalNumberOfCells();
//            double sum=0;
//            int count=0;
//
//            for (int j = 0; j < (int) cellCount; j++) {
//                XSSFCell cell1 = row.getCell(j);
//                if (cell.getCellType() == CellType.NUMERIC) {
//                    sum += cell.getNumericCellValue();
//                    count++;
//                }
//            }
//
//            double prosek= count>0 ? sum / count : 0;
//
//            XSSFRow outputRow = proracun.createRow(i);
//            XSSFCell outputCell = outputRow.createCell(0);
//            outputCell.setCellValue(prosek);
//        }
//        FileOutputStream outputStream = new FileOutputStream("domaci18.xlsx");
//        workbook.write(outputStream);
//        outputStream.close();
   // }


}
