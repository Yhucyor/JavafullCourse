1. Map là gì? (Mục 1)
   Giải thích đơn giản: Hãy tưởng tượng Map giống như một cuốn từ điển hoặc tủ đồ có nhãn dán.

Bạn có "Từ khóa" (Key) và "Định nghĩa" (Value).

Muốn lấy món đồ, bạn chỉ cần tìm theo nhãn dán (Key), không cần lục tung cả tủ.

Đặc điểm quan trọng:

Không trùng Key: Mỗi chiếc nhãn (Key) là duy nhất. Nếu bạn dán nhãn mới trùng với nhãn cũ, nhãn cũ sẽ bị ghi đè (thay thế).

Không theo thứ tự: Các món đồ trong tủ không xếp hàng từ 1 đến cuối, chúng đứng lộn xộn (điều này khác với danh sách List).

Ví dụ thực tế (Mã giả):

java
Map<String, String> dictionary = new HashMap<>();
dictionary.put("Java", "Ngôn ngữ lập trình hướng đối tượng");
dictionary.put("HTML", "Ngôn ngữ đánh dấu trang web");
// Lấy giá trị
System.out.println(dictionary.get("Java")); // In ra: "Ngôn ngữ lập trình..."
2. Các lớp triển khai Map phổ biến (Mục 2 & Phần dưới mục 10)
   Có 5 loại chính, bạn cần nhớ sự khác biệt để chọn đúng:

Tên lớp	Đặc điểm chính	Khả năng chứa null	Đồng bộ (An toàn đa luồng)
HashMap	Phổ biến nhất, nhanh nhất (O(1)), không giữ thứ tự.	Key: 1 cái null, Value: Nhiều null.	Không an toàn.
LinkedHashMap	Giống HashMap nhưng giữ nguyên thứ tự khi bạn thêm vào.	Như trên.	Không an toàn.
TreeMap	Sắp xếp các Key theo thứ tự (tự nhiên hoặc theo quy tắc bạn cài).	Key: Không, Value: Có.	Không an toàn.
Hashtable	Giống HashMap (Cổ điển, cũ).	Cả Key và Value đều KHÔNG được để null.	Có an toàn (đồng bộ).
ConcurrentHashMap	Dùng cho đa luồng, hiệu năng cao hơn Hashtable.	Key & Value: Không được null.	Có an toàn (đồng bộ).
Lời khuyên:

Dùng HashMap nếu không cần giữ thứ tự (dùng 90% trường hợp).

Dùng TreeMap nếu muốn dữ liệu tự động sắp xếp ví dụ theo bảng chữ cái.

Dùng ConcurrentHashMap nếu viết phần mềm server nhiều người dùng truy cập cùng lúc.

3. Cách tạo HashMap (Mục 3)
   Khai báo cơ bản:
   Map<String, Integer> map = new HashMap<>();

Tham số quan trọng (đọc mục 3 bên phải):

initialCapacity (Dung lượng ban đầu): Mặc định là 16. Nếu bạn biết sẽ lưu trữ nhiều dữ liệu, hãy đặt con số lớn hơn (ví dụ 1000) để tránh máy tính phải "mở rộng tủ" nhiều lần (tốn hiệu năng).

loadFactor (Hệ số tải): Mặc định là 0.75. Có nghĩa là khi tủ đầy 75% (16 x 0.75 = 12 món), cái tủ sẽ tự động to ra gấp đôi để chứa thêm.

4. Các phương thức thông dụng (Mục 4) - Ví dụ thực tế
   Giả sử ta có code Java:

java
Map<String, Integer> scoreMap = new HashMap<>();
scoreMap.put("Alice", 95);   // Thêm cặp Key "Alice", Value 95
scoreMap.put("Bob", 80);
put(key, value): Thêm mới hoặc Cập nhật. Nếu "Alice" đã tồn tại, điểm 95 sẽ ghi đè lên điểm cũ.

get(key): Lấy ra. Ví dụ scoreMap.get("Bob") -> trả về 80.

containsKey(key): Kiểm tra xem có sinh viên tên "Alice" không? -> true.

