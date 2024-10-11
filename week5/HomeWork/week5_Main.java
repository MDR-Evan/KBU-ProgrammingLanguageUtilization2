import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Business> houses = new ArrayList<>();
        houses.add(new Business(new String[]{"1111", "김진용"}, new float[]{670.1F, 1f}));
        houses.add(new Army(new String[]{"2222", "김익주"}, new float[]{670.1F, 5f}));
        houses.add(new Business(new String[]{"3333", "장승연"}, new float[]{670.1F, 2f}));
        houses.add(new Business(new String[]{"4444", "김가희"}, new float[]{670.1F, 3f}));
        houses.add(new Business(new String[]{"5555", "조정민"}, new float[]{670.1F, 4f}));
        houses.add(new Army(new String[]{"6666", "이규빈"}, new float[]{670.1F, 5f}));
        houses.add(new Business(new String[]{"7777", "김선민"}, new float[]{670.1F, 1f}));
        houses.add(new Army(new String[]{"8888", "오정민"}, new float[]{670.1F, 5f}));
        houses.add(new Business(new String[]{"9999", "홍길동"}, new float[]{670.1F, 2f}));
        houses.add(new Business(new String[]{"0000", "이순신"}, new float[]{670.1F, 3f}));


        // 수 입력
        for (int i = 0; i < houses.size(); i++) {
            houses.get(i).input();
        }

        Offices offices1 = new Offices(houses);
        offices1.display();
    }
}
