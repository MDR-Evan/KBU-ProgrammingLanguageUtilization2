import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) {
            String filename = ".\\data\\temp.txt";

        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(filename, "rw");
            randomAccessFile.seek(10L);
            randomAccessFile.writeUTF("홍길동");
            randomAccessFile.seek(0L);
            randomAccessFile.writeInt(100);
            randomAccessFile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}