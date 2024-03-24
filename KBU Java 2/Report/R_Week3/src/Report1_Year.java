import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Report1_Year {
    int year;

    public Report1_Year() throws IOException {
        this.setYear();
    }

    public int getYear() {
        return year;
    }

    public void setYear() throws IOException {
        Scanner kb = new Scanner(System.in);
        while (true) {
            System.out.print("출생년도를 입력하시오 : ");
            year = kb.nextInt();
            if (year >= 1900 && year <= 2100) {
                break;
            } else {
                System.err.println("입력 오류");
                System.in.read();
            }
        }
    }

    public int Calendar(){
        SimpleDateFormat SDF = new SimpleDateFormat("yyyy");
        int date = Integer.parseInt(SDF.format(System.currentTimeMillis()));
        return date;
    }

    private String gangi(){
        String result = "";

        switch (year % 12){
            case 0:
                result = "원숭이";
                break;
            case 1:
                result = "닭";
                break;
            case 2:
                result = "개";
                break;
            case 3:
                result = "돼지";
                break;
            case 4:
                result = "쥐";
                break;
            case 5:
                result = "소";
                break;
            case 6:
                result = "범";
                break;
            case 7:
                result = "토끼";
                break;
            case 8:
                result = "용";
                break;
            case 9:
                result = "뱀";
                break;
            case 10:
                result = "말";
                break;
            case 11:
                result = "양";
                break;
        }
        return result;
    }

    private Object age(){
        int age;

        age = Calendar() - year;
        return age;
    }

    @Override
    public String toString() {
        return String.format("태어난 해 %d년은 %s띠 입니다.\n올해(%d년) 나이는 %d살 입니다.", year, gangi(), Calendar(), age());
    }
}
