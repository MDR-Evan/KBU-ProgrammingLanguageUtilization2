import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String filename = ".\\data\\custom.txt";
        String output = ".\\data\\Rent Car.txt";
        ArrayList<Customer> customers;
        Scanner kb = new Scanner(System.in);

        FileHandler fileHandler = new FileHandler(kb);
        customers = fileHandler.readData(filename);
        fileHandler.inputData(customers);

        sort(customers);
        display(customers);
    }

    private static void sort(ArrayList<Customer> customers) {
        for (int i = 0; i < customers.size(); i++) {
            for (int j = i + 1; j < customers.size(); j++) {
                if (customers.get(i).getCustom_num().compareTo(customers.get(j).getCustom_num()) > 0) {
                    Customer temp = customers.get(i);
                    customers.set(i, customers.get(j));
                    customers.set(j, temp);
                }
            }
        }
    }

    private static void display(List<Customer> customers) {
        String filePath = ".\\data\\Rent Car.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write("\t\t\t\t\t\t\t\t Rent Car");
            bw.newLine();
            bw.write("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            bw.newLine();
            bw.write(" 고객번호\t 이름\t코드\t\t 차량종류명\t\t사용시간\t\t사용거리\t\t기본요금\t\t  추가요금\t\t  할인금액\t\t  납부요금\t\t  비고");
            bw.newLine();
            bw.write("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            bw.newLine();

            for (Customer customer : customers) {
                bw.write(customer.toString());
                bw.newLine();
            }

            bw.write("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("\t\t\t\t\t\t\t\t Rent Car");
        line();
        System.out.println(" 고객번호\t 이름\t코드\t\t 차량종류명\t\t사용시간\t\t사용거리\t\t기본요금\t\t  추가요금\t\t  할인금액\t\t  납부요금\t\t  비고");
        line();
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
        line();
    }
    private static void line() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}