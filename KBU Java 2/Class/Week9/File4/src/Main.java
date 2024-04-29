import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String source = "C:\\sample\\test\\";
        String filename = "홍길동.txt";
        String backupname = "홍길동.bak";

        File dir = new File(source);

        if (dir.exists()) {
            System.out.println(source + "Source Directory 파일 존재");
        } else {
            if (dir.mkdirs()) {
                System.out.println(source + "Source Directory 생성 성공");
            } else {
                System.out.println(source + "Source Directory 생성 실패");
            }
        }

        File file = new File(source + filename);
        if (file.exists()) {
            System.out.println(file + "파일 존재");
            if (file.renameTo(new File(source + backupname))) {
                System.out.println(backupname + "파일이 백업되었습니다.");
            } else {
                System.out.println(backupname + "백업 실패");
            }
        } else {
            if (file.createNewFile()) {
                System.out.println(file + "File 생성 성공");
            } else {
                System.out.println(file + "File 생성 실패");
            }
        }
    }
}