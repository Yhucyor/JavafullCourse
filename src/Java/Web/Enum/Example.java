package Java.Web.Enum;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        TrangThaiDonHang trangThaiHienTai = TrangThaiDonHang.DA_GIAO_HANG;

        // --- Hàm name() ---
        // Trả về giá trị hiện tại của hằng số enum
        System.out.println("1. name(): " + trangThaiHienTai.name());
        System.out.println(trangThaiHienTai);

        // --- Hàm toString() ---
        System.out.println("2. toString(): " + trangThaiHienTai.toString());

        // --- Hàm ordinal() ---
        System.out.println("3. ordinal(): " + trangThaiHienTai.ordinal());

        // --- Hàm compareTo() ---
        // So sánh thứ tự (dựa trên ordinal). Trả về số âm, số dương, hoặc 0.
        TrangThaiDonHang trangThaiMoi = TrangThaiDonHang.MOI;      // ordinal là 0
        TrangThaiDonHang trangThaiXacNhan = TrangThaiDonHang.XAC_NHAN; // ordinal là 1
        System.out.println("4. So sánh XAC_NHAN với MOI: " + trangThaiXacNhan.compareTo(trangThaiMoi));
        // Kết quả: 1 (Vì 1 - 0 = 1)

        // --- Hàm values() --- (Quan trọng nhất)
        System.out.println(Arrays.toString(TrangThaiDonHang.values()));
        // --- Hàm valueOf(String name) --- (Quan trọng nhất)
        // Chuyển đổi một chuỗi ký tự (String) thành một đối tượng Enum tương ứng.
        // Rất hữu dụng khi bạn nhận dữ liệu từ người dùng hoặc từ file text.
        System.out.println("\n\n6. valueOf('HUY'): ");
        TrangThaiDonHang tuChuoi = TrangThaiDonHang.valueOf("HUY");
        System.out.println("Chuỗi 'HUY' chuyển thành enum: " + tuChuoi.name() + " (Mã: " + tuChuoi.getMa() + ")");
        // Kết quả: Chuỗi 'HUY' chuyển thành enum: HUY (Mã: 6)

        TrangThaiDonHang trangThai = TrangThaiDonHang.DANG_CHUAN_BI;

        switch (trangThai) {
            case MOI:
                System.out.println("Đơn hàng mới, cần xác nhận!");
                break;
            case XAC_NHAN:
                System.out.println("Đã xác nhận, chờ đóng gói.");
                break;
            case DANG_CHUAN_BI:
                System.out.println("Đang chuẩn bị hàng, sẽ giao sớm.");
                break;
            case DA_GIAO_HANG:
                System.out.println("Đã giao cho đơn vị vận chuyển.");
                break;
            case HUY:
                System.out.println("Đơn hàng đã bị hủy.");
                break;
        }

        // Nhận thông tin phương thức từ form đăng ký
        PhuongThucThanhToan p = PhuongThucThanhToan.MOMO;

        // Gọi hàm thanh toán. Tự động nó sẽ in ra dòng chữ dành riêng cho MOMO.
        p.thanhToan(150000);

        // Kết quả in ra: "Thanh toán 150000.0 VNĐ qua Momo. Nhập mật khẩu ví."
    }
}
