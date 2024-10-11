import java.util.ArrayList;

public class studentMain {
    public static void main(String[] args) {

//        Student[] Students = new Student[5];
//        Students = new Student[] {
//            Students[0] = new Student("001", "홍길동", '남', 4.3f),
//            Students[1] = new Student("002", "이대한", '남', 4.5f),
//            Students[2] = new Student("003", "박찬호", '남', 3.1f),
//            Students[3] = new Student("004", "한민국", '남', 2.5f),
//            Students[4] = new Student("005", "홍미라", '여', 4.0f)
//        };
//
//        for (int i = 0; i < Students.length; i++){
//            System.out.print(Students[i]);
//        }

        ArrayList<Student> Students = new ArrayList<>();
        Students.add(new Student("001", "홍길동", '남', 4.3f));
        Students.add(new Student("002", "이대한", '남', 4.5f));
        Students.add(new Student("003", "박찬호", '남', 3.1f));
        Students.add(new Student("004", "한민국", '남', 2.5f));
        Students.add(new Student("005", "홍미라", '여', 4.0f));

        for (int i = 0; i < Students.size(); i++){
            System.out.println(Students.get(i));
        }
    }
}
