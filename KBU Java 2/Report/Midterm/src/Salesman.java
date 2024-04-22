import java.io.IOException;
import java.util.Scanner;

public class Salesman extends Regular{
    int commission;


//    public Salesman(String name, String bunho, int commission) {
//        super(name, bunho, grade);
//        this.commission = commission;
//    }

    public Salesman(String name, String bunho, int grade, int commission) {
        super(name, bunho, grade);
        this.commission = commission;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public void input() throws IOException {
        Scanner kb = new Scanner(System.in);

        while(true) {
            System.out.printf("%s님의 호봉을 입력하시오.\n-> ", name);
            grade = kb.nextInt();
            if (grade > 0 && grade <= 5) {
            } else {
                System.err.println("호봉을 다시 확인해주세요.");
                System.in.read();
            }

            System.out.printf("%s님의 판매금액을 입력하시오.\n-> ", name);
            commission = kb.nextInt();
            if (commission > 0) {
                break;
            } else {
                System.err.println("판매금액을 다시 확인해주세요.");
                System.in.read();
            }
        }
    }

    @Override
    public int commission() {
        int bonus = (int) (commission * 0.05f);
        return bonus;
    }

    @Override
    public String toString() {
        return super.display() + String.format("\t%1d급\t 0\t     0원\t%,9d원\t%,9d원\t%,9d원\t%,9d원\t%,9d원\t%,9d원\t성과급", grade, basic(), incentive(), commission(), salary(), tax(), pay());
    }
}
