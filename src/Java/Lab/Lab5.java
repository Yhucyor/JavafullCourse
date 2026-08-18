package Java.Lab;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> arrNumber = new ArrayList<>();

        while (true) {

            System.out.print("Nhập vào 1 số thực bất kỳ: ");
            double input = scanner.nextDouble();

            arrNumber.add(input);

            scanner.nextLine(); // lấy Enter còn dư

            System.out.print("Continue ? Y or N >>> ");
            String option = scanner.nextLine();

            if (option.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("check array: " + arrNumber);

        scanner.close();
    }
}