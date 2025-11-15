import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class QuanLySach {
    private List<TaiLieu> danhSach143 = new ArrayList<>();

    public void themTaiLieu143(Scanner sc143) {
        System.out.println("Chọn loại tài liệu:");
        System.out.println("1. Sách");
        System.out.println("2. Tạp chí");
        System.out.println("3. Báo");
        System.out.print("Lựa chọn: ");
        String chon143 = sc143.nextLine();

        TaiLieu tl143 = null;
        switch (chon143) {
            case "1":
                tl143 = new Sach();
                break;
            case "2":
                tl143 = new TapChi();
                break;
            case "3":
                tl143 = new Bao();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                return;
        }
        tl143.nhapThongTin143(sc143);
        danhSach143.add(tl143);
        System.out.println(">> Đã thêm tài liệu thành công!");
    }

    public void timKiemTheoLoai143(String loai143) {
        boolean timThay143 = false;
        for (TaiLieu tl143 : danhSach143) {
            if ((loai143.equalsIgnoreCase("sach") && tl143 instanceof Sach) ||
                    (loai143.equalsIgnoreCase("tapchi") && tl143 instanceof TapChi) ||
                    (loai143.equalsIgnoreCase("bao") && tl143 instanceof Bao)) {
                tl143.hienThiThongTin143();
                System.out.println("------------------");
                timThay143 = true;
            }
        }
        if (!timThay143) System.out.println(">> Không tìm thấy tài liệu loại: " + loai143);
    }

    public void timKiemTheoMa143(String ma143) {
        boolean timThay143 = false;
        for (TaiLieu tl143 : danhSach143) {
            if (tl143.getMaTaiLieu143().equalsIgnoreCase(ma143)) {
                tl143.hienThiThongTin143();
                System.out.println("------------------");
                timThay143 = true;
            }
        }
        if (!timThay143) System.out.println(">> Không tìm thấy tài liệu có mã: " + ma143);
    }
}