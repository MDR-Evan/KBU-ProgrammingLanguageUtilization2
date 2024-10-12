import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filename = ".\\data\\test.txt";

        File file = new File(filename);
        if (file.exists()) {
            try {
                java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(file, "r");
                System.out.println((char) randomAccessFile.read());
                randomAccessFile.seek(6L);
                System.out.println((char) randomAccessFile.read());
                randomAccessFile.seek(6L);
                System.out.println((char) randomAccessFile.read());
                randomAccessFile.seek(randomAccessFile.getFilePointer() + 6L);
                System.out.println((char) randomAccessFile.read());
                randomAccessFile.seek(randomAccessFile.getFilePointer() - 4L);
                System.out.println((char) randomAccessFile.read());
                randomAccessFile.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println(file + "이 없습니다.");
        }
    }
}