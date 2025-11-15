import java.util.Scanner;

class KhachHang {
    private String hoTen143;
    private String soNha143;
    private String maSoCongTo143;

    public void nhap143(Scanner sc) {
        sc.nextLine(); // bỏ dòng thừa
        System.out.print("Nhap ho ten chu ho: ");
        hoTen143 = sc.nextLine();
        System.out.print("Nhap so nha: ");
        soNha143 = sc.nextLine();
        System.out.print("Nhap ma so cong to: ");
        maSoCongTo143 = sc.nextLine();
    }

    public void hienThi143() {
        System.out.println("Ho ten chu ho: " + hoTen143);
        System.out.println("So nha: " + soNha143);
        System.out.println("Ma so cong to: " + maSoCongTo143);
    }

    public String getMaSoCongTo143() {
        return maSoCongTo143;
    }
}