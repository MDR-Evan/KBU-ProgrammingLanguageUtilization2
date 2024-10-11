import java.io.*;
import static sun.nio.ch.IOStatus.EOF;

public class Main {
    public static void main(String[] args) {
        String source = ".\\Data\\Sample.txt"; // Text File
        String dest = ".\\Data\\Sample.cpy";

        File input = new File(source);
        if (input.exists()) {
            System.out.println(input + " 파일이 존재합니다.");
            try {
                FileReader reader = new FileReader(input);
                FileWriter fileWriter = new FileWriter(dest);

                int ch;
                int count = 0;

                while ((ch = reader.read()) != EOF) {
                    fileWriter.write(ch);
                    count++;
                }

                System.out.printf("\t%,d 개의 글자인 Text File Copy 성공!", count);
                reader.close();
                fileWriter.close();

            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        } else {
            System.out.println(input + " 파일이 존재하지 않습니다.");
        }
    }
}