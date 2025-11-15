class Nguoi {
    private String hoTen143;
    private String ngaySinh143;
    private String queQuan143;

    public Nguoi(String hoTen143, String ngaySinh143, String queQuan143) {
        this.hoTen143 = hoTen143;
        this.ngaySinh143 = ngaySinh143;
        this.queQuan143 = queQuan143;
    }

    public void hienThi143() {
        System.out.println("Họ tên: " + hoTen143);
        System.out.println("Ngày sinh: " + ngaySinh143);
        System.out.println("Quê quán: " + queQuan143);
    }
}