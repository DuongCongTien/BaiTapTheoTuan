import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class QLCB {
    private List<CanBo> danhSachCanBo = new ArrayList<>();
    public void themCanBo(Scanner sc) {
        System.out.println("Chọn loại cán bộ:");
        System.out.println("1. Công nhân");
        System.out.println("2. Kỹ sư");
        System.out.println("3. Nhân viên");
        System.out.print("Lựa chọn: ");
        int chon = Integer.parseInt(sc.nextLine());
        CanBo cb = null;
        switch (chon) {
            case 1:
                cb = new CongNhan();
                break;
            case 2:
                cb = new KySu();
                break;
            case 3:
                cb = new NhanVien();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                return;
        }
        cb.nhapThongTin(sc);
        danhSachCanBo.add(cb);
        System.out.println(">> Đã thêm cán bộ thành công!");
    }
    public void timKiemTheoTen(String hoTen) {
        boolean timThay = false;
        for (CanBo cb : danhSachCanBo) {
            if (cb.getHoTen().equalsIgnoreCase(hoTen)) {
                System.out.println(">> Thông tin cán bộ tìm được:");
                cb.hienThiThongTin();
                System.out.println("-----------------------");
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println(">> Không tìm thấy cán bộ có tên: " + hoTen);
        }
    }
}