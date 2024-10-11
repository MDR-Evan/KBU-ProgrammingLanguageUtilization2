public class Office {
    private Customer[] customers;

    public Office(Customer[] customers) {
        this.customers = customers;
    }

    protected void sort() {
        for (int i = 0; i < customers.length; i++) {
            for (int j = i+1; j < customers.length; j++) {
                if (customers[i].fee() < customers[j].fee()) {
                    Customer temp = customers[i];
                    customers[i] = customers[j];
                    customers[j] = temp;
                }
            }
        }
    }

    protected void display() {
        sort();
        line();
        System.out.println("  번호\t  이름\t 사용량\t 사용요금\t세금\t\t  합계\t\t  비고");
        line();
        for (int i = 0; i < customers.length; i++){
            System.out.println(customers[i]);
        }
        line();
    }

    protected void line() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
