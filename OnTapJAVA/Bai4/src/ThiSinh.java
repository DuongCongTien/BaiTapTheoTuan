import java.util.Scanner;

class ThiSinh {
    private String soBaoDanh143;
    private String hoTen143;
    private String diaChi143;
    private String dienUuTien143;
    public ThiSinh() {}

    public ThiSinh(String soBaoDanh143, String hoTen143, String diaChi143, String dienUuTien143) {
        this.soBaoDanh143 = soBaoDanh143;
        this.hoTen143 = hoTen143;
        this.diaChi143 = diaChi143;
        this.dienUuTien143 = dienUuTien143;
    }
    public String getSoBaoDanh143() { return soBaoDanh143; }
    public void setSoBaoDanh143(String soBaoDanh143) { this.soBaoDanh143 = soBaoDanh143; }
    public String getHoTen143() { return hoTen143; }
    public void setHoTen143(String hoTen143) { this.hoTen143 = hoTen143; }
    public String getDiaChi143() { return diaChi143; }
    public void setDiaChi143(String diaChi143) { this.diaChi143 = diaChi143; }
    public String getDienUuTien143() { return dienUuTien143; }
    public void setDienUuTien143(String dienUuTien143) { this.dienUuTien143 = dienUuTien143; }
    public void nhapThongTin143(Scanner sc143) {
        System.out.print("Nhập số báo danh: ");
        soBaoDanh143 = sc143.nextLine();
        System.out.print("Nhập họ tên: ");
        hoTen143 = sc143.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diaChi143 = sc143.nextLine();
        System.out.print("Nhập diện ưu tiên: ");
        dienUuTien143 = sc143.nextLine();
    }
    public void hienThiThongTin143() {
        System.out.println("Số báo danh: " + soBaoDanh143);
        System.out.println("Họ tên: " + hoTen143);
        System.out.println("Địa chỉ: " + diaChi143);
        System.out.println("Diện ưu tiên: " + dienUuTien143);
    }
}

