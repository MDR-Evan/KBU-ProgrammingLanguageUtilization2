import java.io.IOException;
import java.util.Scanner;

public abstract class Employee implements Method{
    protected String name, bunho;

    public Employee(String name, String bunho) {
        this.name = name;
        this.bunho = bunho;
    }

    public String getName() {
        return name;
    }

    public String getBunho() {
        return bunho;
    }

    public void input() throws IOException {
        Scanner kb = new Scanner(System.in);

        while(true) {
            System.out.println("이름을 입력하시오.\n-> ");
            name = kb.next();
            if (name.length() == 3) {
                break;
            } else {
                System.err.println("이름을 다시 확인해주세요.");
                System.in.read();
            }
            System.out.printf("%s님의 사번을 입력하시오.\n-> ", name);
            bunho = kb.next();
            if (bunho.length() == 6) {
                break;
            } else {
                System.err.println("사번을 다시 확인해주세요.");
                System.in.read();
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%6s\t%3s", bunho, name);
    }
}
