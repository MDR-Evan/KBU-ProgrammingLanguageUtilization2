import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import static org.apache.poi.util.HexRead.readData;

public class ExcelHandler {
    public ArrayList<Student> readExcel(File file) {
        ArrayList<Student> students = new ArrayList<>();
        try {
            FileInputStream inputStream = new FileInputStream(file);
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheet("학생 성적");
            for (int rowIndex = 1; rowIndex < sheet.getPhysicalNumberOfRows(); rowIndex++) {
                XSSFRow row = sheet.getRow(rowIndex);
                Student student = new Student();
//                for (int columnIndex = 0; columnIndex < row.getPhysicalNumberOfCells(); columnIndex++) {}
                student.setHakbun(readData(row, 0));
                student.setName(readData(row, 1));
                student.setKor(Integer.parseInt(readData(row, 2)));
                student.setEng(Integer.parseInt(readData(row, 3)));
                student.setMath(Integer.parseInt(readData(row, 4)));
                students.add(student);
            }
            inputStream.close();
            workbook.close();

            System.out.printf("%d개의 Data를 읽었습니다.\n", students.size());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        return students;
    }

    private String readData(XSSFRow row, int i) {
        XSSFCell cell = row.getCell(i);
        String value = "";
        if (cell != null) {
            switch  (cell.getCellType()) {
                case FORMULA :
                    value = cell.getCellFormula();
                    break;
                case NUMERIC :
                    value = (int) cell.getNumericCellValue() + "";
                    break;
                case STRING :
                    value = cell.getStringCellValue();
                    break;
                case BLANK :
                    value = cell.getBooleanCellValue() + "";
                    break;
                case ERROR :
                    value = cell.getErrorCellValue() + "";
                    break;
            }
        }

        return value;
    }
}
