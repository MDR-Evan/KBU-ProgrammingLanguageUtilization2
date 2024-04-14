public class Main {
    public static void main(String[] args) {
        Process process = new Process("홍길동", "소프트웨어융합과");
        process.learn("Java");
        process.work("Program 개발자");

        process = new Process("이경은", "성인 간호");
        process.learn("간호과");
        process.work("간호사");

        process = new Process("장미란", "유아교육과");
        process.learn("유아 교육");
        process.work("교사");
    }
}