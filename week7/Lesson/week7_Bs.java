public class Bs extends House {
    public Bs(String[] person) {
        super(person);
    }

    @Override
    public int fee() {
        int use = (int) (getUse_W() + 0.5);
        return use * 55 + basic;
    }

    @Override
    public int tax() {
        int tax = (int) (fee() * 0.035f);
        tax = (tax / 10) * 10;
        return tax;
    }

    @Override
    public String toString() {
        return super.display() + String.format("\t영업용\t%,8d\t%,7d원\t%,6d원\t%,7d원", getUse_W(), fee(), tax(), pay());
    }
}
