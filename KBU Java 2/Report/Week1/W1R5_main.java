public class Report5_main {
    public static void main(String[] args) {
        Report5_Account account = new Report5_Account("1002553620599","7268","김진용",0,3.5f);

        account.defosit(50000);
        account.whitdrow(5000);
        account.setInterest_rate(34.5f);

        System.out.println(account);
    }
}
