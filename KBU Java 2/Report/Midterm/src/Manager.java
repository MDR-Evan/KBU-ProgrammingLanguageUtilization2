public class Manager extends Regular{

    public Manager(String name, String bunho, int grade) {
        super(name, bunho, grade);
    }

//    public Manager(String name, String bunho, int grade) {
//        super(name, bunho, grade);
//    }

    @Override
    public int incentive() {
        int inc;
        if (basic() <= 1800000) {
            inc = (int) (basic() * 0.06f);
        } else if (basic() > 1800000 && basic() <= 2400000) {
            inc = (int) (basic() * 0.05f);
        } else {
            inc = (int) (basic() * 0.04f);
        }
        return inc;
    }

    @Override
    public String toString() {
        return super.display() + String.format("\t%1d급\t 0\t     0원\t%,9d원\t%,9d원\t%,9d원\t%,9d원\t%,9d원\t%,9d원\t성과급", grade, basic(), incentive(), commission(), salary(), tax(), pay());
    }
}
