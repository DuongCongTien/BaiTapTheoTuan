import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class QuanLyTheMuon {
    private List<TheMuon> danhSachTheMuon143;

    public QuanLyTheMuon() {
        danhSachTheMuon143 = new ArrayList<>();
    }

    public void nhapDanhSach143(Scanner sc143) {
        System.out.print("Nhập số lượng thẻ mượn: ");
        int n143 = Integer.parseInt(sc143.nextLine());
        for (int i = 0; i < n143; i++) {
            System.out.println("\n--- Nhập thông tin thẻ mượn thứ " + (i + 1) + " ---");
            System.out.print("Số phiếu mượn: ");
            String soPhieuMuon143 = sc143.nextLine();
            System.out.print("Ngày mượn (dd/MM/yyyy): ");
            String ngayMuon143 = sc143.nextLine();
            System.out.print("Hạn trả (dd/MM/yyyy): ");
            String hanTra143 = sc143.nextLine();
            System.out.print("Số hiệu sách: ");
            String soHieuSach143 = sc143.nextLine();

            System.out.println("=== Nhập thông tin sinh viên ===");
            System.out.print("Họ tên: ");
            String hoTen143 = sc143.nextLine();
            System.out.print("Mã SV: ");
            String maSV143 = sc143.nextLine();
            System.out.print("Ngày sinh: ");
            String ngaySinh143 = sc143.nextLine();
            System.out.print("Lớp: ");
            String lop143 = sc143.nextLine();

            SinhVien sv143 = new SinhVien(hoTen143, maSV143, ngaySinh143, lop143);
            TheMuon theMuon143 = new TheMuon(soPhieuMuon143, ngayMuon143, hanTra143, soHieuSach143, sv143);
            danhSachTheMuon143.add(theMuon143);
        }
    }

    public void hienThiTatCa143() {
        System.out.println("\n=== DANH SÁCH THẺ MƯỢN ===");
        if (danhSachTheMuon143.isEmpty()) {
            System.out.println("⚠ Chưa có thẻ mượn nào!");
            return;
        }
        for (TheMuon tm143 : danhSachTheMuon143) {
            tm143.hienThi143();
            System.out.println("-------------------------");
        }
    }

    public void hienThiHanTraCuoiThang143() {
        System.out.println("\n=== DANH SÁCH THẺ MƯỢN CÓ HẠN TRẢ CUỐI THÁNG ===");
        boolean timThay143 = false;
        for (TheMuon tm143 : danhSachTheMuon143) {
            if (tm143.isHanTraCuoiThang143()) {
                tm143.hienThi143();
                System.out.println("-------------------------");
                timThay143 = true;
            }
        }
        if (!timThay143) {
            System.out.println("⚠ Không có thẻ mượn nào có hạn trả cuối tháng.");
        }
    }
}
