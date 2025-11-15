import java.util.Scanner;

class TaiLieu {
    private String maTaiLieu143;
    private String tenNXB143;
    private int soBanPhatHanh143;

    public TaiLieu() {}

    public TaiLieu(String maTaiLieu143, String tenNXB143, int soBanPhatHanh143) {
        this.maTaiLieu143 = maTaiLieu143;
        this.tenNXB143 = tenNXB143;
        this.soBanPhatHanh143 = soBanPhatHanh143;
    }

    public String getMaTaiLieu143() { return maTaiLieu143; }
    public void setMaTaiLieu143(String maTaiLieu143) { this.maTaiLieu143 = maTaiLieu143; }

    public String getTenNXB143() { return tenNXB143; }
    public void setTenNXB143(String tenNXB143) { this.tenNXB143 = tenNXB143; }

    public int getSoBanPhatHanh143() { return soBanPhatHanh143; }
    public void setSoBanPhatHanh143(int soBanPhatHanh143) { this.soBanPhatHanh143 = soBanPhatHanh143; }

    public void nhapThongTin143(Scanner sc143) {
        System.out.print("Nhập mã tài liệu: ");
        maTaiLieu143 = sc143.nextLine();
        System.out.print("Nhập tên NXB: ");
        tenNXB143 = sc143.nextLine();
        System.out.print("Nhập số bản phát hành: ");
        soBanPhatHanh143 = Integer.parseInt(sc143.nextLine());
    }

    public void hienThiThongTin143() {
        System.out.println("Mã tài liệu: " + maTaiLieu143);
        System.out.println("Tên NXB: " + tenNXB143);
        System.out.println("Số bản phát hành: " + soBanPhatHanh143);
    }
}
