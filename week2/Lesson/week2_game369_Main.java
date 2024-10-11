import java.io.IOException;
import java.util.Scanner;

public class game369_Main {
    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        while (true) {
            game369_Object game = new game369_Object();
            System.out.println(game);
            System.out.print("계속 진행하시겠습니까? (Y/N)");
            char answer = kb.next().charAt(0);
            if (answer == 'N' || answer == 'n') {
                break;
            }
        }
    }
}
