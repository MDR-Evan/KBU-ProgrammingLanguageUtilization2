import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileHandler {
    private Scanner kb;

    public FileHandler(Scanner kb) {
        this.kb = kb;
    }

    public ArrayList<Customer> readData(String filename) {
        ArrayList<Customer> customers = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(" ");
                if (data.length >= 3) {
                    String customerNumber = data[0];
                    String name = data[1];
                    String type = data[2];

                    Customer customer = new Customer(customerNumber, name, type);
                    customers.add(customer);
                }
            }
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }

        return customers;
    }

    public void inputData(ArrayList<Customer> customers) {
        for (Customer customer : customers) {
            int time;
            while (true) {
                System.out.printf("%s 고객의 이용시간 입력: ", customer.getName());
                time = kb.nextInt();
                if (time >= 1 && time <= 999) {
                    customer.setTime(time);
                    break;
                } else {
                    System.err.printf("이용시간을 다시 확인해주세요.\n");
                }
            }

            int distance;
            while (true) {
                System.out.printf("%s 고객의 이용거리 입력: ", customer.getName());
                distance = kb.nextInt();
                if (distance >= 0 && distance <= 999) {
                    customer.setDistance(distance);
                    break;
                } else {
                    System.err.printf("이용거리를 다시 확인해주세요.\n");
                }
            }

            char driver;
            while (true) {
                System.out.printf("%s 고객의 담당 기사가 배정되었습니까? (Y/N): ", customer.getName());
                driver = kb.next().charAt(0);
                if (driver == 'Y' || driver == 'y' || driver == 'N' || driver == 'n') {
                    customer.setDriver(driver);
                    break;
                } else {
                    System.err.println("Y 또는 N으로 다시 입력하세요.");
                }
            }
        }
    }
}
