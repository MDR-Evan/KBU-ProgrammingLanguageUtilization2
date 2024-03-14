public class Report2_divisor {
    private int num;

    public Report2_divisor(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void divisor(){
        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                System.out.print(i + " ");
            }
        }
    }

    public void divisor_sum(){
    }

    @Override
    public String toString() {
        return String.format("%d의 약수는 ", num);
    }
}
