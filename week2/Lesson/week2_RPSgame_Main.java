import java.io.IOException;
import java.util.Scanner;

public class RPSgame_Main {
    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        while (true) {
            RPSgame_Computer com = new RPSgame_Computer();
            RPSgame_man man = new RPSgame_man();
            RPSgame_Manager Manager = new RPSgame_Manager(com, man);
            System.out.println(Manager);
            System.out.print("계임을 계속할까요? (Y/N)");
            char anwser = kb.next().charAt(0);
            if (anwser == 'N' || anwser == 'n'){
                break;
            }
        }
    }
}
