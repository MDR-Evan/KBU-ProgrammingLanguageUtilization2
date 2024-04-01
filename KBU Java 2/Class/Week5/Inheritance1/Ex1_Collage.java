public class Ex1_Collage extends Ex1_Student{
    private String department;
    public Ex1_Collage(String[] student) {
        super(student);
    }

    public Ex1_Collage(String[] student, String department) {
        super(student);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\n학과 : %s", department);
    }
}
