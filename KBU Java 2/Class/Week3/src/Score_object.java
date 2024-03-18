import java.util.Arrays;

public class Score_object {
    private String name;
    private float[] score;

    public Score_object(String name, float[] score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public float[] getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(float[] score) {
        this.score = score;
    }

    public float Max(){
        float result = 60.0f;
        for (int i = 0; i < score.length; i++){
            if (result < score[i]){
                result = score[i];
            }
        }
        return result;
    }

    public float Min(){
        float result = 100.0f;
        for (int i = 0; i < score.length; i++){
            if (result > score[i]){
                result = score[i];
            }
        }
        return result;
    }

    public float sum(){
        float sum = 0.0f;
        for (int i = 0; i < score.length; i++){
            sum += score[i];
        }
        return sum;
    }
    public float avg(){
        float avg;

        avg = (sum() - Max() - Min()) / (score.length - 2);
        return avg;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < score.length; i++){
            result += String.format("%d번 째 채점관 점수 : %5.2f점\n", i + 1, score[i]);
        }
        return result + String.format("최고 점수 : %3f점\n최소 점수 %3f점\n%s 선수의 점수 : %3f점", Max(), Min(), name, avg());
    }
}
