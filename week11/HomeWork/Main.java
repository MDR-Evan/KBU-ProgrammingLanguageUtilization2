import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String filePath = ".\\data\\employees.txt";
        File file = new File(filePath);

        List<Employee> employees = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 4) {
                    try {
                        String bunho = data[0].trim();
                        String name = data[1].trim();
                        int hobong = Integer.parseInt(data[2].trim());
                        int sudang = Integer.parseInt(data[3].trim());

                        Employee employee = new Employee(name, bunho, hobong, sudang);
                        employees.add(employee);
                    } catch (NumberFormatException e) {
                        System.err.println("잘못된 데이터 형식입니다: " + line);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        display(employees);
    }

    private static void display(List<Employee> employees) {
        String filePath = ".\\data\\employee.txt";
        File file = new File(filePath);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write("\t\t\t\t\t\t\t\t 급여처리");
            bw.newLine();
            bw.write("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            bw.newLine();
            bw.write(" 사번\t 이름\t호봉\t\t 수당\t\t기본급\t\t급여액\t\t세금\t\t  지급액");
            bw.newLine();
            bw.write("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            bw.newLine();

            for (Employee employee : employees) {
                bw.write(employee.toString());
                bw.newLine();
            }

            bw.write("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
