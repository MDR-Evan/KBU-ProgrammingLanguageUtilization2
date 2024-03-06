public class Report5_Account {
    private String account_number;
    private String password;
    private String name;
    private int balance;
    private float interest_rate;

    public Report5_Account(String account_number, String password, String name, int balance, float interest_rate) {
        this.account_number = account_number;
        this.password = password;
        this.name = name;
        this.balance = balance;
        this.interest_rate = interest_rate;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public float getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(float interest_rate) {
        this.interest_rate = interest_rate;
    }

    public void defosit(int money){
        balance += money;
    }

    public void whitdrow(int money){
        balance -= money;
    }



    @Override
    public String toString() {
        return String.format("%s님의 계좌번호 및 비밀번호는 %s / %s 이고 잔액은 %,d원, 이율은 %.1f%%입니다.", name, account_number, password, balance, interest_rate);
    }
}
