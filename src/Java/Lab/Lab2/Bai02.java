package Java.Lab.Lab2;

import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a = ");
        int a = sc.nextInt();

        System.out.print("Nhap b = ");
        int b = sc.nextInt();

        System.out.print("Nhap c = ");
        int c = sc.nextInt();

        // Truong hop a = 0
        if (a == 0) {

            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                double x = (double) -c / b;
                System.out.println("Phuong trinh co nghiem x = " + x);
            }

        } else {

            // Tinh delta
            double delta = b * b - 4.0 * a * c;

            // Delta < 0
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            }

            // Delta = 0
            else if (delta == 0) {
                double x = (double) -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep x = " + x);
            }

            // Delta > 0
            else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("Phuong trinh co 2 nghiem phan biet");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }

        sc.close();
    }
}
