import java.util.Scanner;

public class Trianggle implements Interface{
    private int height, width;

    @Override
    public void input() {
        Scanner kb =new Scanner(System.in);
        System.out.print("삼각형의 높이를 입력하세요 : ");
        height = kb.nextInt();
        System.out.print("삼각형의 밑변를 입력하세요 : ");
        width = kb.nextInt();
    }

    @Override
    public void printArea() {
        int area = (height * width) / 2;
        System.out.printf("삼각형의 넓이 : %d", area);
    }
}
