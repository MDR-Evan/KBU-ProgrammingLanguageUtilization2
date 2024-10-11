import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import static sun.nio.ch.IOStatus.EOF;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String image = "https://manage.kbu.ac.kr/resources/_Plugin/namoeditor/binary/images/000054/20231120101003209_0XS902EE.png";
        String dest = ".\\Data\\sample.png";

        try {
            URL url = new URL(image);
            InputStream inputStream = url.openStream();
            FileOutputStream outputStream = new FileOutputStream(dest);
            int data;
            int size = 0;

            while ((data = inputStream.read()) != EOF) {
                outputStream.write(data);
                size++;
            }
            System.out.printf("\n%,d Byte Image File Copy 성공!",size);
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}