import java.io.IOException;
import java.util.Scanner;

public class SportsCenter {
    protected String[] man;     // 회원번호, 이름
    protected char grade;       // 등급코드
    protected int[] data;       // 종류 코드, 사용시간

//    public SportsCenter(String[] man, char grade, int[] data) {
//        this.man = man;
//        this.grade = grade;
//        this.data = data;
//    }

        public SportsCenter(String[] man, char grade, int[] data) throws IOException {
        this.setMan();
        this.setGrade();
        this.setData();
    }

    public String[] getMan() {
        return man;
    }

    public void setMan() throws IOException {
        Scanner kb = new Scanner(System.in);
        man = new String[2];

        while (true) {
            System.out.print("회원번호 입력 : ");
            man[0] = kb.next();
            System.out.print("이름 입력 : ");
            man[1] = kb.next();

            if (man[0].length() == 4) {
                break;
            } else {
                System.err.println("회원번호는 4자리 입니다.\n다시 입력해주세요.");
                System.in.read();
            }
        }
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade() throws IOException {
        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.print("회원등급 입력 : ");
            grade = kb.next().charAt(0);

            if (grade >= 'A' && grade <= 'D' || grade >= 'a' && grade <= 'd') {
                break;
            } else {
                System.err.println("회원등급은 대소문자 구분없이 A ~ D 사이 입니다.\n다시 입력해주세요.");
                System.in.read();
            }
        }
    }

    public int[] getData() {
        return data;
    }

    public void setData() throws IOException {
        Scanner kb = new Scanner(System.in);
        data = new int[2];

        while (true) {
            System.out.print("운동분류코드 입력 : ");
            data[0] = kb.nextInt();

            System.out.print("사용시간 입력 : ");
            data[1] = kb.nextInt();

            if (data[0] >= 1 && data[0] <= 6) {
                break;
            } else {
                System.err.println("(1)스쿼시, (2)테니스, (3)골프, (4)탁구, (5)에어로빅, (6)헬스\n다시 입력해주세요.");
                System.in.read();
            }

            if (data[1] >= 1 && data[1] <= 999) {
                break;
            } else {
                System.err.println("0 ~ 999시간까지만 입력 가능합니다.\n다시 입력해주세요.");
                System.in.read();
            }
        }
    }

    protected String sport_code() {     // 운동 코드 -> 종목 변경
        String sport = "";

        switch (data[0]) {
            case 1:
                sport = "스쿼시";
                break;
            case 2:
                sport = "테니스";
                break;
            case 3:
                sport = "골프";
                break;
            case 4:
                sport = "탁구";
                break;
            case 5:
                sport = "에어로빅";
                break;
            case 6:
                sport = "헬스";
                break;
        }
        return sport;
    }

    protected int[] fee() {          // 기본요금, 사용요금, 납부요금, 보너스
        int[] fee = new int[4];
        int temp = 0;

        switch (grade) { // 기본요금
            case 'A', 'a':
                fee[0] = 4000;
                grade = 'A';
                break;
            case 'B', 'b':
                fee[0] = 6000;
                grade = 'B';
                break;
            case 'C', 'c':
                fee[0] = 9000;
                grade = 'C';
                break;
            case 'D', 'd':
                fee[0] = 12000;
                grade = 'D';
                break;
        }

        switch (data[0]) { // 시간당 요금단가
            case 1:
                temp = 4000;
                break;
            case 2:
                temp = 6000;
                break;
            case 3:
                temp = 9000;
                break;
            case 4:
                temp = 5000;
                break;
            case 5:
                temp = 8000;
                break;
            case 6:
                temp = 3000;
                break;
        }
        fee[1] = temp * data[1];

        fee[2] = fee[0] + fee[1];

        fee[3] = (int) (fee[1] * (1.0/100));
        return fee;
    }

    @Override
    public String toString() {
        int[] pay = fee();
        return String.format(" %4s\t%3s\t%c등급\t%4s\t\t%4d\t\t%,d\t\t%,d\t\t%,d\t\t%,d",man[0], man[1], grade, sport_code(), data[1], pay[0], pay[1], pay[2], pay[3]);
    }
}