package Java.Lab.Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = input.nextInt();
        int[] a = new int[n];
        System.out.println("Nhap phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        System.out.println("Mảng ban đầu là: " + Arrays.toString(a));

        // Xắp xếp các phần tử trong mảng
        Arrays.sort(a);
        System.out.println("Nhap phan tu cua mang sau khi sap xep: " + Arrays.toString(a));

    }
}
