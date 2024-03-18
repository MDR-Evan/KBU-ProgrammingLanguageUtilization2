import java.util.Arrays;

public class Student_Object {
    private String[] person;    // 이름, 학번
    private char gender;
    Student_Subject[] subjects;         // 국어 영어 수학 선택

    public Student_Object(String[] person, char gender, Student_Subject[] subjects) {
        this.person = person;
        this.gender = gender;
        this.subjects = subjects;
    }

    public String[] getPerson(int index) {
        return person[index];
    }

    public void setPerson(String[] person) {
        this.person = person;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Student_Subject[] getSubjects(int index) {
        return subjects[index];
    }

    public void setSubjects(Student_Subject[] subjects) {
        this.subjects[index] = subjects;
    }

    @Override
    public String toString() {
        String result = "";

        result += String.format("이름 : %s\n학번 : %s", person[0], person[1]);
        for (int i = 0; i < subjects[i]; i++){
            result += String.format("%s\n", Student_Subject.toString());
        }
        return result;
    }
}
