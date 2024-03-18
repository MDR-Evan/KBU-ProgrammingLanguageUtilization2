import java.io.IOException;
import java.util.Scanner;

public class Moon_Main {
    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        float weight;
        while (true) {
            System.out.print("지구에서의 몸무게 입력 : ");
            weight = kb.nextFloat();
            if (weight > 0 && weight <= 300.0f){
                break;
            } else {
                System.err.println("몸무게 입력 오류");
                System.in.read();
            }
        }
        Moon_Object moon = new Moon_Object(weight);

        System.out.println(moon);
    }
}