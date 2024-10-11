public class Student extends Man {
    private int kor, eng, math;

    public Student() {
    }

    public Student(String hakbun, String name, int kor, int eng, int math) {
        super(hakbun, name);
        this.kor = kor;
        this.eng = eng;
        this.math = math;
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
}
