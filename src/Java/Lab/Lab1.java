package Java.Lab;

import java.util.Scanner;

public class Lab1 {
//    Bài tập thực hiện sau khi học bài 1-4
    public static void main(String[] args) {
//        Bài tập 1
        Scanner input = new Scanner(System.in);
//        String name =  input.nextLine();
//        int age = input.nextInt();
//        System.out.printf("Your name is %s. and %d", name, age);
//
//        Bài 2
        System.out.print("Nhập các cạnh của hình chữ nhật: ");
        int length =  input.nextInt();
        int width =  input.nextInt();
        System.out.printf("Chu vi hinh chu nhat la %d", length * width );

        input.close();
    }

}
