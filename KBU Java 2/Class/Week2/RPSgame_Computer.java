import java.util.Random;

public class RPSgame_Computer {
    private int num; //1 : 가위, 2 : 바위, 3 : 보

    public RPSgame_Computer() {
        Random random = new Random(System.currentTimeMillis());
        num = random.nextInt(3) + 1;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return String.format("COM : %s\n", num == 1 ? "가위" : (num == 2 ? "바위" : "보"));
    }
}
