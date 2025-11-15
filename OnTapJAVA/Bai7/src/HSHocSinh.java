class HSHocSinh {
    private Nguoi nguoi143;
    private String lop143;
    private String khoaHoc143;
    private String kyHoc143;

    public HSHocSinh(Nguoi nguoi143, String lop143, String khoaHoc143, String kyHoc143) {
        this.nguoi143 = nguoi143;
        this.lop143 = lop143;
        this.khoaHoc143 = khoaHoc143;
        this.kyHoc143 = kyHoc143;
    }

    public boolean isSinhNam1985_QueThaiNguyen143() {
        // Lấy 4 ký tự cuối cùng của ngày sinh làm năm
        String nam = nguoi143.getNgaySinh143().substring(nguoi143.getNgaySinh143().length() - 4);
        return nam.equals("1985") && nguoi143.getQueQuan143().equalsIgnoreCase("Thái Nguyên");
    }

    public boolean isLop10A1143() {
        return lop143.equalsIgnoreCase("10A1");
    }

    public void hienThi143() {
        nguoi143.hienThi143();
        System.out.println("Lớp: " + lop143);
        System.out.println("Khóa học: " + khoaHoc143);
        System.out.println("Kỳ học: " + kyHoc143);
    }
}
