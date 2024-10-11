import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String source = ".\\Data\\Sample.txt";
        String dest = ".\\Data\\Scanner.cpy";

        File input = new File(source);
        if (input.exists()) {
            System.out.println(input + " 파일이 존재합니다.");

            try {
                Scanner kb = new Scanner(input);

                FileWriter f_writer = new FileWriter(dest);
                PrintWriter p_writer = new PrintWriter(f_writer);

                String line;
                int count = 0;

                while (kb.hasNextLine()) {
                    line = kb.nextLine();
                    p_writer.println(line);

                    count++;
                }

                System.out.printf("\n%,d Line의 Text File Copy 성공!", count);

                kb.close();
                f_writer.close();
                p_writer.close();

            } catch (IOException e) {
                System.err.println(e.getMessage());
            }

        } else {
            System.out.println(input + " 파일이 존재하지 않습니다.");
        }
    }
}