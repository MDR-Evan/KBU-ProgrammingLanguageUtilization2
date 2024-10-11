import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

import static sun.nio.ch.IOStatus.EOF;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String page = "https://manage.kbu.ac.kr/resources/_Plugin/namoeditor/binary/images/000035/KakaoTalk_20230817_125142948_01_(1).jpg";
        String dest = ".\\Data\\kbu1.jpg";

        try {
            URL url = new URL(page);
            InputStream inputStream = url.openStream();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            FileOutputStream outputStream = new FileOutputStream(dest);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);

//            byte[] buffer = new byte[1024];
//            int size;
//            int count = 0;
//
//            while ((size = inputStream.read(buffer)) != EOF) {
//                outputStream.write(buffer, 0, size);
//                count += size;
//            }

            byte[] bytes = bufferedInputStream.readAllBytes();
            bufferedOutputStream.write(bytes);

//            System.out.printf("\n%,d Byte Image File Copy 성공!", count);
            System.out.printf("\n%,d Byte Image File Copy 성공!", bytes.length);
            inputStream.close();
            bufferedInputStream.close();
            outputStream.close();
            bufferedOutputStream.close();

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}