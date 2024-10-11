import java.io.*;
import java.util.Scanner;

public class Report2 {
    public static void main(String[] args) {
        String path = ".\\data\\phone.txt";
        File file = new File(path);

        try {
            if (file.exists()) {
                Scanner input = new Scanner(file);

                Scanner userInput = new Scanner(System.in);
                System.out.print("검색을 원하는 학생의 이름 입력 : ");
                String name = userInput.next();

                boolean found = false;

                while (input.hasNextLine()) {
                    String line = input.nextLine();
                    if (line.contains(name)) {
                        System.out.println(line);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("해당 이름을 가진 학생을 찾을 수 없습니다.");
                }

                input.close();
                userInput.close();
            } else {
                System.out.printf("\n %s 파일이 존재하지 않습니다.", path);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다: " + e.getMessage());
        }
    }
}
