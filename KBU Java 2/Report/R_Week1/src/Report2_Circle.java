public class Report2_Circle {
    private int radius_1;
    int a, b;

    public Report2_Circle(int radius_1) {
        this.radius_1 = radius_1;
    }

    public int getRadius_1() {
        return radius_1;
    }

    public void setRadius_1(int radius_1) {
        this.radius_1 = radius_1;
    }
    public void A(){
        a = radius_1;
    }

    public void B(){
        b = radius_1;
    }

    public String equals(){
        return a == b ? "같습니다." : "다릅니다.";
    }
    @Override
    public String toString() {
        return String.format("두 원의 반지름은 %s",equals());
    }
}
