package Java.Web.Interface;

class MayTinh implements CongNghe {
    @Override
    public void moTaCongNghe() {
        System.out.println("Công nghệ máy tính hiện đại");
    }

    // Có thể override default method
    @Override
    public void khoiDong() {
        System.out.println("=== KHỞI ĐỘNG MÁY TÍNH ===");
        CongNghe.super.khoiDong();  // Gọi default method từ interface
        System.out.println("Khởi động thành công!");
    }
}