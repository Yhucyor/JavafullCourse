package Java.Web.MapAndHashMap;

import java.util.HashMap;
import java.util.Map;

public class MapandHashMap {
    public static void main(String[] args) {
        //1. Khai báo
        HashMap<String, Integer> map = new HashMap<>(18, 0.85f);
        // Thêm dữ liệu
        map.put("Java", 95);
        map.put("Python", 85);
        map.put("C", 80);

        //2. Khởi tạo Map (Key là tên sinh viên kiểu String, Value là điểm kiểu Integer)
        Map<String, Integer> studentScores = new HashMap<>();

        System.out.println("--- 4. CÁC PHƯƠNG THỨC THƯỜNG DÙNG ---");

        // put(key, value): Thêm cặp key-value
        studentScores.put("An", 85);
        studentScores.put("Bình", 90);
        studentScores.put("Châu", 75);
        System.out.println("Sau khi put: " + studentScores); // {An=85, Bình=90, Châu=75}

        // get(key): Lấy giá trị theo key
        System.out.println("Điểm của An: " + studentScores.get("An")); // 85
        System.out.println("Điểm của Dũng (không có): " + studentScores.get("Dũng")); // null

        // getOrDefault(key, defaultValue): Lấy giá trị, nếu không có thì trả về giá trị mặc định
        // Ví dụ: Nếu không tìm thấy Dũng, mặc định cho điểm 0
        int scoreDung = studentScores.getOrDefault("Dũng", 0);
        System.out.println("Điểm của Dũng (dùng getOrDefault): " + scoreDung); // 0

        // containsKey(key): Kiểm tra key có tồn tại không
        System.out.println("Có sinh viên tên Châu không? " + studentScores.containsKey("Châu")); // true
        System.out.println("Có sinh viên tên Hoa không? " + studentScores.containsKey("Hoa"));   // false

        // containsValue(value): Kiểm tra value có tồn tại không
        System.out.println("Có ai được 90 điểm không? " + studentScores.containsValue(90)); // true

        // replace(key, value): Thay thế giá trị cũ bằng giá trị mới
        studentScores.replace("An", 95); // An đang là 85, đổi thành 95
        System.out.println("Sau khi replace điểm An: " + studentScores); // {An=95, Bình=90, Châu=75}

        // size(): Trả về số lượng cặp key-value
        System.out.println("Số lượng sinh viên: " + studentScores.size()); // 3

        // isEmpty(): Kiểm tra Map có rỗng không
        System.out.println("Map có rỗng không? " + studentScores.isEmpty()); // false

        // remove(key): Xóa cặp key-value
        studentScores.remove("Bình");
        System.out.println("Sau khi xóa Bình: " + studentScores); // {An=95, Châu=75}

        // keySet(): Trả về Set chứa tất cả các key
        System.out.println("Danh sách tên sinh viên (keySet): " + studentScores.keySet()); // [An, Châu]

        // values(): Trả về Collection chứa tất cả các value
        System.out.println("Danh sách điểm sinh viên (values): " + studentScores.values()); // [95, 75]

        // entrySet(): Trả về Set chứa tất cả các cặp Map.Entry (key-value)
        System.out.println("Danh sách cặp (key-value): " + studentScores.entrySet()); // [An=95, Châu=75]


        System.out.println("\n--- 7. DUYỆT MAP ---");
        // Dùng lại Map hiện tại (An=95, Châu=75)

        // 7.1 Duyệt bằng keySet() (Cách 1)
        System.out.println("7.1 Duyệt bằng keySet():");
        for (String key : studentScores.keySet()) {
            // Lấy value ra dựa vào key
            System.out.println(key + " = " + studentScores.get(key));
        }

        // 7.2 Duyệt bằng entrySet() (Cách 2 - Khuyên dùng vì nhanh hơn)
        System.out.println("\n7.2 Duyệt bằng entrySet():");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            // Lấy cả key và value trực tiếp từ cặp entry
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // 7.3 Duyệt bằng forEach() (Java 8+ - Cách hiện đại và gọn nhất)
        System.out.println("\n7.3 Duyệt bằng forEach():");
        studentScores.forEach((key, value) -> {
            System.out.println(key + " = " + value);
        });

        // clear(): Xóa tất cả các cặp key-value (Đặt ở cuối cùng)
        studentScores.clear();
        System.out.println("\nSau khi clear(), Map rỗng? " + studentScores.isEmpty()); // true
    }
}
