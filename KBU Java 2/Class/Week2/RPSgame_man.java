import java.io.IOException;
import java.util.Scanner;

public class RPSgame_man {
    private int num;

    public RPSgame_man() throws IOException {
        this.setNum();
    }

    public int getNum() {
        return num;
    }

    private void setNum() throws IOException {
        Scanner kb = new Scanner(System.in);
        while (true) {
            System.out.print("숫자 입력(1 : 가위, 2 : 바위, 3 : 보)\n=>");
            num = kb.nextInt();
            if (num >= 1 && num <= 3) {
                break;
            } else {
                System.err.println("입력 오류");
                System.in.read();
            }
        }
    }

    @Override
    public String toString() {
        return String.format("User : %s\n", num == 1 ? "가위" : (num == 2 ? "바위" : "보"));
    }
}
