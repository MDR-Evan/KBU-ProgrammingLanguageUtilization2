public class Rice_Ramyun extends Ramyun{
    String rice;

    public Rice_Ramyun(String ramyun, boolean flag) {
        super(ramyun, flag);
        this.rice = "떡";
    }

    @Override
    public void topping() {
        System.out.println(rice + "를 추가한다.");
    }
}
