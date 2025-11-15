class SinhVien {
    private String hoTen143;
    private String maSV143;
    private String ngaySinh143;
    private String lop143;

    public SinhVien(String hoTen143, String maSV143, String ngaySinh143, String lop143) {
        this.hoTen143 = hoTen143;
        this.maSV143 = maSV143;
        this.ngaySinh143 = ngaySinh143;
        this.lop143 = lop143;
    }

    public void hienThi143() {
        System.out.println("Họ tên: " + hoTen143);
        System.out.println("Mã SV: " + maSV143);
        System.out.println("Ngày sinh: " + ngaySinh143);
        System.out.println("Lớp: " + lop143);
    }
}