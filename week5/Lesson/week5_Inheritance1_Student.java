import java.util.Arrays;

public class Ex1_Student {
    protected String[] student;       // 이름, 학번

    public Ex1_Student(String[] student) {
        this.student = student;
    }

    public String[] getStudent() {
        return student;
    }

    public void setStudent(String[] student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return String.format("이름 : %s\n학번 : %s", student[0], student[1]);
    }
}