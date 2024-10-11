import java.io.IOException;
import java.util.Scanner;

public class game369_Object {
    private int num;    //0 ~ 99

    public game369_Object() throws IOException {
        this.setNum();
    }

    public int getNum() {
        return num;
    }

    private void setNum() throws IOException {
        Scanner kb = new Scanner(System.in);
        while (true) {
            System.out.print("0 ~ 99 사이의 정수 입력 : ");
            num = kb.nextInt();
            if (num >= 0 && num <= 99) {
                break;
            } else {
                System.err.println("입력 오류");
                System.in.read();
            }
        }
    }

    private String game() {
        String result;
        int i = num / 10;
        int j = num % 10;
        if ((i == 3 || i == 6 || i == 9) && (j == 3 || j == 6 || j == 9)) {
            result = "박수 - 짝짝";
        } else if ((i == 3 || i == 6 || i == 9) || (j == 3 || j == 6 || j == 9)){
            result = "박수 - 짝";
        } else {
            result = "박수 - 없음";
        }
        return result;
    }

    @Override
    public String toString() {
        return String.format("숫자 : %d, %s\n", num, game());
    }
}
