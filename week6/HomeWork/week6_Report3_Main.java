public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        Trianggle trianggle = new Trianggle();

        System.out.println("사각형 넓이 계산");
        square.input();
        square.printArea();

        System.out.println();

        System.out.println("\n삼각형의 넓이 계산");
        trianggle.input();
        trianggle.printArea();
    }
}