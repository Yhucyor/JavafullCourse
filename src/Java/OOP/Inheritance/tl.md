#41. Java Inheritance
Tài liệu: https://www.w3schools.com/java/java_inheritance.asp
Với Java, chúng ta có thể "kế thừa/thừa hưởng" (inherit) thuộc tính và phương
thức (attribute & method) từ 1 class khác.
Kế thừa được phân cấp thành:
- subclass (child) : đứa con, sẽ kế thừa/thừa hưởng lại "thành quả" của class khác
- superclass (parent): cha mẹ, sẽ cho đi "tài sản" để class khác kế thừa lại.
1. Nguyên tắc kế thừa
- 1 class chỉ có thể kế thừa "duy nhất" 01 class khác (đơn kế thừa)
  (nếu muốn kế thừa nhiều, sử dụng interface - sẽ học sau)

2. Mục đích của kế thừa
   Mục đích của thừa kế là "tái sử dụng" code.
   (không cần lặp lại code, tăng tính reuse, đồng thời phản ánh "thực tế vào code")
- Lớp con (childClass) có thể sử dụng thuộc tính và phương thức của lớp cha
  (superClass)
  => lưu ý về access modifier (chỉ kế thừa public/protected, không kế thừa private)
- Lớp con "không kế thừa" hàm tạo của lớp cha