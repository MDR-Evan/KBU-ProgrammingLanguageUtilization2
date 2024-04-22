import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public abstract class Man implements Interface{
    protected String[] person;

    public Man(String[] person) {
        this.person = person;
    }

    public String[] getPerson() {
        return person;
    }

    public void setPerson(String[] person) {
        this.person = person;
    }

    protected void input() throws IOException {
        Scanner kb = new Scanner(System.in);

        System.out.println("이름을 입력하시오 : ");
        person[1] = kb.nextLine();

        while (true) {
            System.out.println("번호을 입력하시오 : ");
            person[0] = kb.nextLine();
            if (person[0].length() == 4) {
                break;
            } else {
                System.err.println("번호 4자리를 다시 확인해주세요.");
                System.in.read();
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%4s\t%4s", person[0], person[1]);
    }
}
