public class Atype_Ramyun extends Ramyun{
    String item1, item2;

    public Atype_Ramyun(String raelmyun, boolean flag) {
        super(raelmyun, flag);
        this.item1 = "치즈";
        this.item2 = "야채";
    }

    @Override
    public void topping() {
        System.out.println(item1 + "," + item2 + "를 넣고 끓인다.");
    }
}
