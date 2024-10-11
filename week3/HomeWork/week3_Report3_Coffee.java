import java.io.IOException;
import java.util.Scanner;

public class Report3_Coffee {
    int coffee;

    public Report3_Coffee() throws IOException {
        this.setCoffee();
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee() throws IOException {
        Scanner kb = new Scanner(System.in);
        while (true) {
            System.out.print("당신은 몇 잔의 커피를 주문하시나요? ");
            coffee = kb.nextInt();

            if (coffee > 0) {
                break;
            } else {
                System.err.println("주문 수량을 다시 확인해주세요.");
                System.in.read();
            }
        }
    }

    public String bonus(){
        String result = "";
        int stamp = 0;
        int bonus = coffee;

        if (coffee >= 6) {
            stamp += 1;
            bonus += stamp;

            result = String.format("당신이 %d잔을 주문하면, %d잔의 무료 커피를 증정하여 %d잔을 주문합니다.", coffee, stamp, bonus);
            return result;
        } else {
            result = String.format("당신이 %d잔을 주문하였습니다.", coffee);
            return result;
        }
    }

    @Override
    public String toString() {
        return String.format("%s", bonus());
    }
}
