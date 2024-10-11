public class VendingMachine_object {
    private int price;
    private int pay;

    public VendingMachine_object(int price, int pay) {
        if (pay >= price) {
            this.price = price;
            this.pay = pay;
        } else {
            System.err.println("지불 금액이 구입 비용보다 작습니다.");
            System.exit(-1);
        }

    }

    public int getPrice() {
        return price;
    }

    public int getPay() {
        return pay;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    private int money(){
        int money = pay - price;

        return money;
    }

    private String change(){
        int[] coinList = {500, 100, 50, 10, 5, 1};
        int coin;
        String result = "";
        int money = money();

        for (int i = 0; i < coinList.length; i++){
            coin = money / coinList[i];
            money -= coin * coinList[i];
            result += String.format("%3d동전의 수 : %d 개\n",coinList[i], coin);
        }

        return result;
    }

    @Override
    public String toString() {
        return String.format("=-=-=-=-=-=-=-=-=-=-=- 동전의 갯수 -=-=-=-=-=-=-=-=-=-=-=\n" + "거스름돈 : %d 원\n%s", money(), change());
    }
}
