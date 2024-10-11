import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Process implements Lotto{

    @Override
    public int[] getNum() {
        Set<Integer> ran_num = new HashSet<>();
        Random random = new Random();
        while (ran_num.size() < Num_count) {
            int num = random.nextInt(45) + 1;
            ran_num.add(num);
        }
        int[] result = new int[Num_count];
        int index = 0;
        for (int num : ran_num) {
            result[index++] = num;
        }
        return result;
    }

    @Override
    public void printNum(int[] result) {
        System.out.print("Lotto 번호 : ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}