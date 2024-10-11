import java.util.Scanner;

public class Process implements Interface{
    private String name;
    private String major;

    public Process(String name, String major) {
        this.name = name;
        this.major = major;
    }

    @Override
    public void learn(String subject) {
        System.out.printf("%s은(는) %s의 %s에서 %s를 공부하였습니다.\n", name, university, major, subject);
    }

    @Override
    public void work(String job) {
        System.out.printf("%s로 취업하였습니다.\n", job);
    }
}
