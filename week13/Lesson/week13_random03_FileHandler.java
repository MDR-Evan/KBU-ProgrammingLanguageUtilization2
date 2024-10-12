import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    private Scanner kb;
    private String[] subject = {"국어", "영어", "수학"};

    public FileHandler() {
        this.kb = new Scanner(System.in);
    }

    public void inputData(String filename) throws IOException {
        ArrayList<Student> students = new ArrayList<>();
        while (true) {
            String name;
            while (true) {
                System.out.printf("%d번 째 학생의 이름 입력(한글 3자) : ", students.size() + 1);
                name = kb.next();

                if (name.length() == 3) {
                    break;
                } else {
                    System.err.println("다시 이름을 정확하게 입력하시오.");
                    System.in.read();
                }
            }

            String hakbun;
            while (true) {
                System.out.printf("%s학생의 학번 입력(숫자 7자리) : ", name);
                hakbun = kb.next();

                if (hakbun.length() == 7) {
                    break;
                } else {
                    System.err.println("다시 학번을 정확하게 입력하시오.");
                    System.in.read();
                }
            }

            int kor = input(name, subject[0]);
            int eng = input(name, subject[1]);
            int math = input(name, subject[2]);
            students.add(new Student(hakbun, name, kor, eng, math));
            char anwser;
            while (true) {
                System.out.print("계속 Data를 입력할까요? (Y/N)");
                anwser = kb.next().charAt(0);
                if (anwser == 'Y' || anwser == 'y' || anwser == 'N' || anwser == 'n') {
                    break;
                } else {
                    System.err.println("Y 또는 N으로 다시 입력하세요.");
                    System.in.read();
                }
            }

            if (anwser == 'N' || anwser == 'n') {
                System.out.printf("%d개의 Data를 입력하였습니다.\n",students.size());
                break;
            }
        }

        RandomAccessFile randomAccessFile = new RandomAccessFile(filename, "rw");
        for (int i = 0; i < students.size(); i++) {
            randomAccessFile.writeUTF(students.get(i).getHakbun());
            randomAccessFile.writeUTF(students.get(i).getName());
            randomAccessFile.writeInt(students.get(i).getKor());
            randomAccessFile.writeInt(students.get(i).getEng());
            randomAccessFile.writeInt(students.get(i).getMath());
        }
        randomAccessFile.close();
        System.out.println("Random Access File 생성 성공");

    }

    private int input(String name, String s) throws IOException {
        int score;
        while (true) {
            System.out.printf("%s학생 %s과목의 성적 입력 : ", name, s);
            score = kb.nextInt();

            if (score >= 0 && score <= 100) {
                break;
            } else {
                System.err.printf("다시 %s과목의 성적을 정확하게 입력하시오.", s);
                System.in.read();
            }
        }
        return score;
    }
}
