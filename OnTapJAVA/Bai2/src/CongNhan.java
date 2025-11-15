import java.util.Scanner;

class CongNhan extends CanBo {
    private String bac;

    public CongNhan() {}

    public CongNhan(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String bac) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.bac = bac;
    }

    public String getBac() { return bac; }
    public void setBac(String bac) { this.bac = bac; }

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Nhập bậc công nhân (VD: 3/7): ");
        bac = sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Bậc công nhân: " + bac);
    }
}
