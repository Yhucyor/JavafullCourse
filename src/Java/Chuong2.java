package Java;

public class Chuong2 {
    public static void main(String[] args) {
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
