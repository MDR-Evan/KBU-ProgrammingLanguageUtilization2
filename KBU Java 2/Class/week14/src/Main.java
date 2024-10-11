import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String Path = ".\\data\\";

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("테스트");
        XSSFRow row = sheet.createRow(0);
        XSSFCell cell = row.createCell(0);
        cell.setCellValue("Index1");
        cell = row.createCell(1);
        cell.setCellValue("Index2");
        cell = row.createCell(2);
        cell.setCellValue("Index3");

        for (int i = 0 ; i < 5; i++) {
            row = sheet.createRow(i + 1);
            for (int j = 0; j < 3; j++) {
                cell = row.createCell(j);
                cell.setCellValue("데이터 (" + (i + 1) + "," + (j + 1) + ")");
            }
        }

        try {
            FileOutputStream outputStream = new FileOutputStream(Path);
            workbook.write(outputStream);
            outputStream.close();
            workbook.close();
            System.out.println("Excel File 생성 성공!");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}