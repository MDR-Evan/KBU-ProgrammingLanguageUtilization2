import java.io.IOException;
import java.util.Scanner;

public class Tabaco_Main {
    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);

        int cigar;
        int year;

        while (true){
            System.out.println("하루에 담배 몇 개피를 태우시나요 ?");
            cigar = kb.nextInt();
            if (cigar > 0 && cigar <= 100){
                break;
            } else {
                System.err.println("입력 오류");
                System.in.read();
            }
        }
        while (true){
            System.out.println("흡연한지 몇 년 되었습니까 ?");
            year = kb.nextInt();
            if (year > 0 && year <= 100){
                break;
            } else {
                System.err.println("입력 오류");
                System.in.read();
            }
        }
        Tabaco_Object Tabaco = new Tabaco_Object(cigar, year);

        System.out.println(Tabaco);
    }
}
