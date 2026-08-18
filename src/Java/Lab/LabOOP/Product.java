package Java.Lab.LabOOP;

public class Product {
    private String name;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    private double price;
    private double tax;

    public Product(){

    }
    public Product(String name, double price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }
    public Product nhapHoaDon(String name, double price, double tax) {
        Product product = new Product(name, price, tax);
        return product;
    }
    public void xuatHoaDon(Product product){
        System.out.println("This product name is " + product.getName());
        System.out.println("This price is " + product.getPrice());
        System.out.println("This tax is " + product.getTax());
    }

    public double getPriceTax(double price, double tax){
        return price * tax;
    }

}
