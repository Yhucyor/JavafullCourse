package Java.OOP;

public class Student {
//    === LẬP TRÌNH HƯỚNG ĐỐI TƯỢNG OOP === //
    // Class là đối tượng tổng quát của real-world được mô phỏng
    // Object là đối tượng cụ thể - thực thể chi tiết của thực thể đấy

    // Thuộc tính của đối tượng Atrribute
    private String name;
    private int age;
    private String address;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    void setAddress(String address){
        this.address = address;
    }


    // Phương thức của đối tượng Method
    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    // Hàm tạo không cần kiểm dữ liệu trả về - mặc định là Public
    Student(){

    }
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}
