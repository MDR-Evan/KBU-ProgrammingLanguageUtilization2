import java.io.IOException;
import java.util.ArrayList;

public class Display {
    protected static void display() throws IOException {
        ArrayList<SportsCenter> SC = new ArrayList<>();
        SC.add(new SportsCenter(new String[]{"0216", "김진용"}, 'A', new int[]{3, 67}));
        SC.add(new SportsCenter(new String[]{"0000", "홍길동"}, 'B', new int[]{1, 89}));
        SC.add(new SportsCenter(new String[]{"1111", "김선민"}, 'C', new int[]{2, 89}));
        SC.add(new SportsCenter(new String[]{"2222", "오정민"}, 'D', new int[]{4, 67}));
        SC.add(new SportsCenter(new String[]{"3333", "김익주"}, 'D', new int[]{5, 80}));
        SC.add(new SportsCenter(new String[]{"4444", "김가희"}, 'A', new int[]{5, 45}));
        SC.add(new SportsCenter(new String[]{"5555", "장승연"}, 'B', new int[]{6, 67}));
        SC.add(new SportsCenter(new String[]{"6666", "조정민"}, 'C', new int[]{3, 67}));
        SC.add(new SportsCenter(new String[]{"7777", "이규빈"}, 'D', new int[]{4, 34}));
        SC.add(new SportsCenter(new String[]{"8888", "전재웅"}, 'D', new int[]{5, 42}));

        System.out.println("\t\tSports Center");
        enter();
        line();
        System.out.println("회원번호\t이 름\t등 급\t운동종목\t\t사용시간\t\t기본요금\t\t사용요금\t\t납부요금\t\t보너스");
        line();
        for (int i = 0; i < SC.size(); i++){
            System.out.println(SC.get(i));
        }
        line();
    }

    private static void enter() {
        System.out.println();
    }

    private static void line() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
