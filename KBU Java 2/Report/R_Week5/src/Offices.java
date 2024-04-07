import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Offices {
    private ArrayList<Business> customer;

    public Offices(ArrayList<Business> customer) {
        this.customer = customer;
    }

    protected void sort() {
        Collections.sort(customer, new Sum().reversed());
    }

    private class Sum implements Comparator<Business> {
        @Override
        public int compare(Business o1, Business o2) {
            return Float.compare(o1.used_fee(), o2.used_fee());

        }
    }

    protected void display() {
        sort();
        System.out.println("\t\t\t\t\t\t\t수\t도\t요\t금");
        line();
        System.out.println("  번호\t 이름\t  구분\t  사용량\t  사용금액\t Tax\t  납부액\t\t 비고");
        line();
        for (int i = 0; i < customer.size(); i++) {
            Business business1 = customer.get(i);
            business1.Sum();
            System.out.println(business1);
        }
        line();
    }

    private void line() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
