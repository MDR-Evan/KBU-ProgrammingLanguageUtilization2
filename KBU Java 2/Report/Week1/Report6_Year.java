public class Report6_Year {
    private int year;

    public Report6_Year(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public char Leaf_Year(){
        char result  = year % 4 == 0 ? '윤' : year % 4 % 100 == 0 ? '평' : year % 4 % 100 % 400 == 0 ? '윤' : '평';
        return result;
    }

    @Override
    public String toString() {
        return String.format("%d년도는 %c년 입니다.", year, Leaf_Year());
    }
}
