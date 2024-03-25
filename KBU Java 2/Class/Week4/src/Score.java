public class Score {
    protected int kor;
    protected int eng;
    protected int math;

    public Score(int kor, int eng, int math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    private int sum() {
        return kor + eng + math;
    }

    private float avg() {
        return sum() / 3.0f;
    }

    @Override
    public String toString() {
        return String.format(" %3d, %3d, %3d, %3d, %6.2f", kor, eng, math, sum(), avg());
    }
}
