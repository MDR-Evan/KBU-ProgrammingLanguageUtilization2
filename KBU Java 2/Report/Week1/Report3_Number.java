public class Report3_Number {
    private int Int_value;
    private float Float_value;

    public Report3_Number(int int_value, float float_value) {
        Int_value = int_value;
        Float_value = float_value;
    }

    @Override
    public String toString() {
        return String.format("정수 값은 %d이고, 실수 값은 %.4f입니다.", Int_value, Float_value);
    }
}
