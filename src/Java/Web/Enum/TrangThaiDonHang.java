package Java.Web.Enum;

public enum TrangThaiDonHang {
    // Khởi tạo các trạng thái Đơn Hàng
    MOI(1, "Mới tạo"),
    XAC_NHAN(2, "Đã xác nhận đơn hàng"),
    DANG_CHUAN_BI(3, "Đang chuẩn bị"),
    DA_GIAO_HANG(4, "Đã giao hàng"),
    HUY(5, "Đã hủy");

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
