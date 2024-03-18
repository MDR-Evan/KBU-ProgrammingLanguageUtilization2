import java.io.IOException;
import java.util.Scanner;

public class Score_Main {
    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        float[] score = new float[7];

        int i = 0;

        while (i < score.length) {
            System.out.printf("%d번 째 채점관 점수 입력 : ", i + 1);
            score[i] = kb.nextFloat();
            if (score[i] >= 60.0f && score[i] <= 100.0f){
                i++;
            } else {
                System.err.println("점수 오류");
                System.in.read();
            }
        }

        Score_object Score = new Score_object("김선민", score);

        System.out.println(Score);

    }
}
