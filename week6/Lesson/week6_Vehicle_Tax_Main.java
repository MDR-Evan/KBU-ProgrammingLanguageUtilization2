public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[] {
                new Car("홍길동", "SONATA", "Hyundai", 2012, 1, 1, 34000000),
                new Car("홍길동", "BONGO", "GIA", 2005, 2, 2, 21000000),
                new Moto("김익주", "R1", "Yamaha", 2020, 1000, 12000000),
                new Moto("김익주", "R1", "Yamaha", 2020, 1000, 12000000),
        };

        Office office = new Office(vehicles);
        office.display();
    }
}