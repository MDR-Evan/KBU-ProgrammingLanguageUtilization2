import java.io.*;
import java.util.Scanner;


public class Report1 {
    public static void main(String[] args) throws IOException {
        String path = ".\\data\\phone.txt";

        try(PrintWriter printWriter = new PrintWriter(new FileWriter(path))) {
            Scanner kb = new Scanner(System.in);

            while(true) {
                System.out.print("이름 입력 : ");
                String name = kb.next();

                if (name.equals("그만")) {
                    break;
                }

                System.out.print("전화번호 입력 : ");
                String phone = kb.next();

                printWriter.println(name + " : " + phone);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}