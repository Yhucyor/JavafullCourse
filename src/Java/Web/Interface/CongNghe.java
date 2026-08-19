package Java.Web.Interface;

interface CongNghe {
    // 1. ABSTRACT METHOD
    void moTaCongNghe();

    // 2. DEFAULT METHOD
    default void khoiDong() {
        System.out.println("Đang khởi động...");
        kiemTraHeThong();  // Gọi private method
    }

    default void tatMay() {
        System.out.println("Đang tắt...");
        luuDuLieu();       // Gọi private method
    }

    // 3. STATIC METHOD
    static void phienBan() {
        System.out.println("Version 2.0");
        log("Kiểm tra phiên bản");  // Gọi private static
    }

    // 4. PRIVATE METHOD (dùng trong default)
        //    Chỉ dùng bên trong interface (không thể gọi từ bên ngoài)
        //    Dùng để tái sử dụng code trong default/static methods
    private void kiemTraHeThong() {
        System.out.println("  Kiểm tra phần cứng");
        System.out.println("  Kiểm tra phần mềm");
    }

    private void luuDuLieu() {
        System.out.println("  Lưu dữ liệu vào cache");
    }

    // PRIVATE STATIC METHOD (dùng trong static)
    private static void log(String msg) {
        System.out.println("[LOG] " + msg);
    }
}
