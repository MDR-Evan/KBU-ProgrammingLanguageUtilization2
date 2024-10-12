public class Student extends Man {
    private int kor;
    private int eng;
    private int math;

    public Student(String hakbun, String name, int kor, int eng, int math) {
        super(hakbun, name);
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public Student() {

    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int sum() {
        return kor + eng + math;
    }

    public float avg() {
        return sum() / 3.0f;
    }
}
