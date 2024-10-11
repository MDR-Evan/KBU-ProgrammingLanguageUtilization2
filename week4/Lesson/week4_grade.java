public class grade {
//    private String[] person;
//    private int[] grade;
    private String id;
    private String name;
    private char gender;
    private int kor;
    private int eng;
    private int math;

    public grade(String id, String name, char gender, int kor, int eng, int math) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int sum(){
        return kor + eng + math;
    }

    public float avg(){
        return sum() / 3.0f;
    }

    @Override
    public String toString() {
        return String.format("%7s, %3s, %c자, %3d, %3d, %3d, %3d, %3.2f", id, name, gender, kor, eng, math, sum(), avg());
    }
}
