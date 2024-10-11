public class Company {
    private Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    public int getLenght() {
        return employees.length;
    }
    public Employee getEmployees(int index) {
        return employees[index];
    }

    public void sort() {
        for (int i = 0; i < employees.length; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].pay() < employees[j].pay()) {
                    Employee temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
    }

    public void display() {
        sort();
        line();
        System.out.println(" 사번\t 이름\t급\tday\t  일당\t\t   기본급\t   인센티브\t    커미션\t   급여액\t\t 세금\t\t지급액\t 비고");
        line();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        line();
    }

    private void line() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
