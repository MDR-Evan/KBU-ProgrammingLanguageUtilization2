//public class gradeshort {
//    private Student[] students;
//
//    public gradeshort(grade[] students) {
//        this.students = students;
//    }
//
//    public Student[] getStudents() {
//        return students;
//    }
//
//    public void setStudents(Student[] students) {
//        this.students = students;
//    }
//
//    public int getRank(int index) {
//        int rank = 1;
//        int sum = students.get(index).sum(); // 나의 총점
//        for (int I = 0; I < students.size(); i++) {
//            if (students.get(i).sum() > sum) {
//                rank++; // 나의 총점보다 크면 등수를 더함
//            }
//        }
//        return rank;
//    }
//
//    private void sort() {
//        int temp = 0;
//        for (int i = 0; i < students.length - 1; i++){
//            for (int j = i + 1; j < students.length; j++){
//                if (students[i].sum() < students[j].sum()) {
//                    temp = students[i];
//                    students[i] = students[j];
//                    students[j] = temp;
//                }
//            }
//        }
//    }
//
//    public void display(){
//        sort();
//        line();
//        System.out.println("학번 이름 성별 국어 영어 수학 합계 평균");
//        line();
//        for (int i = 0; i < students.length; i++){
//            System.out.println(students[i]);
//            System.out.printf("%3d,\n",getRank(i));
//        }
//        line();
//    }
//
//    private void line() {
//        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
//    }
//}
