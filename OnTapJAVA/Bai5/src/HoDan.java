import java.util.ArrayList;
import java.util.List;

class HoDan {
    private int soThanhVien143;
    private String soNha143;
    private List<Nguoi> thanhVien143;

    public HoDan(int soThanhVien143, String soNha143) {
        this.soThanhVien143 = soThanhVien143;
        this.soNha143 = soNha143;
        this.thanhVien143 = new ArrayList<>();
    }

    public void themThanhVien143(Nguoi n143) {
        thanhVien143.add(n143);
    }

    public void hienThi143() {
        System.out.println("\n=== Thông tin hộ dân số nhà " + soNha143 + " ===");
        System.out.println("Số thành viên: " + soThanhVien143);
        for (Nguoi n143 : thanhVien143) {
            n143.hienThi143();
            System.out.println("------------------");
        }
    }

    public boolean coNguoi80Tuoi143(int namHienTai143) {
        for (Nguoi n143 : thanhVien143) {
            if (n143.getTuoi143(namHienTai143) >= 80) {
                return true;
            }
        }
        return false;
    }
}