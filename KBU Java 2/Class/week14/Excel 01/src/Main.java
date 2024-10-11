import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {
    public static void main(String[] args) {
        String Path = ".\\data\\test.xlsx";
        File file = new File(Path);

        if (file.exists()) {
            try {
                FileInputStream inputStream = new FileInputStream(file);
                XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
                XSSFSheet sheet = workbook.getSheet("테스트");
                for (int rowIndex = 0; rowIndex < sheet.getPhysicalNumberOfRows(); rowIndex++) {
                    XSSFRow row = sheet.getRow(rowIndex);
                    if (row != null) {
                        int cells = row.getPhysicalNumberOfCells();
                        for (int columnIndex = 0; columnIndex < cells; columnIndex++) {
                            XSSFCell cell = row.getCell(columnIndex);
                            String value = "";
                            if (cell == null) {
                                continue;
                            } else {
                                switch (cell.getCellType()) {
                                    case FORMULA:
                                        value = cell.getCellFormula();
                                        break;
                                    case NUMERIC:
                                        value = cell.getNumericCellValue() + "";
                                        break;
                                    case STRING:
                                        value = cell.getStringCellValue();
                                        break;
                                    case BLANK:
                                        value = cell.getBooleanCellValue() + "";
                                        break;
                                    case ERROR:
                                        value = cell.getErrorCellValue() + "";
                                        break;
                                }
                            }
                            System.out.println(rowIndex + "번 행 : " + columnIndex + "번 열의 값 : " + value);
                        }
                    }
                }
                inputStream.close();
                workbook.close();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        } else {
            System.out.println(file + "이 존재하지 않습니다.");
        }
    }
}