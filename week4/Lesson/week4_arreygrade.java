public class arreygrade {
    protected String[] person;
    protected char gender;
    protected int[] score;

    public arreygrade(String[] person, char gender, int[] score) {
        this.person = person;
        this.gender = gender;
        this.score = score;
    }

    protected int sum() {
        int sum = 0;
        for (int i = 0; i < score.length; i++){
            sum += score[i];
        }
        return sum;
    }

    protected float avg() {
        return sum() / (float) score.length;
    }

    @Override
    public String toString() {
        return String.format("%7s, %3s, %c자, %3d, %3d, %3d, %3d, %3.2f", person[0], person[1], gender, score[0], score[1], score[2], sum(), avg());
    }
}
