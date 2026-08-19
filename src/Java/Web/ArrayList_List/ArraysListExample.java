package Java.Web.ArrayList_List;

import java.util.ArrayList;
import java.util.List;

public class ArraysListExample {
    public static void main(String[] args) {

        //1. Có thể có nhiều kiểu dữ liệu khác nhau
        ArrayList list = new ArrayList();
        list.add(1);
        list.add("Ngoc Minh");
        System.out.println(list);

        //2. Khai báo
        ArrayList<String> listA = new ArrayList<>();
        listA.add("Ngoc Minh");
        System.out.println(listA);

        List<String> listB = new ArrayList<>();
        listB.add("Ngoc Minh");
        System.out.println(listB);

        List<Integer> nums =
                List.of(1, 2, 3, 4, 5, 6);
        List<Integer> result = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 10)
                .toList();
    }
}
