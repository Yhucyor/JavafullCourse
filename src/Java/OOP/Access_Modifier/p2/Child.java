package Java.OOP.Access_Modifier.p2;

import Java.OOP.Access_Modifier.p1.P;

public class Child extends P {

    public void test() {

        System.out.println(a); // ✅ public
        System.out.println(c); // ✅ protected

        // System.out.println(b); // ❌ default
        // System.out.println(d); // ❌ private
    }
}