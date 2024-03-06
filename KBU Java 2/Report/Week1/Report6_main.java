import java.util.Scanner;

public class Report6_main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("판독하고 싶은 년도를 입력하세요 : ");
        Report6_Year year = new Report6_Year(keyboard.nextInt());


        System.out.println(year);
    }
}