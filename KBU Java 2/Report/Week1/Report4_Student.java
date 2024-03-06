public class Report4_Student {
    private String name;
    private String rollno;
    private int age;

    public Report4_Student(String name, String rollno, int age) {
        this.name = name;
        this.rollno = rollno;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("학생 Data\n이름 : %s\n학번 : %s\n나이 : %d", name, rollno, age);
    }
}
