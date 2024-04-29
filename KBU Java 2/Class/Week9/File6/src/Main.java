import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String source = "C:\\Users\\5002\\Documents\\GitHub\\KBU-Java-2\\KBU Java 2\\Class\\Week9\\File5\\Data\\Test.txt";

        File file = new File(source);

        if (file.exists()) {
            InputStreamReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            int hangul = 0;
            int digit = 0;
            int count = 0;
            int alphabet = 0;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                count++;
                for (int i = 0; i < line.length(); i++) {
                    if (Character.getType(line.charAt(i)) == 5) {
                        hangul++;
                    } else if (Character.isDigit(line.charAt(i))) {
                        digit++;
                    } else if (Character.isAlphabetic(line.charAt(i))) {
                        alphabet++;
                    }
                }
            }
            bufferedReader.close();
            fileReader.close();
            System.out.println("라인의 수 : " + count);
            System.out.println("한글의 수 : " + hangul);
            System.out.println("숫자의 수 : " + digit);
            System.out.println("알파벳의 수 : " + alphabet);
        } else {
            System.out.println(file + "이 존재하지 않습니다.");
        }
    }
}