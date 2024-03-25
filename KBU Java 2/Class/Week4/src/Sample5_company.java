public class Sample5_company {
    private Sample5_employee[] employees;

    public Sample5_company(Sample5_employee[] employees) {
        this.employees = employees;
    }

    protected void display() {
        System.out.println(employees.toString());
    }
}
