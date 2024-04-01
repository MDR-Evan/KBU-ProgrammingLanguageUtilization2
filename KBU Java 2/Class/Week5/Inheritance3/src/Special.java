package src;

import java.util.Arrays;

public class Special extends Customer{
    public Special(String[] person, int used) {
        super(person, used);
    }

    @Override
    protected int fee() {
        int fee = 0;
        int basic = 1660;
        float[] table = {184.1f, 223.8f, 278.3f, 353.6f, 466.4f, 643.9f};
        int used = getUsed() - 100;

        used = used < 0 ? 0 : used;

        if (used <= 100) {
            fee = (int) (used * table[0]) + basic;
        } else if (used <= 200) {
            fee = (int) (100 * table[0]) + basic;
            fee += (int) ((used - 100) * table[1]);
        } else if (used <= 300) {
            fee = (int) (100 * table[0]) + basic;
            fee += (int) ((used - 100) * table[1]);
            fee += (int) ((used - 200) * table[2]);
        } else if (used <= 400) {
            fee = (int) (100 * table[0]) + basic;
            fee += (int) (100 * table[1]);
            fee += (int) (100 * table[2]);
            fee += (int) ((used - 300) * table[3]);
        } else if (used <= 400) {
            fee = (int) (100 * table[0]) + basic;
            fee += (int) (100 * table[1]);
            fee += (int) (100 * table[2]);
            fee += (int) (100 * table[3]);
            fee += (int) ((used - 400) * table[4]);
        } else {
            fee = (int) (100 * table[0]) + basic;
            fee += (int) (100 * table[1]);
            fee += (int) (100 * table[2]);
            fee += (int) (100 * table[3]);
            fee += (int) (100 * table[4]);
            fee += (int) ((used - 500) * table[5]);
        }
        return fee;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\t지원 가구");
    }
}
