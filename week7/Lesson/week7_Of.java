public class Of extends House{
    public Of(String[] person) {
        super(person);
    }

    @Override
    public int fee() {
        int use = (int) (getUse_W() + 0.5);
        return use * 35 + basic;
    }

    @Override
    public int tax() {
        int tax = (int) (fee() * 0.015f);
        tax = (tax / 10) * 10;
        return tax;
    }

    @Override
    public String toString() {
        return super.display() + String.format("\t관공서\t%,8d\t%,7d원\t%,6d원\t%,7d원", getUse_W(), fee(), tax(), pay());
    }
}
