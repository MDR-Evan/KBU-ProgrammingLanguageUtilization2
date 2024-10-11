import java.io.IOException;
import java.util.Scanner;

public class House extends Man {
    protected int index;   // 수도 구분, 사용량
    protected float use_W;

    public House(String[] person) {
        super(person);
        this.index = index;
        this.use_W = use_W;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getUse_W() {
        return (int) use_W;
    }

    public void setUse_W(int use_W) {
        this.use_W = use_W;
    }

    protected void input() throws IOException {
        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.println("구분을 입력하시오 : ");
            index = kb.nextInt();

            if (index > 0 && index < 6) {
                break;
            } else {
                System.err.println("용도를 다시 확인하여 입력해주세요.");
                System.in.read();
            }
        }

        while (true) {
            System.out.println("사용량을 입력하시오 : ");
            use_W = kb.nextFloat();
            if (use_W < 0) {
                System.err.println("사용량을 다시 확인해주세요.");
                System.in.read();
            } else {
                break;
            }
        }
    }

    @Override
    public int fee() {
        int use = (int) (use_W + 0.5);  // 반올림
        return use * 40 + basic;
    }

    @Override
    public int tax() {
        int tax = (int) (fee() * 0.05f);
        tax = (tax / 10) * 10;
        return tax;
    }

    @Override
    public int pay() {
        int pay = fee() + tax();
        return pay;
    }

    protected String display() {
        return super.toString();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\t가정용\t%,8.2f\t%,7d원\t%,6d원\t%,7d원", use_W, fee(), tax(), pay());
    }
}
