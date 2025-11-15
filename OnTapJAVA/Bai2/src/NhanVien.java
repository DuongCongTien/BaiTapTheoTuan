import java.util.Scanner;

class NhanVien extends CanBo {
    private String congViec;

    public NhanVien() {}

    public NhanVien(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() { return congViec; }
    public void setCongViec(String congViec) { this.congViec = congViec; }

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Nhập công việc: ");
        congViec = sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Công việc: " + congViec);
    }
}