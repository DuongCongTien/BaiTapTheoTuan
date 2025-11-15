import java.util.Scanner;

class Sach extends TaiLieu {
    private String tenTacGia143;
    private int soTrang143;

    public Sach() {}

    public Sach(String ma143, String nxb143, int soBan143, String tacGia143, int soTrang143) {
        super(ma143, nxb143, soBan143);
        this.tenTacGia143 = tacGia143;
        this.soTrang143 = soTrang143;
    }

    @Override
    public void nhapThongTin143(Scanner sc143) {
        super.nhapThongTin143(sc143);
        System.out.print("Nhập tên tác giả: ");
        tenTacGia143 = sc143.nextLine();
        System.out.print("Nhập số trang: ");
        soTrang143 = Integer.parseInt(sc143.nextLine());
    }

    @Override
    public void hienThiThongTin143() {
        super.hienThiThongTin143();
        System.out.println("Tên tác giả: " + tenTacGia143);
        System.out.println("Số trang: " + soTrang143);
    }
}