import java.io.IOException;
import java.util.Scanner;

public class Report2_divisor {
    private int num;

    public Report2_divisor() throws IOException {
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

    public void divisor(){
        System.out.printf("%d의 약수는 ",num);
        for (int i = 1; i <=num; i++){
            if (num % i == 0){
                System.out.print(i);
                if (i != num) {
                    System.out.print(", ");
                }
            }
        }
        System.out.print("입니다.");
    }

    public int addition(){
        int result = 0;
        for (int i = 1; i <=num; i++){
            if (num % i == 0){
                result += i;
            }
        }
        return result;
    }

    public String toString() {
        int result = addition();
        return String.format("\n약수의 합은 %d 입니다.",result);
    }
}
