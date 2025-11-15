import java.util.Scanner;

class BienLai {
    private KhachHang kh143 = new KhachHang();
    private int chiSoCu143;
    private int chiSoMoi143;

    public void nhap143(Scanner sc) {
        System.out.println("\n=== Nhap thong tin khach hang ===");
        kh143.nhap143(sc);
        System.out.print("Nhap chi so cu: ");
        chiSoCu143 = sc.nextInt();
        System.out.print("Nhap chi so moi: ");
        chiSoMoi143 = sc.nextInt();
    }

    public void hienThi143() {
        System.out.println("\n=== Thong tin bien lai ===");
        kh143.hienThi143();
        System.out.println("Chi so cu: " + chiSoCu143);
        System.out.println("Chi so moi: " + chiSoMoi143);
        System.out.println("So tien phai tra: " + tinhTien143() + " VND");
    }

    public double tinhTien143() {
        return (chiSoMoi143 - chiSoCu143) * 750;
    }

    public String getMaSoCongTo143() {
        return kh143.getMaSoCongTo143();
    }
}