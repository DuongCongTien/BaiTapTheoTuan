import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class QuanLyHocSinh {
    private List<HSHocSinh> danhSachHS143;

    public QuanLyHocSinh() {
        danhSachHS143 = new ArrayList<>();
    }

    public void nhapDanhSach143(Scanner sc143) {
        System.out.print("Nhập số lượng học sinh: ");
        int n143 = Integer.parseInt(sc143.nextLine());
        for (int i = 0; i < n143; i++) {
            System.out.println("\n--- Nhập thông tin học sinh thứ " + (i + 1) + " ---");
            System.out.print("Họ tên: ");
            String hoTen143 = sc143.nextLine();
            System.out.print("Ngày sinh (dd/MM/yyyy): ");
            String ngaySinh143 = sc143.nextLine();
            System.out.print("Quê quán: ");
            String queQuan143 = sc143.nextLine();

            System.out.print("Lớp: ");
            String lop143 = sc143.nextLine();
            System.out.print("Khóa học: ");
            String khoaHoc143 = sc143.nextLine();
            System.out.print("Kỳ học: ");
            String kyHoc143 = sc143.nextLine();

            Nguoi nguoi143 = new Nguoi(hoTen143, ngaySinh143, queQuan143);
            HSHocSinh hs143 = new HSHocSinh(nguoi143, lop143, khoaHoc143, kyHoc143);
            danhSachHS143.add(hs143);
        }
    }

    public void hienThiTatCa143() {
        System.out.println("\n=== DANH SÁCH TOÀN BỘ HỌC SINH ===");
        if (danhSachHS143.isEmpty()) {
            System.out.println("⚠ Chưa có học sinh nào trong danh sách!");
            return;
        }
        for (HSHocSinh hs143 : danhSachHS143) {
            hs143.hienThi143();
            System.out.println("-------------------------");
        }
    }

    public void hienThiHSNam1985_ThaiNguyen143() {
        System.out.println("\n=== HỌC SINH SINH NĂM 1985 & QUÊ THÁI NGUYÊN ===");
        boolean timThay = false;
        for (HSHocSinh hs143 : danhSachHS143) {
            if (hs143.isSinhNam1985_QueThaiNguyen143()) {
                hs143.hienThi143();
                System.out.println("-------------------------");
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("⚠ Không có học sinh nào thỏa điều kiện.");
        }
    }

    public void hienThiHS10A1143() {
        System.out.println("\n=== DANH SÁCH HỌC SINH LỚP 10A1 ===");
        boolean timThay = false;
        for (HSHocSinh hs143 : danhSachHS143) {
            if (hs143.isLop10A1143()) {
                hs143.hienThi143();
                System.out.println("-------------------------");
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("⚠ Không có học sinh nào thuộc lớp 10A1.");
        }
    }
}