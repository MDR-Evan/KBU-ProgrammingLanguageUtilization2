import java.util.Scanner;

public class Square implements Interface{
    private int height, width;

    @Override
    public void input() {
        Scanner kb =new Scanner(System.in);
        System.out.print("사각형의 세로를 입력하세요 : ");
        height = kb.nextInt();
        System.out.print("사각형의 가로를 입력하세요 : ");
        width = kb.nextInt();
    }

    @Override
    public void printArea() {
        int area = height * width;
        System.out.printf("사각형의 넓이 : %d", area);
    }
}
