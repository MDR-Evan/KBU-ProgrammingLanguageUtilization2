import java.io.IOException;
import java.util.Scanner;

public class Report1_PrimeNum {
    private int num;

    public Report1_PrimeNum() throws IOException {
        this.setNum();
    }

    public int getNum() {
        return num;
    }

    public void setNum() throws IOException {
        Scanner kb = new Scanner(System.in);
        while (true){
            System.out.print("자연수 입력 : ");
            num = kb.nextInt();
            if (num > 0) {
                break;
            } else {
                System.err.println("양수로 다시 입력해주세요.");
                System.in.read();
            }
        }
    }

    public String Prime(){
        String result = null;
//        0 ~ 1
        if (num < 2){
            result = "소수와 합성수에 해당되지 않습";
            return result;
        }
//        2
        if (num == 2){
            result = "소수(Prime Number) 입";
            return result;
        }
//        3 ~ n
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                result = "합성수(Composite Number) 입";
                return result;
            }
            result = "소수(Prime Number) 입";
            return result;
        }
        return result;
    }

    @Override
    public String toString() {
        return String.format("%d는 %s니다.", num, Prime());
    }
}