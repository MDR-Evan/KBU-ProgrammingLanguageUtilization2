import java.util.ArrayList;

public class arreymain {
    public static void main(String[] args) {
        ArrayList <arreygrade> arreygrades = new ArrayList<>();
        arreygrades.add(new arreygrade(new String[] {"012345", "홍길동"}, '남', new int[] {100, 100, 100}));
        arreygrades.add(new arreygrade(new String[] {"011111", "최순실"}, '여', new int[] {94, 21, 45}));
        arreygrades.add(new arreygrade(new String[] {"022222", "박주영"}, '남', new int[] {64, 100, 38}));
        arreygrades.add(new arreygrade(new String[] {"033333", "박찬호"}, '남', new int[] {87, 42, 82}));
        arreygrades.add(new arreygrade(new String[] {"044444", "이순신"}, '남', new int[] {98, 78, 86}));
        arreygrades.add(new arreygrade(new String[] {"055555", "나희영"}, '여', new int[] {45, 12, 78}));
        arreygrades.add(new arreygrade(new String[] {"066666", "이대한"}, '남', new int[] {76, 87, 89}));
        arreygrades.add(new arreygrade(new String[] {"077777", "이희망"}, '여', new int[] {78, 87, 98}));
        arreygrades.add(new arreygrade(new String[] {"088888", "박예림"}, '여', new int[] {95, 92, 90}));
        arreygrades.add(new arreygrade(new String[] {"099999", "임계치"}, '남', new int[] {34, 53, 51}));

        arreyclassroom classroom = new arreyclassroom(arreygrades);
        classroom.display();
    }
}