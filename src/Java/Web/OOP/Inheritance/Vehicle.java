package Java.Web.OOP.Inheritance;

public abstract class Vehicle {
    protected String brand = "Ford"; // Vehicle attribute
    Vehicle(){

    }
    public abstract void dongCo();
    // Nếu không khai báo pulic ở abstract thì có có chỉ sử được chung trong package
    // Không được khai báo là private
    public void honk() { // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}