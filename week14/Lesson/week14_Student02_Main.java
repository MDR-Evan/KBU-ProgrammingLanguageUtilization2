import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String filename = ".\\data\\student.xlsx";
        String output = ".\\data\\studentoutput.xlsx";
        ArrayList<Student> students;

        File file = new File(filename);

        if (file.exists()) {
            ExcelHandler handler = new ExcelHandler();
            students = handler.readExcel(file);
            ClassRoom classRoom = new ClassRoom(students);
            classRoom.display(output);
        } else {
            System.err.println(file + "이 존재하지 않습니다.");
        }
    }
}