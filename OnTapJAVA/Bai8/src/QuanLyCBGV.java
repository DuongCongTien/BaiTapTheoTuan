import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class QuanLyCBGV {
    private List<CBGV> danhSachCBGV143;

    public QuanLyCBGV() {
        danhSachCBGV143 = new ArrayList<>();
    }

    public void nhapDanhSach143(Scanner sc143) {
        System.out.print("Nhập số lượng cán bộ giáo viên: ");
        int n143 = Integer.parseInt(sc143.nextLine());
        for (int i = 0; i < n143; i++) {
            System.out.println("\n--- Nhập thông tin CBGV thứ " + (i + 1) + " ---");
            System.out.print("Họ tên: ");
            String hoTen143 = sc143.nextLine();
            System.out.print("Ngày sinh: ");
            String ngaySinh143 = sc143.nextLine();
            System.out.print("Quê quán: ");
            String queQuan143 = sc143.nextLine();

            System.out.print("Lương cứng: ");
            double luongCung143 = Double.parseDouble(sc143.nextLine());
            System.out.print("Thưởng: ");
            double thuong143 = Double.parseDouble(sc143.nextLine());
            System.out.print("Phạt: ");
            double phat143 = Double.parseDouble(sc143.nextLine());

            Nguoi nguoi143 = new Nguoi(hoTen143, ngaySinh143, queQuan143);
            CBGV cbgv143 = new CBGV(nguoi143, luongCung143, thuong143, phat143);
            danhSachCBGV143.add(cbgv143);
        }
    }

    public void hienThiTatCa143() {
        System.out.println("\n=== DANH SÁCH CÁN BỘ GIÁO VIÊN ===");
        if (danhSachCBGV143.isEmpty()) {
            System.out.println("⚠ Chưa có dữ liệu!");
            return;
        }
        for (CBGV cbgv143 : danhSachCBGV143) {
            cbgv143.hienThi143();
            System.out.println("-------------------------");
        }
    }

    public void hienThiLuongTren8Tr143() {
        System.out.println("\n=== DANH SÁCH CBGV CÓ LƯƠNG ≥ 8.000.000 ===");
        boolean timThay = false;
        for (CBGV cbgv143 : danhSachCBGV143) {
            if (cbgv143.tinhLuongThucLinh143() >= 8000000) {
                cbgv143.hienThi143();
                System.out.println("-------------------------");
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("⚠ Không có CBGV nào có lương >= 8 triệu.");
        }
    }
}