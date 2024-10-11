package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Office {
    private ArrayList<Customer> customers;

    public Office(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    protected void sort() {
        Collections.sort(customers, new Sum().reversed());
    }

    private class Sum implements Comparator<Customer> {
        @Override
        public int compare(Customer o1, Customer o2) {
            return (o1.fee() - o2.fee());
        }
    }

    protected void display() {
        sort();
        line();
        System.out.println("  번호\t  이름\t 사용량\t 사용요금\t세금\t\t  합계\t\t  비고");
        line();
        for (int i = 0; i < customers.size(); i++){
            System.out.println(customers.get(i));
        }
        line();
    }

    protected void line() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
