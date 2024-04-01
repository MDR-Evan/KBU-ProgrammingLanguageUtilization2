import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        Customer[] customers = new Customer[]{
                new Customer(new String[]{"111111", "김진용"}, 670),
                new Special(new String[]{"222222", "김익주"}, 345),
                new Customer(new String[]{"333333", "장승연"}, 435),
                new Special(new String[]{"444444", "김가희"}, 675),
                new Customer(new String[]{"555555", "조정민"}, 614),
                new Special(new String[]{"666666", "이규빈"}, 855),
                new Customer(new String[]{"777777", "김선민"}, 134),
                new Special(new String[]{"888888", "오정민"}, 87),
                new Customer(new String[]{"999999", "홍길동"}, 345),
                new Special(new String[]{"000000", "이순신"}, 754)
        };

        // 수동 입력
        for (int i = 0; i < customers.length; i++) {
            customers[i].input();
        }

        Office office = new Office(customers);
        office.display();
    }
}