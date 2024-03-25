public class Sample5_main {
    public static void main(String[] args) {
        Sample5_employee[] employee = new Sample5_employee[] {
                new Sample5_employee("홍길동", "0000", new Birthday(2004, 2, 16), 1, 800000)
        };

        Sample5_company company = new Sample5_company(employee);
        company.display();
    }
}
