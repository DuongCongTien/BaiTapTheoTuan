import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class KhachSan {
    private List<KhachTro> danhSach143;

    public KhachSan() {
        danhSach143 = new ArrayList<>();
    }

    // Thêm khách trọ mới
    public void nhapMotKhachTro143(Scanner sc143) {
        System.out.print("Họ tên: ");
        String hoTen143 = sc143.nextLine();
        System.out.print("Ngày sinh: ");
        String ngaySinh143 = sc143.nextLine();
        System.out.print("CMND: ");
        String cmnd143 = sc143.nextLine();

        System.out.print("Số ngày trọ: ");
        int soNgayTro143 = Integer.parseInt(sc143.nextLine());
        System.out.print("Loại phòng: ");
        String loaiPhong143 = sc143.nextLine();
        System.out.print("Giá phòng: ");
        double giaPhong143 = Double.parseDouble(sc143.nextLine());

        Nguoi nguoi143 = new Nguoi(hoTen143, ngaySinh143, cmnd143);
        KhachTro khachTro143 = new KhachTro(nguoi143, soNgayTro143, loaiPhong143, giaPhong143);
        danhSach143.add(khachTro143);
        System.out.println("✅ Đã thêm khách trọ thành công!");
    }

    public void hienThiTatCa143() {
        System.out.println("\n=== DANH SÁCH KHÁCH ĐANG TRỌ ===");
        if (danhSach143.isEmpty()) {
            System.out.println("⚠ Không có khách trọ nào.");
            return;
        }
        for (KhachTro kt143 : danhSach143) {
            System.out.println("-------------------------");
            kt143.hienThi143();
        }
    }

    public void xoaKhachTro143(String cmnd143) {
        KhachTro xoa143 = null;
        for (KhachTro kt143 : danhSach143) {
            if (kt143.getCmnd143().equals(cmnd143)) {
                xoa143 = kt143;
                break;
            }
        }
        if (xoa143 != null) {
            danhSach143.remove(xoa143);
            System.out.println("✅ Đã xóa khách trọ có CMND: " + cmnd143);
        } else {
            System.out.println("⚠ Không tìm thấy khách trọ có CMND: " + cmnd143);
        }
    }

    public void traPhongTinhTien143(String cmnd143) {
        for (KhachTro kt143 : danhSach143) {
            if (kt143.getCmnd143().equals(cmnd143)) {
                System.out.println("\nKhách hàng trả phòng:");
                kt143.hienThi143();
                System.out.println("💰 Số tiền cần thanh toán: " + kt143.tinhTien143());
                return;
            }
        }
        System.out.println("⚠ Không tìm thấy khách trọ có CMND: " + cmnd143);
    }

    public void timKiemKhachTro143(String cmnd143) {
        for (KhachTro kt143 : danhSach143) {
            if (kt143.getCmnd143().equals(cmnd143)) {
                System.out.println("\n🔎 Thông tin khách trọ:");
                kt143.hienThi143();
                return;
            }
        }
        System.out.println("⚠ Không tìm thấy khách trọ có CMND: " + cmnd143);
    }
}
