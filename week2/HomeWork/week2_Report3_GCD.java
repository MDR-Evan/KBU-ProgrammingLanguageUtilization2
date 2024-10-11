import java.io.IOException;
import java.util.Scanner;

public class Report3_GCD {
    private int num1;
    private int num2;

    public Report3_GCD(int num1, int num2) throws IOException {
        this.input();
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void input() throws IOException {
        Scanner kb = new Scanner(System.in);
        while (true){
            System.out.print("자연수 2개 입력 : ");
            num1 = kb.nextInt();
            num2 = kb.nextInt();
            if (num1 > 0 && num2 > 0) {
                break;
            } else {
                System.err.println("양수로 다시 입력해주세요.");
                System.in.read();
            }
        }
    }

    public int GCD(){
        int GCD = 0;
        int min = 0;

        min = (num1 <= num2) ? num1 : num2;

        for (int i = 1; i <= min; i++){
            if (num1 % i == 0 && num2 % i == 0){
                GCD = i;
            }
        }
        return GCD;
    }

    @Override
    public String toString() {
        return String.format("%d, %d의 GCD(최대공약수)는 %d 입니다.", num1, num2, GCD());
    }
}
