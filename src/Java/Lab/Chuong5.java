package Java.Lab;

import java.util.ArrayList;

public class Chuong5 {
    //  ArrayList - Không giới hạn phần tử
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(2); // Tự động chuyển đổi từ interge thành Interge
        arrayList.add("Hoc Tap");
        System.out.println(arrayList);

        // Ép kiểu dữ liệu ArrayList
        ArrayList<String>  arrayList2 = new ArrayList<>();
        arrayList2.add("Hoc Tap");
        System.out.println(arrayList2.toString());
        // Size
        System.out.println(arrayList.size());
        // Lay phan tu trong ArrayList - add, clear, remove, get
        System.out.println(arrayList2.get(0));
    }

}
