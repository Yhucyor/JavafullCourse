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
//        Bài 12
//        int score = 9;
//        if(score >= 9){
//            System.out.println("Good");
//        } else if(score >= 8){
//            System.out.println("Pass");
//        } else {
//            System.out.println("Fail");
//        }
//        Scanner input = new Scanner(System.in);
//        System.out.print("Nhập vào danh thu của bạn: ");
//        int tax = input.nextInt();
//        if(tax < 10){
//            System.out.println("Không đón thuees");
//        } else if ( tax >= 10 && tax <= 15){
//            System.out.println("Đóng thuế 10%");
//        } else{
//            System.out.println("Đóng thuế 20%");
//        }

//        Bài 13: Câu lệnh điều kiện Switch Case
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("I don't know");
        }
    }
}
