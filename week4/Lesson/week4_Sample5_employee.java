public class Sample5_employee {
    String name;
    String num;
    Birthday birthday;
    int hobong;
    int sudang;

    public Sample5_employee(String name, String num, Birthday birthday, int hobong, int sudang) {
        this.name = name;
        this.num = num;
        this.birthday = birthday;
        this.hobong = hobong;
        this.sudang = sudang;
    }

    private int b() {
        return 0;
    }

    private int s() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%3s%s %4s %1d %,7d %,7d %,8d\n", name, birthday.toString(), num, hobong, sudang, b(), s());
    }
}
