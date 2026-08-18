package Java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Chuong6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name =  sc.nextLine();
        String password = sc.nextLine();
        System.out.println(name + " " + password);
        // Đối tượng phải sử dụng equals
        // startWith("")
        if(name.equals("Minh")  && password.length()> 2){
            System.out.println("Thanks for playing!");
        }
//        Java hỗ trợ gói: java.util.regex để xử lý regular expression, bao gồm các class chính:
//          - Pattern Class: định nghĩa "hình thức để search"
//          - Matcher Class: được sử dụng để search
//          - PatternSyntaxException Class: xử lý exception về lỗi cú pháp
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
    //#37. String (Chuỗi)
    //Why String ?
    //String là loại dữ liệu được dùng nhiều nhất trong ngôn ngữ lập trình.
    //        1. String data type
    //- String được dùng để lưu trữ "chuỗi ký tự".
    //Nếu như char là lưu trữ "ký tự đơn lẻ", String dùng để lưu trữ nhiều ký tự (chuỗi)
    //        Với java, String (chữ S viết hoa) là một "Class" được xây dựng sẵn (non-primitive data
    //        type)
    //Ví dụ: String a = "Hello World";
    //Một vài ký tự đặc biệt:
    //https://www.w3schools.com/java/java_strings_specchars.asp
    //        \t : ký tự tab
    //\r : Về đầu dòng
    //\n : xuống dòng
    //\\ : \
    //        \" : " (in ra dấu nháy đôi)
    //        2. Các method thường dùng
    //String là Object (Class), nên nó sẽ có các method được xây dựng sẵn:
    //length() : lấy độ dài của chuỗi
    //trim() : bỏ đi dấu space đầu/cuối của chuỗi
    //toLowerCase() : viết thường tất cả ký tự
    //toUpperCase(): viết hoa tất cả ký tự
    //substring(): cắt chuối thành chuỗi con
    //
    //Khóa Học Java Core - Youtube Channel ‘Hỏi Dân IT’
    //
    //        56
    //
    //        #38. Bài tập sử dụng String
    //Ví dụ 1: Nhập username và password từ bàn phím. Nếu username = "hoidanit" và
    //password > 6 ký tự thì hợp lệ
    //gợi ý: sử dụng equals để so sánh; length để check chiều dài
    //Ví dụ 2: Ứng dụng quản lý sinh viên
    //- Tạo class Student với thuộc tính name, id
    //- Tại hàm main, tạo 5 students với tên khác nhau (sử dụng constructor)
    //eg: new Student("Nam", 1); new Student("Eric", 2);
    //Yêu cầu: tìm và xuất ra:
    //        - các student có tên bắt đầu là "Nguyễn"