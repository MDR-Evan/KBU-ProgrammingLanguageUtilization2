import java.util.Arrays;

public class Ex1_Highschool extends Ex1_Student{
    private String SchoolName;

    public Ex1_Highschool(String[] student) {
        super(student);
    }

    public Ex1_Highschool(String[] student, String schoolName) {
        super(student);
        this.SchoolName = schoolName;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\n학교이름 : %s", SchoolName);
    }
}
