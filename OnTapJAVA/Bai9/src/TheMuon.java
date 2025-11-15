class TheMuon {
    private String soPhieuMuon143;
    private String ngayMuon143;  // dạng: dd/MM/yyyy
    private String hanTra143;    // dạng: dd/MM/yyyy
    private String soHieuSach143;
    private SinhVien sinhVien143;
    public TheMuon(String soPhieuMuon143, String ngayMuon143, String hanTra143, String soHieuSach143, SinhVien sinhVien143) {
        this.soPhieuMuon143 = soPhieuMuon143;
        this.ngayMuon143 = ngayMuon143;
        this.hanTra143 = hanTra143;
        this.soHieuSach143 = soHieuSach143;
        this.sinhVien143 = sinhVien143;
    }
    public boolean isHanTraCuoiThang143() {
        try {
            String[] parts143 = hanTra143.split("/");
            int ngay143 = Integer.parseInt(parts143[0]);
            int thang143 = Integer.parseInt(parts143[1]);
            int nam143 = Integer.parseInt(parts143[2]);
            int soNgayTrongThang143;
            switch (thang143) {
                case 1, 3, 5, 7, 8, 10, 12 -> soNgayTrongThang143 = 31;
                case 4, 6, 9, 11 -> soNgayTrongThang143 = 30;
                case 2 -> {
                    boolean namNhuan143 = (nam143 % 400 == 0) || (nam143 % 4 == 0 && nam143 % 100 != 0);
                    soNgayTrongThang143 = namNhuan143 ? 29 : 28;
                }
                default -> soNgayTrongThang143 = -1;
            }
            return ngay143 == soNgayTrongThang143;
        } catch (Exception e143) {
            return false;
        }
    }
    public void hienThi143() {
        System.out.println("Số phiếu mượn: " + soPhieuMuon143);
        System.out.println("Ngày mượn: " + ngayMuon143);
        System.out.println("Hạn trả: " + hanTra143);
        System.out.println("Số hiệu sách: " + soHieuSach143);
        sinhVien143.hienThi143();
    }
}