public class Ex1_Main {
    public static void main(String[] args) {
        Ex1_Student[] students = new Ex1_Student[]{
                new Ex1_Highschool(new String[]{"홍길동", "12345"}, "경복고등학교"),
                new Ex1_Collage(new String[]{"김진용","23011"}, "소프트웨어융합과")
        };

        System.out.println(students[0]);
        enter();
        System.out.println(students[1]);
    }

    private static void enter() {
        System.out.println();
    }
}
