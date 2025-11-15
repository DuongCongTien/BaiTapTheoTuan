import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class KhuPho {
    private List<HoDan> danhSachHo143;
    public KhuPho() {
        danhSachHo143 = new ArrayList<>();
    }
    public void nhapThongTin143(Scanner sc143) {
        System.out.print("Nhập số hộ dân trong khu phố: ");
        int n143 = Integer.parseInt(sc143.nextLine());
        for (int i = 0; i < n143; i++) {
            System.out.println("\n--- Nhập thông tin hộ dân thứ " + (i + 1) + " ---");
            System.out.print("Nhập số nhà: ");
            String soNha143 = sc143.nextLine();
            System.out.print("Nhập số thành viên: ");
            int soThanhVien143 = Integer.parseInt(sc143.nextLine());

            HoDan ho143 = new HoDan(soThanhVien143, soNha143);

            for (int j = 0; j < soThanhVien143; j++) {
                System.out.println("Nhập thông tin thành viên " + (j + 1) + ":");
                System.out.print("Họ tên: ");
                String hoTen143 = sc143.nextLine();
                System.out.print("Năm sinh: ");
                int namSinh143 = Integer.parseInt(sc143.nextLine());
                System.out.print("Nghề nghiệp: ");
                String ngheNghiep143 = sc143.nextLine();

                ho143.themThanhVien143(new Nguoi(hoTen143, namSinh143, ngheNghiep143));
            }
            danhSachHo143.add(ho143);
        }
    }
    public void hienThiHoCoNguoi80Tuoi143() {
        int namHienTai143 = java.time.Year.now().getValue();
        System.out.println("\n=== Các hộ có người từ 80 tuổi trở lên ===");
        for (HoDan ho143 : danhSachHo143) {
            if (ho143.coNguoi80Tuoi143(namHienTai143)) {
                ho143.hienThi143();
            }
        }
    }
}