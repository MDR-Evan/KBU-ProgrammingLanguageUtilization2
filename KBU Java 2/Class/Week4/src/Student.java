public class Student {
    private String id;
    private String name;
    private char gender;
    private float grade;

    public Student(String id, String name, char gender, float grade) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.grade = grade;
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

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return String.format("학번 : %s, 이름 : %s, 성별 : %c자, 학년 : %f",id,name,gender,grade);
    }
}