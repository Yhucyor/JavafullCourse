#34. Java Generics (Basic)
Tài liệu:
https://docs.oracle.com/javase/tutorial/java/generics/index.html
Lưu ý: Generic là 1 topic rộng, video này chỉ là cơ bản (type parameters). phần còn
lại có thể tham khảo ở link trên, và học thông qua thực hành project.
1. Generic là gì ?
   Có bao giờ bạn thắc mắc:
   ArrayList<Integer> a = ... // <Integer> là cú pháp generic
   ArrayList<String> b = ... // <String> là cú pháp generic
   Generic là cú pháp được giới thiệu vào v5 của Java, giúp "cải thiện chất lượng" của
   code.
   The following code snippet without generics requires casting:
   List list = new ArrayList();
   list.add("hello");
   String s = (String) list.get(0);
   When re-written to use generics, the code does not require casting:
   List<String> list = new ArrayList<String>();
   list.add("hello");
   String s = list.get(0); // no cast
2. Tại sao cần Generic
- Generic giúp "báo lỗi" khi "dịch code " (code gồm 2 giai đoạn: compile then run)
- Generic giúp tái sử dụng code (ví dụ như viết các hàm, class tổng quát)
  https://docs.oracle.com/javase/tutorial/java/generics/types.html

3. Java Diamond
   được giới thiệu từ Java v7, khi sử dụng constructor với generic, không bắt buộc phải
   truyền type (vì compiler sẽ tự đống gán/đoán type)
   Ví dụ: Box<Integer> box = new Box<>( );
   //thay vì: Box<Integer> box = new Box<Integer>( );