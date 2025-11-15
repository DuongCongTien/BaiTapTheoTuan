class KhachTro {
    private Nguoi nguoi143;
    private int soNgayTro143;
    private String loaiPhong143;
    private double giaPhong143;

    public KhachTro(Nguoi nguoi143, int soNgayTro143, String loaiPhong143, double giaPhong143) {
        this.nguoi143 = nguoi143;
        this.soNgayTro143 = soNgayTro143;
        this.loaiPhong143 = loaiPhong143;
        this.giaPhong143 = giaPhong143;
    }

    public String getCmnd143() {
        return nguoi143.getCmnd143();
    }

    public double tinhTien143() {
        return soNgayTro143 * giaPhong143;
    }

    public void hienThi143() {
        nguoi143.hienThi143();
        System.out.println("Số ngày trọ: " + soNgayTro143);
        System.out.println("Loại phòng: " + loaiPhong143);
        System.out.println("Giá phòng: " + giaPhong143);
        System.out.println("Tổng tiền: " + tinhTien143());
    }
}