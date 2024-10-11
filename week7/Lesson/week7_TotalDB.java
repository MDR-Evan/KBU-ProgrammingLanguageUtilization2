import java.util.Arrays;

public class TotalDB {
    private House[] houses;

    public TotalDB(House[] houses) {
        this.houses = houses;
    }

   public int getLength() {
        return houses.length;
   }

   public House getHouses(int index) {
        return houses[index];
   }

   public float usedTotal() {
        float use = 0.0f;
        for (int i = 0; i < houses.length; i++) {
            use += houses[i].getUse_W();
        }
        return use;
   }
    public float taxTotal() {
        int tax = 0;
        for (int i = 0; i < houses.length; i++) {
            tax += houses[i].getUse_W();
        }
        return tax;
    }
    public float feeTotal() {
        int charge = 0;
        for (int i = 0; i < houses.length; i++) {
            charge += houses[i].getUse_W();
        }
        return charge;
    }

    public float chageTotal() {
        int charge = 0;
        for (int i = 0; i < houses.length; i++) {
            charge += houses[i].getUse_W();
        }
        return charge;
    }

    public void sort() {
        for (int i = 0; i < houses.length - 1; i++) {
            for (int j = 0; j < houses.length; j++) {
                if (houses[i].pay() < houses[j].pay()) {
                    House temp = houses[j];
                    houses[j] = houses[i];
                    houses[i] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return String.format("\t사용량 합계 : %,9.2f\n\t요금 합계 : %,9.0f 원\n\t세금 합계 : %,9.0f 원\n\t징수금 합계 : %,9.0f 원", usedTotal(), feeTotal(), taxTotal(), chageTotal());
    }
}
