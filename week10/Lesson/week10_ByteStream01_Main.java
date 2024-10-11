import java.io.*;

import static sun.nio.ch.IOStatus.EOF;

public class Main {
    public static void main(String[] args) {
        String source = "C:\\Windows\\notepad.exe";
        String dest = ".\\Data\\note.exe";
        String backup = ".\\Data\\note.bak";

        File input = new File(source);
        if (input.exists()) {
            System.out.println(input + " 파일이 존재합니다.");
            input.renameTo(new File(backup));
            try {
                FileInputStream IS = new FileInputStream(input);
                FileOutputStream OS = new FileOutputStream(dest);
                int data;
                int size = 0;

                while ((data = IS.read()) != EOF) {
                    OS.write(data);
                    size++;
                }
                System.out.printf("\n%,d Bytes File Copy 성공!!", size);
                IS.close();
                OS.close();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        } else {
            System.out.println(input + " 파일이 존재하지 않습니다.");
        }
    }
}