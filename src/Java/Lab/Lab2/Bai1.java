package Java.Lab.Lab2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        System.out.print("Giai phuong trinh bat nhat ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if ( a == 0 && b == 0) {
            System.out.println("Phuong trinh co vo nghiep");
        } else if (a == 0 && b != 0) {
            System.out.println("Phuong trinh vo nghiep");
        } else {
            System.out.println("Phuong trinh nghiep la: " + (-b/a));
        }
    }
}
