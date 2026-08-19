package Java.Web.Enum;

public enum PhuongThucThanhToan {
    // Định nghĩa 3 hằng số, mỗi hằng số ghi đè (override) hàm thanhToan
    THE_TIN_DUNG {
        @Override
        public void thanhToan(double soTien) {
            System.out.println("Thanh toán " + soTien + " VNĐ qua thẻ tín dụng. Cần nhập mã OTP.");
        }
    },
    VNPAY {
        @Override
        public void thanhToan(double soTien) {
            System.out.println("Thanh toán " + soTien + " VNĐ qua VNPay. Quét mã QR trên app.");
        }
    },
    MOMO {
        @Override
        public void thanhToan(double soTien) {
            System.out.println("Thanh toán " + soTien + " VNĐ qua Momo. Nhập mật khẩu ví.");
        }
    };

    // Bắt buộc phải khai báo phương thức abstract này để các hằng số trên bắt buộc phải ghi đè
    public abstract void thanhToan(double soTien);
}
