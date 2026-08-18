package Java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //CHƯƠNG 1: GIỚI THIỆU CƠ BẢN
//        Bài 1: Giới thiệu
//        Java code có thể    chạy ở bất cứ hệ điều hành nào
//        JVM chuyển đổi code thành mã máy để máy tính có thể hiểu được
        System.out.println("Hello World");

//        Bài 2: Biến
        int a = 9;
        int b = 10;
        int d;
        int c = a + b;
        String ten = "Ngoc Minh";
        float diem = 4.5f; // Riêng float phải có f ở sau
        long giaTri = 10000L;
        System.out.print("Thuc hien phep toan \n");
        System.out.println("Kết quả của phép tóan:" + c);

//        Bài 3: Fomat dữ liệu và nhập dữ liệu từ bàn phím
//        System.out.printf("Thuc hien %d va %s", 1000, "thuc hien");
//        Scanner input = new Scanner(System.in);
//        String name = input.nextLine();
//        int age = input.nextInt();
//        System.out.println("My name is " + name + "and I am " + age + " years old.");
//            Làm tròn %.f

//        Bài 4: Các hàm toán học cơ bản dự vào thư viện Math
        int Max = Math.max(a, b);
        System.out.printf("My age is %d years old.", Max);

//        Bài 5: Toán tử Logic
//                and: &&, or: ||, not: !

        // CHƯƠNG 2: CÁC CÂU LỆNH ĐIỀU KIỆN
    }
}
