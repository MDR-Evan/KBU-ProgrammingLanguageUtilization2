import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        House[] data = new House[]{
                new House(new String[]{"1365", "홍길동"}),
                new Of(new String[]{"5678", "이대한"}),
                new Cp(new String[]{"3333", "이수도"}),
                new Am(new String[]{"4444", "김천지"}),
                new House(new String[]{"5234", "정밀도"}),
                new Bs(new String[]{"5567", "정확한"}),
                new House(new String[]{"3473", "이수한"}),
                new Am(new String[]{"4564", "김천도"}),
                new Cp(new String[]{"5895", "정확도"}),
                new House(new String[]{"5523", "김이천"})
        };

        for (int i = 0; i < data.length; i++)
            data[i].input();
        TotalDB totalDB = new TotalDB(data);
        Output output = new Output(totalDB);
        output.display();
    }
}