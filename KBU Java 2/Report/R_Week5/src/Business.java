import java.io.IOException;
import java.util.Scanner;

public class Business extends Man {
    protected float[] used;
    private static Sum sum1 = new Sum();

    public Business(String[] person, float[] used) {
        super(person);
        this.used = used;
    }

    protected void input() throws IOException {
        Scanner kb = new Scanner(System.in);

        while (true) {  // 사용량 입력
            System.out.printf("%s님의 사용량 입력 : ", super.person[1]);
            used[0] = kb.nextFloat();
            if (used[0] < 0) {
                System.err.println("사용량 입력 오류\n0이하로는 입력이 불가합니다.");
                System.in.read();
            } else {
                break;
            }
        }

        while (true) {  // 구분 입력
            System.out.println("1 - 가정용, 2 - 영업용, 3 - 공장용, 4 - 관공서, 5 - 군기관");
            System.out.printf("%s님의 수도 용도 입력 : ", super.person[1]);
            used[1] = kb.nextFloat();
            if (used[1] < 0 || used[1] > 6) {
                System.err.println("1 - 가정용, 2 - 영업용, 3 - 공장용, 4 - 관공서, 5 - 군기관\n입력에 오류가 있습니다. 1 ~ 5 용도에 맞게 입력해주세요.");
                System.in.read();
            } else {
                break;
            }
        }
    }

    protected String group_string() {   // 구분
        int group = (int) used[1];
        String categorize = "";

        switch (group) {
            case 1:
                categorize = "가정용";
                break;
            case 2:
                categorize = "영업용";
                break;
            case 3:
                categorize = "공장용";
                break;
            case 4:
                categorize = "관공서";
                break;
            case 5:
                categorize = "군기관";
                break;
        }
        return categorize;
    }

    protected float used_fee() {  // 사용 금액
        int gruop = (int) used[1];
        float use = used[0];
        float use_fee;

        if (gruop == 1) {
            use_fee = (use * 40);
        } else if (gruop == 2) {
            use_fee = (use * 55);
        } else if (gruop == 3) {
            use_fee = (use * 78);
        } else if (gruop == 4) {
            use_fee = (use * 35);
        } else {
            use_fee = (use * 20);
        }

        return use_fee;
    }

    protected int tax() {   // TAX
        int basic = 1200;
        int tax;
        float[] tax_table = {0.05f, 0.035f, 0.025f, 0.015f, 0};

        switch ((int) used[1]) {
            case 1:
                tax = (int) ((basic + used_fee()) * tax_table[0]);
                tax = (tax / 10) * 10;
                break;
            case 2:
                tax = (int) ((basic + used_fee()) * tax_table[1]);
                tax = (tax / 10) * 10;
                break;
            case 3:
                tax = (int) ((basic + used_fee()) * tax_table[2]);
                tax = (tax / 10) * 10;
                break;
            case 4:
                tax = (int) ((basic + used_fee()) * tax_table[3]);
                tax = (tax / 10) * 10;
                break;
            case 5:
                tax = (int) ((basic + used_fee()) * tax_table[4]);
                tax = (tax / 10) * 10;
                break;
            default:
                tax = 0;
                break;
        }

        return tax;
    }

    protected int fee() {   // 납부액
        int basic = 1200;
        int fee;

        fee = (int) (basic + used_fee() + tax());
        return fee;
    }

    protected void Sum() {
        sum1.Cul(used[0], (int) used_fee(), tax(), fee());
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\t %3s\t  %3.1f %,8.0f원 %,6d원 %,8d원", group_string(), used[0], used_fee(), tax(), fee());
    }
}
