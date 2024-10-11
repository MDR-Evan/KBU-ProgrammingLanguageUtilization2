import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Report3 {
    public static void main(String[] args) {
        String input = ".\\data\\kbu.png";
        String output = ".\\data\\경복대학교.png";

        File fi = new File(input);
        File fo = new File(output);

        try {
            Files.copy(fi.toPath(), fo.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File Copy 완료");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
