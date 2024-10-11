import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Customer extends Man{
    private int used;

    public Customer(String[] person, int used) {
        super(person);
        this.used = used;
    }

    public int getUsed() {
        return used;
    }

    protected void input() throws IOException {
        Scanner kb = new Scanner(System.in);

        while (true){
            System.out.printf("%s님의 사용량 입력 : ", super.person[1]);
            used = kb.nextInt();
            if (used < 0 || used > 999) {
                System.err.println("사용량 입력 오류");
                System.in.read();
            } else {
                break;
            }
        }
    }

    protected int fee() {
        int fee = 0;
        int basic = 1660;
        float[] table = {184.1f, 223.8f, 278.3f, 353.6f, 466.4f, 643.9f};

        if (used <= 100) {
            fee = (int) (used * table[0]) + basic;
        } else if (used <= 200) {
            fee = (int) (100 * table[0]) + basic;
            fee += (int) ((used - 100) * table[1]);
        } else if (used <= 300) {
            fee = (int) (100 * table[0]) + basic;
            fee += (int) ((used - 100) * table[1]);
            fee += (int) ((used - 200) * table[2]);
        } else if (used <= 400) {
            fee = (int) (100 * table[0]) + basic;
            fee += (int) (100 * table[1]);
            fee += (int) (100 * table[2]);
            fee += (int) ((used - 300) * table[3]);
        } else if (used <= 400) {
            fee = (int) (100 * table[0]) + basic;
            fee += (int) (100 * table[1]);
            fee += (int) (100 * table[2]);
            fee += (int) (100 * table[3]);
            fee += (int) ((used - 400) * table[4]);
        } else {
            fee = (int) (100 * table[0]) + basic;
            fee += (int) (100 * table[1]);
            fee += (int) (100 * table[2]);
            fee += (int) (100 * table[3]);
            fee += (int) (100 * table[4]);
            fee += (int) ((used - 500) * table[5]);
        }

        return fee;
    }

    protected int tax() {
        return (int) (fee() * (7 / 100.0f));
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" %4d Kw %,8d원 %,6d원 %,8d원", used, fee(), tax(), fee()+tax());
    }
}
