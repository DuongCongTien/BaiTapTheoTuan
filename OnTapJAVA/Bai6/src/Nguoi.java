class Nguoi {
    private String hoTen143;
    private String ngaySinh143;
    private String cmnd143;

    public Nguoi(String hoTen143, String ngaySinh143, String cmnd143) {
        this.hoTen143 = hoTen143;
        this.ngaySinh143 = ngaySinh143;
        this.cmnd143 = cmnd143;
    }

    public String getCmnd143() {
        return cmnd143;
    }

    public void hienThi143() {
        System.out.println("Họ tên: " + hoTen143);
        System.out.println("Ngày sinh: " + ngaySinh143);
        System.out.println("CMND: " + cmnd143);
    }
}