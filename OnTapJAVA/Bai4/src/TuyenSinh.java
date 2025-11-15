import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TuyenSinh {
    private List<ThiSinh> danhSachThiSinh143 = new ArrayList<>();

    public void nhapThiSinh143(Scanner sc143) {
        System.out.println("Chọn khối thi:");
        System.out.println("1. Khối A");
        System.out.println("2. Khối B");
        System.out.println("3. Khối C");
        System.out.print("Lựa chọn: ");
        String chon143 = sc143.nextLine();

        ThiSinh ts143 = null;
        switch (chon143) {
            case "1":
                ts143 = new ThiSinhKhoiA();
                break;
            case "2":
                ts143 = new ThiSinhKhoiB();
                break;
            case "3":
                ts143 = new ThiSinhKhoiC();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                return;
        }
        ts143.nhapThongTin143(sc143);
        danhSachThiSinh143.add(ts143);
        System.out.println(">> Đã thêm thí sinh thành công!");
    }

    public void hienThiTatCa143() {
        if (danhSachThiSinh143.isEmpty()) {
            System.out.println(">> Chưa có thí sinh nào.");
            return;
        }
        System.out.println("===== DANH SÁCH THÍ SINH =====");
        for (ThiSinh ts143 : danhSachThiSinh143) {
            ts143.hienThiThongTin143();
            System.out.println("-------------------");
        }
    }

    public void timKiemTheoSBD143(String sbd143) {
        boolean timThay143 = false;
        for (ThiSinh ts143 : danhSachThiSinh143) {
            if (ts143.getSoBaoDanh143().equalsIgnoreCase(sbd143)) {
                System.out.println(">> Tìm thấy thí sinh:");
                ts143.hienThiThongTin143();
                timThay143 = true;
                break;
            }
        }
        if (!timThay143) System.out.println(">> Không tìm thấy thí sinh có số báo danh: " + sbd143);
    }
}