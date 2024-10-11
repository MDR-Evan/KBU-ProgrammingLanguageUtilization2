public class Office {
    private Vehicle[] vehicles;

    public Office(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public void display() {
        line();
        System.out.println("소유주\t모델\t제조사\t년도\t차종\t연료\t배기량\t가격\t세금\t교육세\t환경세\t납부세액");
        line();
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i]);
        }
        line();
    }

    private void line() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
