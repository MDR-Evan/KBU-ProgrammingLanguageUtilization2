public abstract class Vehicle implements TaxMethod{
    private String owner, model, manufacture;
    private int year;

    public Vehicle(String owner, String model, String manufacture, int year) {
        this.owner = owner;
        this.model = model;
        this.manufacture = manufacture;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("%3s %10.9s %6s %4d년", owner, model, manufacture, year);
    }
}
