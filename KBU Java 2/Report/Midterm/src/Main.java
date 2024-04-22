import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Employee[] data = new Employee[] {
                new Temporary("김진용", "040216", 20),
                new Temporary("김가희", "040826", 10),
                new Temporary("김형진", "031128", 30),
                new Temporary("김광호", "040102", 5),
                new Regular("김민선", "941111",  1),
                new Regular("김익주", "001111",  2),
                new Salesman("장승연", "020108",  3, 350000),
                new Salesman("조민정", "041111",  4, 450000),
                new Manager("오정민", "041007", 5),
                new Manager("이순주", "041110", 1),
        };

        for (int i = 0; i < data.length; i++) {
            data[i].input();
        }

        Company company = new Company(data);
        company.display();
    }
}