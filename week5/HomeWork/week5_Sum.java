public class Sum {
    float S_used;
    int S_feu, S_tax, S_fee;
    protected void Sum() {
        this.S_used = 0;
        this.S_feu = 0;
        this.S_tax = 0;
        this.S_fee = 0;
    }

    protected void Cul(float used, int feeU, int tax, int fee) {
        this.S_used += used;
        this.S_feu = feeU;
        this.S_tax = tax;
        this.S_fee = fee;
    }

    @Override
    public String toString() {
        return String.format("\t사용량 합계 : %.2f\n\t요금 합계 : %,8d\n\t세금 합계 : %,6d\n\t징수금 합계 : %,8d", S_used, S_feu, S_tax, S_fee);
    }
}
