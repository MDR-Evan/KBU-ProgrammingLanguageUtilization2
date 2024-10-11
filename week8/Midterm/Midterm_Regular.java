import java.io.IOException;
import java.util.Scanner;

public class Regular extends Employee{
    protected int grade;

    public Regular(String name, String bunho, int grade) {
        super(name, bunho);
        this.grade = grade;
    }

//    public Regular(String name, String bunho, int grade) {
//        super(name, bunho);
//        this.grade = grade;
//    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void input() throws IOException {
        Scanner kb = new Scanner(System.in);

        while(true) {
            System.out.printf("%s님의 호봉을 입력하시오.\n-> ", name);
            grade = kb.nextInt();
            if (grade > 0 && grade <= 5) {
                break;
            } else {
                System.err.println("호봉을 다시 확인해주세요.");
                System.in.read();
            }
        }
    }

    @Override
    public int basic() {
        int basic = 0;
        switch (grade) {
            case 1:
                basic = 1600000;
                break;
            case 2:
                basic = 1800000;
                break;
            case 3:
                basic = 2100000;
                break;
            case 4:
                basic = 2400000;
                break;
            case 5:
                basic = 2800000;
                break;
        }
        return basic;
    }

    @Override
    public int incentive() {
        return 0;
    }

    @Override
    public int commission() {
        return 0;
    }

    @Override
    public int salary() {
        int salary = basic() + incentive() + commission();
        return salary;
    }

    @Override
    public int tax() {
        int tax;
        if (salary() <= 1000000) {
            tax = (int) (salary() * 0.02f);
        } else if (salary() > 1000000 && salary() <= 3000000) {
            tax = (int) (salary() * 0.03f);
        } else {
            tax = (int) (salary() * 0.04f);
        }
        return tax;
    }

    @Override
    public int pay() {
        int pay = salary() - tax();
        return pay;
    }

    public String display() {
        return super.toString();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\t%1d급\t 0\t     0원\t%,9d원\t%,9d원\t%,9d원\t%,9d원\t%,9d원\t%,9d원\t고정급", grade, basic(), incentive(), commission(), salary(), tax(), pay());
    }
}
