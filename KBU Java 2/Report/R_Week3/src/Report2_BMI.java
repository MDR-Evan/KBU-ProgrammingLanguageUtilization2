import java.io.IOException;
import java.util.Scanner;

public class Report2_BMI {
    float weight , height;

    public Report2_BMI() throws IOException {
        this.setWeight();
        this.setHeight();
    }

    public float getWeight() {
        return weight;
    }

    public float getHeight() {
        return height;
    }

    public void setWeight() throws IOException {
        Scanner kb = new Scanner(System.in);
        while (true) {
            System.out.print("몸무게를 입력하시오 (단위 : Kg) : ");
            weight = kb.nextFloat();

            if (weight > 0 && weight < 200) {
                break;
            } else {
                System.err.println("입력 오류");
                System.in.read();
            }
        }
    }

    public void setHeight() throws IOException {
        Scanner kb = new Scanner(System.in);
        while (true) {
            System.out.print("키를 입력하시오 (단위 : Cm) : ");
            height = kb.nextFloat();

            if (height > 0 && height < 250) {
                break;
            } else {
                System.err.println("입력 오류");
                System.in.read();
            }
        }
    }

    public float bmi(){
        float bmi;
        float MH;

        MH = height / 100;

        bmi = weight / (MH * MH);
        return bmi;
    }

    public String bmiresult(){
        String result = "";

        if ((bmi() > 0) && (bmi() <= 18.5)){
            result = String.format("저체중");
            return result;
        } else if ((bmi() > 18.5) && (bmi() <= 23)) {
            result = String.format("정상");
            return result;
        } else if ((bmi() > 23) && (bmi() <= 25)) {
            result = String.format("과체중");
            return result;
        } else if ((bmi() > 25) && (bmi() <= 30)) {
            result = String.format("비만");
            return result;
        } else if (bmi() > 30) {
            result = String.format("고도비만");
            return result;
        } else {
            result = String.format("혹시 살아는 계신가요?");
            return result;
        }
    }

    @Override
    public String toString() {
        return String.format("몸무게 : %.1fKg\n신장 : %.1fCm\nBMI 지수 : %.2f\n%s입니다.", weight, height, bmi(), bmiresult());
    }
}
