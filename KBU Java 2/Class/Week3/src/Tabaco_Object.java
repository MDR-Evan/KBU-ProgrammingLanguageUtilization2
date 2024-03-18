public class Tabaco_Object {
    private int year;
    private int cigar;
    final private int OneYear = 365;    // 기호적 상수
    final private int SevenMin = 7;

    public Tabaco_Object(int year, int cigar) {
        this.year = year;
        this.cigar = cigar;
    }

    public int getYear() {
        return year;
    }

    public int getCigar() {
        return cigar;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCigar(int cigar) {
        this.cigar = cigar;
    }

    private int calcSmoke(){   // 평생 흡연한 담배 개피 수
        int count = cigar * OneYear * year;
        return count;
    }
    public String calcDay(){  // 담배 1개피 수명단축 시간 = 7분

        int minute = calcSmoke() * SevenMin;
        int hour = minute / 60; // 시간
        minute = minute % 60;   // 분
        int day = hour / 24;    // 일 수
        hour %= 24;
        int year = day / OneYear;   // 연 수
        day %= OneYear;

        return String.format("%d년 %d일 %d시간 %d분", year, day , hour, minute);
    }

    @Override
    public String toString() {
        return String.format("담배를 하루에 %d개피씩 %d년 피우면\n단축되는 수명은 %s", cigar, year, calcDay());
    }
}
