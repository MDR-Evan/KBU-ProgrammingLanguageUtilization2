public class Employee extends Man{
    private int hobong;
    private int sudang;

    public Employee(String name, String bunho, int hobong, int sudang) {
        super(name, bunho);
        this.hobong = hobong;
        this.sudang = sudang;
    }

    public int getHobong() {
        return hobong;
    }

    public int getSudang() {
        return sudang;
    }

    @Override
    public int basic() {
        int basic = 0;
        switch (hobong) {
            case 1:
                basic = 1650000;
                break;
            case 2:
                basic = 1680000;
                break;
            case 3:
                basic = 1700000;
                break;
            case 4:
                basic = 1720000;
                break;
            case 5:
                basic = 1750000;
                break;
        }
        return basic;
    }

    @Override
    public int fee() {
        int fee = sudang + basic();
        return fee;
    }

    @Override
    public int tax() {
        int tax;
        if (fee() < 1700000) {
            tax = (int) (fee() * 0.05f);
        } else if (fee() >= 1700000 && fee() < 2300000) {
            tax = (int) (fee() * 0.08f);
        } else {
            tax = (int) (fee() * 0.1f);
        }
        return tax;
    }

    @Override
    public int pay() {
        return fee() - tax();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\t%1d급\t  %,9d\t  %,9d\t  %,9d\t  %,6d\t%,9d", hobong, sudang, basic(), fee(), tax(), pay());
    }
}
