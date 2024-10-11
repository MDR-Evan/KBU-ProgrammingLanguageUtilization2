import java.io.IOException;
import java.util.Scanner;

public class VendingMachine_Main {
    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);

        int price;
        int pay;

        while (true) {
            System.out.print("물건 가격 입력 : ");
            price = kb.nextInt();
            if (price > 0){
                break;
            } else {
                System.err.println("물건 가격 다시 확인하세요.");
                System.in.read();
            }
        }

        while (true) {
            System.out.print("지불금액 입력 : ");
            pay = kb.nextInt();
            if (pay > price){
                break;
            } else {
                System.err.println("지불 금액 다시 확인하세요.");
                System.in.read();
            }
        }
        VendingMachine_object vending = new VendingMachine_object(price, pay);

        System.out.println(vending);
    }
}
