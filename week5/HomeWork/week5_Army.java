public class Army extends Business {
    public Army(String[] person, float[] used) {
        super(person, used);
    }

    @Override
    protected int tax() {
        int tax = 0;

        if (used[1] == 5) {
            tax = 0;
        }
        return tax;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\t일괄징수");
    }
}
