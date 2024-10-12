import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String filename = ".\\data\\student.xlsx";

        ExcelHandler handler = new ExcelHandler();
        handler.makeExcel(filename);
    }
}