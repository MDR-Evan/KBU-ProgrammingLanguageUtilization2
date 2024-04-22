import java.io.IOException;
import java.util.Scanner;

public class Temporary extends Employee{
    private int day;

//    public Temporary(String name, String bunho) {
//        super(name, bunho);
//    }

    public Temporary(String name, String bunho, int day) {
        super(name, bunho);
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void input() throws IOException {
        Scanner kb = new Scanner(System.in);

        while(true) {
            System.out.printf("%s님의 근무 일수를 입력하시오.\n-> ", name);
            day = kb.nextInt();
            if (day > 0 && day <= 31) {
                break;
            } else {
                System.err.println("근무 일수를 다시 확인해주세요.");
                System.in.read();
            }
        }
    }

    @Override
    public int basic() {
        int ildang = day * day_pay;
        return ildang;
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

    @Override
    public String toString() {
        return super.toString() + String.format("\t 급\t%2d\t%,6d원\t%,9d원\t%,9d원\t%,9d원\t%,9d원\t%,9d원\t%,9d원\t일당제", day, day_pay, basic(), incentive(), commission(), salary(), tax(), pay());
    }
}
