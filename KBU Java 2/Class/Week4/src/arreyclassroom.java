import java.util.ArrayList;

public class arreyclassroom {
    ArrayList<arreygrade> arreygrades;

    public arreyclassroom(ArrayList<arreygrade> arreygrades) {
        this.arreygrades = arreygrades;
    }

    protected void display() {
        line();
        System.out.println("학번 이름 성별 국어 영어 수학 총점 평균 등수");
        line();
        for (int i = 0; i < arreygrades.size(); i++) {
            System.out.print(arreygrades.get(i));
            System.out.printf("%3d\n",getRank(i));
        }
        line();
    }

    private int getRank(int index) {
        int rank = 1;
        int sum = arreygrades.get(index).sum();
        for (int i = 0; i < arreygrades.size(); i++) {
            if (arreygrades.get(i).sum() > sum) {
                rank++;
            }
        }
        return rank;
    }

//com뭐 어쩌구 쇼트 하랬음

    private void line() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
