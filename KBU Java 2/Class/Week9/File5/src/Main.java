import sun.nio.ch.IOStatus;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String source = ".\\Data\\Test.txt";

        File file = new File(source);

        if (file.exists()) {
            System.out.printf("File Size : %,d Bytes\n", file.length());
            FileInputStream inputStream = new FileInputStream(file);
            byte[] bytes = new byte[3000];

            int count = 0;
            int total = 0;
            while ((count = inputStream.read(bytes)) != IOStatus.EOF);
                total += count;
                count = bytes.length;
                inputStream.close();
                System.out.printf("File Size : %,d Bytes\n", total);
        } else {
            System.out.println(file + "이 존재하지 않음");
        }
    }
}