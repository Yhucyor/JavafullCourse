package Java.Web.Enum;

public enum TrangThaiDonHang {
    // Khởi tạo các trạng thái Đơn Hàng
    MOI(1, "Mới tạo"),
    XAC_NHAN(2, "Đã xác nhận đơn hàng"),
    DANG_CHUA_BI(3, "Đang chuẩn bị");

    public int getMa() {
        return ma;
    }

    public String getMoTa() {
        return moTa;
    }

    private final int ma;
    private final String moTa;

    TrangThaiDonHang(int ma, String moTa){
        this.ma = ma;
        this.moTa = moTa;
    }
}
