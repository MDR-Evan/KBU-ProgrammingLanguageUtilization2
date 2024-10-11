import java.io.*;

public class Main {
    public static void main(String[] args) {
        String source = ".\\Data\\Sample.txt";
        String dest = ".\\Data\\연습.cpy";

        File input = new File(source);

        if (input.exists()) {
            System.out.println(input + " 파일이 존재합니다.");

            try {
                FileReader fileReader = new FileReader(input);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                FileWriter fileWriter = new FileWriter(dest);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                String line;
                int count = 0;

                while ((line = bufferedReader.readLine()) != null) {
                    String reverse = "";
                    for (int i = line.length() - 1; i >= 0; i--) {
                        reverse = reverse + line.charAt(i);
                    }
//                    bufferedWriter.write(line + '\n');
                    bufferedWriter.write(reverse + '\n');
                    count++;
                }
                System.out.printf("\n%,d Line의 Text File Copy 성공!", count);

                bufferedReader.close();
                fileReader.close();

                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }

        } else {
            System.out.println(input + " 파일이 존재하지 않습니다.");
        }
    }
}