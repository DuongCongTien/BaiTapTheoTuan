import java.util.Scanner;

class TapChi extends TaiLieu {
    private int soPhatHanh143;
    private int thangPhatHanh143;

    public TapChi() {}

    public TapChi(String ma143, String nxb143, int soBan143, int soPhatHanh143, int thang143) {
        super(ma143, nxb143, soBan143);
        this.soPhatHanh143 = soPhatHanh143;
        this.thangPhatHanh143 = thang143;
    }

    @Override
    public void nhapThongTin143(Scanner sc143) {
        super.nhapThongTin143(sc143);
        System.out.print("Nhập số phát hành: ");
        soPhatHanh143 = Integer.parseInt(sc143.nextLine());
        System.out.print("Nhập tháng phát hành: ");
        thangPhatHanh143 = Integer.parseInt(sc143.nextLine());
    }

    @Override
    public void hienThiThongTin143() {
        super.hienThiThongTin143();
        System.out.println("Số phát hành: " + soPhatHanh143);
        System.out.println("Tháng phát hành: " + thangPhatHanh143);
    }
}