import java.util.Calendar;

public class Car extends Vehicle{
    private String type, fuel_type;
    private int price;

    public Car(String owner, String model, String manufacture, int year, int type, int fuel_type, int price) {
        super(owner, model, manufacture, year);
        if (type == 1) {
            this.type = "승용차";
        } else if (type == 2) {
            this.type = "승합차";
        } else {
            this.type = "Error";
        }

        if (fuel_type == 1) {
            this.fuel_type = "Gasoline";
        } else if (fuel_type == 2) {
            this.fuel_type = "Diesel";
        } else if (fuel_type == 3) {
            this.fuel_type = "Electric";
        } else {
            this.fuel_type = "Error";
        }
        this.price = price;
    }

    @Override
    public int tax() {
        int tax;
        if (price <= 18000000) {
            tax = (int) (price * 0.007f);
        } else if (price <= 36000000) {
            tax = (int) (price * 0.008f);
        } else{
            tax = (int) (price * 0.009f);
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
        return (int) (tax() * 0.1f);
    }

    @Override
    public int eco_tax() {
        int tax = 0;
        if (fuel_type == "Diesel") {
            tax = (int) (tax() * 0.07f);
        }
        return tax;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%5.4s %9.8s %,5dCC %,11d %,9d %,7d %,7d %,8d", type, fuel_type, 0, price, tax(), edu_tax(), eco_tax(), total_tax());
    }
}
