import java.io.*;

import static sun.nio.ch.IOStatus.EOF;

public class Main {
    public static void main(String[] args) {
        String source = "C:\\Windows\\notepad.exe";
        String dest = ".\\Data\\note.exe";

        File input = new File(source);
        if (input.exists()) {
            System.out.println(input + " 파일이 존재합니다.");
            try {
                FileOutputStream fos = new FileOutputStream(dest);
                FileInputStream fis = new FileInputStream(input);

                byte[] buffer = new byte[1024];
                int size;
                int count = 0;

                while ((size = fis.read(buffer)) != EOF) {
                    fos.write(buffer, 0, size);
                    count += size;
                }
                System.out.printf("\n%,d Bytes File Copy 성공!", count);
                fis.close();
                fos.close();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        } else {
            System.out.println(input + " 파일이 존재하지 않습니다.");
        }
    }
}