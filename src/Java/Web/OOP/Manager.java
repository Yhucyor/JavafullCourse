package Java.Web.OOP;

public class Manager {
    public static void main(String[] args) {
        Student s1 = new Student(); // Constructor: hàm tạo
        s1.setName("Ngoc Minh");
        s1.printInfo();

        Student s2 = new Student("Minh", 18);
        s2.printInfo();
    }
}
