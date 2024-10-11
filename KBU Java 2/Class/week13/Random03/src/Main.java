import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String filename = ".\\data\\Student.dat";

        FileHandler fileHandler = new FileHandler();
        fileHandler.inputData(filename);
    }
}