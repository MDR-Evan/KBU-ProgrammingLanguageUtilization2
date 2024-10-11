package src;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Customer> customers = new ArrayList<>();
            customers.add(new Customer(new String[]{"111111", "김진용"}, 670));
            customers.add(new Special(new String[]{"222222", "김익주"}, 345));
            customers.add(new Customer(new String[]{"333333", "장승연"}, 435));
            customers.add(new Special(new String[]{"444444", "김가희"}, 675));
            customers.add(new Customer(new String[]{"555555", "조정민"}, 614));
            customers.add(new Special(new String[]{"666666", "이규빈"}, 855));
            customers.add(new Customer(new String[]{"777777", "김선민"}, 134));
            customers.add(new Special(new String[]{"888888", "오정민"}, 87));
            customers.add(new Customer(new String[]{"999999", "홍길동"}, 345));
            customers.add(new Special(new String[]{"000000", "이순신"}, 754));


//        // 수 입력
//        for (int i = 0; i < customers.size(); i++) {
//            customers.get(i).input();
//        }

        Office office = new Office(customers);
        office.display();
    }
}