public class Am extends House{
    public Am(String[] person) {
        super(person);
    }

    @Override
    public int fee() {
        int use = (int) (getUse_W() + 0.5);
        return use * 20 + basic;
    }

    @Override
    public int tax() {
        return 0;
    }

    @Override
    public String toString() {
        return super.display() + String.format("\t군기관\t%,8d\t%,7d원\t%,6d원\t%,7d원\t일괄징수", getUse_W(), fee(), tax(), pay());
    }
}
