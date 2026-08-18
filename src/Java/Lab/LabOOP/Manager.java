package Java.Lab.LabOOP;

import Java.OOP.Access_Modifier.p1.P;

public class Manager {
    public static void main(String[] args) {
        Product test = new Product();
        Product pr = new Product("COMPUTER", 200, 10);

        test.xuatHoaDon(pr);
    }
}
