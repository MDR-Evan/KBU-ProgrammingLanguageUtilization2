import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ExcelHandler {
    private Scanner keyboard;
    private final String[] subject = {"국어", "영어", "수학"};

    public ExcelHandler() {
        this.keyboard = new Scanner(System.in);
    }
    public void makeExcel(String filename) throws IOException {
        ArrayList<Student> students = new ArrayList<>();
        while (true) {
            String name;
            String hakbun;
            while (true) {
                System.out.printf("%d번 째 학생의 이름 입력(한글 3자리 입력) : ", students.size() + 1);
                name = keyboard.next();
                if (name.length() != 3) {
                    System.err.println("이름 입력에 오류가 발생했습니다.");
                    System.in.read();
                } else {
                    break;
                }
            }

            while (true) {
                System.out.printf("%s학생의 학번 입력(숫자 7자리 입력) : ", name);
                hakbun = keyboard.next();
                if (hakbun.length() != 7) {
                    System.err.println("학번 입력에 오류가 발생했습니다.");
                    System.in.read();
                } else {
                    break;
                }
            }

            int kor = input(name, subject[0]);
            int eng = input(name, subject[1]);
            int math = input(name, subject[2]);
            students.add(new Student(hakbun, name, kor, eng, math));

            char answer;
            while (true) {
                System.out.print("계속 입력 하시겠습니까? (Y/N) : ");
                answer = keyboard.next().charAt(0);
                if (answer == 'Y' || answer == 'y' || answer == 'N' || answer == 'n') {
                    break;
                } else {
                    System.err.println("Y 또는 N으로 입력하시오.");
                }
            }
            if (answer == 'N' || answer == 'n') {
                System.out.printf("%d명을 입력했습니다\n", students.size());
                break;
            }
        }
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("학생 성적");
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
        }

        FileOutputStream outputStream = new FileOutputStream(filename);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        System.out.println("Excel File 생성 성공");
    }

    private int input(String name, String s) throws IOException {
        int score;
        while (true) {
            System.out.printf("%s 학생의 %s 과목 성적 입력 : ", name, s);
            score = keyboard.nextInt();
            if (score >= 0 && score <= 100) {
                break;
            } else {
                System.err.println("학번 입력 오류");
                System.in.read();
            }
        }
        return score;
    }
}