remove(key): Xóa sinh viên "Bob" ra khỏi danh sách.

size(): Đếm xem có bao nhiêu sinh viên? -> trả về 2.

keySet(): Lấy ra một danh sách chứa tất cả tên (Alice, Bob).

5. Nguyên lý hoạt động bên trong (Mục 5) - "Búa và Kệ"
   Đây là phần cốt lõi giúp HashMap chạy nhanh (Độ phức tạp O(1) - chỉ mất 1 giây để tìm).

Băm (Hash): Khi bạn put("Alice", 95), máy sẽ lấy chữ "Alice" chạy qua công thức toán học (hàm hash) để ra một con số, ví dụ là 5.

Tìm kệ (Index): Lấy số 5 chia cho kích thước của tủ (mặc định là 16 kệ). Nó sẽ tìm được kệ số 5.

Cất đồ: Nó đặt cặp (Alice, 95) lên kệ số 5.

Va chạm (Hash collision): Nếu bạn thêm "Bob" mà máy tính cũng tính ra kệ số 5?

Không sao, các kệ trong Java được thiết kế thành danh sách liên kết (Linked List) hoặc Cây nhị phân (Tree) nếu quá đông. Nó sẽ xếp hàng: [Alice, 95] -> [Bob, 80] -> ...

Khi muốn lấy Bob, máy chạy ra kệ 5, thấy có 2 người, nó sẽ so sánh từng Key xem đứa nào tên "Bob" thì lấy điểm.

6. Độ phức tạp thời gian (Mục 8)
   get(), put(), remove(): Mất O(1) (Rất nhanh, gần như tức thì).

containsKey(): Mất O(1).

Lưu ý: Nếu xảy ra quá nhiều va chạm (nhiều vật cùng rơi vào 1 kệ), thời gian sẽ tăng lên thành O(n) (phải dò từng vật trên kệ), nhưng Java rất thông minh, nếu kệ nào nhiều đồ quá, nó chuyển từ "Xếp hàng" sang "Cây nhị phân" để tốc độ tìm kiếm chỉ còn O(log n) (cực kỳ nhanh).

7. Ví dụ code hoàn chỉnh (Mục 6)
   Đây là ví dụ y hệt trong hình:

java
public class Main {
public static void main(String[] args) {
Map<String, Integer> map = new HashMap<>();

        // Thêm dữ liệu
        map.put("Java", 95);
        map.put("Python", 85);
        map.put("C", 80);
        
        // In kích thước map
        System.out.println("Kích thước: " + map.size()); // Kết quả: 3
        
        // Xóa một phần tử
        map.remove("C");
        
        // In ra key và value
        for (String key : map.keySet()) {
            System.out.println(key + " => " + map.get(key));
        }
        // Kết quả sẽ là: 
        // Java => 95
        // Python => 85
        // (Không thấy C vì đã xóa)
    }
}
8. Lưu ý quan trọng khi dùng Map (Mục 9)
   Key phải override equals() và hashCode(): (Chỉ áp dụng khi bạn tự tạo lớp đối tượng riêng).

Giải thích: Máy tính dùng hashCode() để tìm kệ, nhưng dùng equals() để chắc chắn đó đúng là người bạn cần tìm. Nếu bạn không định nghĩa 2 hàm này, 2 đối tượng giống hệt nhau sẽ bị hiểu là 2 người khác nhau (lỗi nghiêm trọng).

Không dùng HashMap trong đa luồng: Nếu nhiều luồng cùng sửa map cùng lúc sẽ bị lỗi.

Dùng ConcurrentHashMap: Thay thế khi viết code server lớn.

Tóm lại (Mục 10)
Map dùng để lưu cặp Key - Value (Từ điển).

HashMap là lựa chọn số 1 vì tốc độ nhanh.

Lưu ý: Không có thứ tự, Key duy nhất, được phép 1 Key null.

Nếu cần thứ tự -> Dùng LinkedHashMap.

Nếu cần sắp xếp -> Dùng TreeMap.

Nếu cần đa luồng (an toàn) -> Dùng ConcurrentHashMap.