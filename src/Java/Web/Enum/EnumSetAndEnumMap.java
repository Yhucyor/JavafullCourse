package Java.Web.Enum;

import java.util.EnumMap;
import java.util.EnumSet;

public class EnumSetAndEnumMap {

    public static void main(String[] args) {
        // === EnumSet === //
        // Tạo một Set chứa các trạng thái đơn hàng đang ở trạng thái "cần xử lý"
        // Lưu ý: Code ảnh của bạn dùng EnumSet.of(...), cách này viết đúng rồi
        EnumSet<TrangThaiDonHang> canXuLy = EnumSet.of(
                TrangThaiDonHang.MOI,
                TrangThaiDonHang.XAC_NHAN
        );

        // Thêm một trạng thái nữa vào danh sách đang chuẩn bị
        // Lưu ý: canXuLy.addAll() sẽ thêm các phần tử từ dangChuanBi vào canXuLy
        EnumSet<TrangThaiDonHang> dangChuanBi = EnumSet.of(TrangThaiDonHang.DANG_CHUAN_BI);
        canXuLy.addAll(dangChuanBi);

        // In ra danh sách
        System.out.println(canXuLy);
        // Kết quả in ra: [MOI, XAC_NHAN, DANG_CHUAN_BI]

        // === EnumMap === //
        // Tạo một Map nối Trạng thái đơn hàng (Key) với mô tả chi tiết (Value)
        EnumMap<TrangThaiDonHang, String> chiTietTrangThai = new EnumMap<>(TrangThaiDonHang.class);

        // Đưa dữ liệu vào
        chiTietTrangThai.put(TrangThaiDonHang.MOI, "Đơn hàng vừa được khách đặt");
        chiTietTrangThai.put(TrangThaiDonHang.HUY, "Khách đã huỷ đơn hàng trước khi giao");

        // Lấy dữ liệu ra dựa trên Key enum
        String moTaDayDu = chiTietTrangThai.get(TrangThaiDonHang.MOI);
        System.out.println(moTaDayDu); // Kết quả: "Đơn hàng vừa được khách đặt"
    }
}