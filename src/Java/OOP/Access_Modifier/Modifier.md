1. Khái niệm package
   package === folder
   => được sử dụng để "gom nhóm" file lại với nhau => cho gọn gàng, dễ tái sử dụng
- Keyword import:
+ được sử dụng để import (tái sử dụng lại) các class đã được định nghĩa trong các
  package
2. Access Modifier
   Access Modifier : quyền truy cập sử dụng/sửa đổi
   Trong java, có 4 thuộc tính hay dùng nhất:
- private: chỉ được sử dụng trong nội bộ class
- public : công khai hoàn toàn (100%)
- (default): là public đối với class trong cùng package. là private khi khác package
- protected: được sử dụng với lớp cha/con (tính chất kế thừa : sẽ đề cập sau)
  => public và private là 2 thuộc tính được sử dụng nhiều nhất
  Mức độ che dấu tăng dần theo mũi tên:
  public -> protected -> {default} -> private