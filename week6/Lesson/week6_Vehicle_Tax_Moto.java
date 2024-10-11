import java.util.Calendar;

public class Moto extends Vehicle{
    private int engineCapacity;
    private int price;

    public Moto(String owner, String model, String manufacture, int year, int engineCapacity, int price) {
        super(owner, model, manufacture, year);
        this.engineCapacity = engineCapacity;
        this.price = price;
    }

    @Override
    public int tax() {
        int tax;

        if (engineCapacity <= 90) {
            tax = (int) (price * 0.005);
        } else if (engineCapacity <= 100) {
            tax = (int) (price * 0.006);
        } else {
            tax = (int) (price * 0.007);
        }
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR) - getYear() - 10;

        if (year > 0) {
            tax = (int) (tax + (tax * (year / 100.0f)));
        }

        return tax;
    }

    @Override
    public int edu_tax() {
        return 0;
    }

    @Override
    public int eco_tax() {
        return (int) (tax() * 0.07f);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%5.4s %9.8s %,5dCC %,11d %,9d %,7d %,7d %,8d", "바이크", "Diesel", engineCapacity, price, tax(), edu_tax(), eco_tax(), total_tax());
    }
}
