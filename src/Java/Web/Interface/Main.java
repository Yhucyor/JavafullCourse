package Java.Web.Interface;

public class Main {
    public static void main(String[] args) {
        // Gọi static
        CongNghe.phienBan();  // Version 2.0, [LOG] Kiểm tra phiên bản

        // Gọi abstract và default
        MayTinh mt = new MayTinh();
        mt.moTaCongNghe();    // Công nghệ máy tính hiện đại
        mt.khoiDong();
        // === KHỞI ĐỘNG MÁY TÍNH ===
        // Đang khởi động...
        //   Kiểm tra phần cứng
        //   Kiểm tra phần mềm
        // Khởi động thành công!

        mt.tatMay();
        // Đang tắt...
        //   Lưu dữ liệu vào cache
    }
}