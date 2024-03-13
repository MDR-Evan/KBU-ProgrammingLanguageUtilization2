public class Report0_House {
    private String color;
    private String window;
    private String name;
    private int area;
    private int floor;
    private int year;
    private int money;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

//    public void cleaning(int cost){
//        money = area * floor * cost;
//    }
//
//    public void repair(int repair_cost){
//        money = window * repair_cost;
//    }
//
//    public void sell(int sell){
//        sell = area * floor * window;
//    }
//
//    public void buy(int buy){
//        buy = area * floor * window;
//    }

    @Override
    public String toString() {
        return "Report0_House{" +
                "color='" + color + '\'' +
                ", window='" + window + '\'' +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", floor=" + floor +
                ", year=" + year +
                '}';
    }
}
