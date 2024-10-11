public class Moon_Object {
    private float weight;

    public Moon_Object(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private float moonWeight(){
        float moonWeight = weight * (16.5f / 100);

        return moonWeight;
    }

    @Override
    public String toString() {
        return String.format("지구에서의 몸무게 : %.2f Kg\n" + "달에서의 몸무게 : %.2f Kg\n", weight, moonWeight());
    }
}
