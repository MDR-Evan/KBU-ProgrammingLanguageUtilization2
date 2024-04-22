public class Output {
    private TotalDB totalDB;

    public Output(TotalDB totalDB) {
        this.totalDB = totalDB;
        totalDB.sort();
    }

    protected void display() {
        System.out.println("\t\t\t\t수\t도\t요\t금");
        line();
        System.out.println("번호\t이름\t구분\t사용량\t사용금액\t세금\t납부액\t비고");
        line();
        for (int i = 0; i < totalDB.getLength(); i++) {
            System.out.println(totalDB.getHouses(i));
        }
        line();
        System.out.println(totalDB);
        line();
    }

    private void line() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
}