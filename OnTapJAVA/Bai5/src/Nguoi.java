class Nguoi {
    private String hoTen143;
    private int namSinh143;
    private String ngheNghiep143;

    public Nguoi(String hoTen143, int namSinh143, String ngheNghiep143) {
        this.hoTen143 = hoTen143;
        this.namSinh143 = namSinh143;
        this.ngheNghiep143 = ngheNghiep143;
    }

    public int getTuoi143(int namHienTai143) {
        return namHienTai143 - namSinh143;
    }

    public void hienThi143() {
        System.out.println("Họ tên: " + hoTen143);
        System.out.println("Năm sinh: " + namSinh143);
        System.out.println("Nghề nghiệp: " + ngheNghiep143);
    }
}
