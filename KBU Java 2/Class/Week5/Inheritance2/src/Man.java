import java.util.Arrays;

public class Man {
    protected String[] person;      // 번호, 이름

    public Man(String[] person) {
        this.person = person;
    }

    public String[] getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return String.format(" %6s %4s", person[0], person[1]);
    }
}
