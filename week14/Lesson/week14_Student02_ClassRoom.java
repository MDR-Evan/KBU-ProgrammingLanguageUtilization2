import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ClassRoom {
    ArrayList<Student> students;

    public ClassRoom(ArrayList<Student> students) {
        this.students = students;
    }

    public void display(String output) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("학생 성적 처리");
        XSSFRow row = sheet.createRow(0);
        XSSFCell cell = row.createCell(0);
        cell.setCellValue("학번");
        cell = row.createCell(1);
        cell.setCellValue("이름");
        cell = row.createCell(2);
        cell.setCellValue("국어");
        cell = row.createCell(3);
        cell.setCellValue("영어");
        cell = row.createCell(4);
        cell.setCellValue("수학");
        cell = row.createCell(5);
        cell.setCellValue("총점");
        cell = row.createCell(6);
        cell.setCellValue("평균");
        cell = row.createCell(7);
        cell.setCellValue("석차");

        for (int i = 0; i < students.size(); i++) {
            row = sheet.createRow(i + 1);
            cell = row.createCell(0);
            cell.setCellValue(students.get(i).getHakbun());
            cell = row.createCell(1);
            cell.setCellValue(students.get(i).getName());
            cell = row.createCell(2);
            cell.setCellValue(students.get(i).getKor());
            cell = row.createCell(3);
            cell.setCellValue(students.get(i).getEng());
            cell = row.createCell(4);
            cell.setCellValue(students.get(i).getMath());
            cell = row.createCell(5);
            cell.setCellValue(students.get(i).sum());
            cell = row.createCell(6);
            cell.setCellValue(students.get(i).avg());
            cell = row.createCell(7);
            cell.setCellValue(getRank(i));
        }

        try {
            FileOutputStream outputStream = new FileOutputStream(output);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();

            System.out.println("Excel File 처리 완료");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public int getRank(int index) {
        int rank = 1;
        int sum = students.get(index).sum();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).sum() > sum) {
                rank++;
            }
        }

        return rank;
    }
}
