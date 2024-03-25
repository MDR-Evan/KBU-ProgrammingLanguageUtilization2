public class Birthday {
    int year;
    int month;
    int day;

    public Birthday(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return String.format("(%4d년 %2d월 %2d일)", year, month, day);
    }
}
