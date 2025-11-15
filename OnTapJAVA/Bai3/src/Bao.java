import java.util.Scanner;

class Bao extends TaiLieu {
    private String ngayPhatHanh143;

    public Bao() {}

    public Bao(String ma143, String nxb143, int soBan143, String ngayPhatHanh143) {
        super(ma143, nxb143, soBan143);
        this.ngayPhatHanh143 = ngayPhatHanh143;
    }

    @Override
    public void nhapThongTin143(Scanner sc143) {
        super.nhapThongTin143(sc143);
        System.out.print("Nhập ngày phát hành (dd/mm/yyyy): ");
        ngayPhatHanh143 = sc143.nextLine();
    }

    @Override
    public void hienThiThongTin143() {
        super.hienThiThongTin143();
        System.out.println("Ngày phát hành: " + ngayPhatHanh143);
    }
}