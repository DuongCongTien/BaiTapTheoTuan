import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc143 = new Scanner(System.in);
        QuanLyHocSinh qlhs143 = new QuanLyHocSinh();

        int chon143;
        do {
            System.out.println("\n===== MENU QUẢN LÝ HỌC SINH =====");
            System.out.println("1. Nhập danh sách học sinh");
            System.out.println("2. Hiển thị toàn bộ học sinh");
            System.out.println("3. Hiển thị học sinh sinh năm 1985 & quê Thái Nguyên");
            System.out.println("4. Hiển thị học sinh lớp 10A1");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            chon143 = Integer.parseInt(sc143.nextLine());

            switch (chon143) {
                case 1 -> qlhs143.nhapDanhSach143(sc143);
                case 2 -> qlhs143.hienThiTatCa143();
                case 3 -> qlhs143.hienThiHSNam1985_ThaiNguyen143();
                case 4 -> qlhs143.hienThiHS10A1143();
                case 0 -> System.out.println("Thoát chương trình.");
                default -> System.out.println("⚠ Lựa chọn không hợp lệ, vui lòng nhập lại!");
            }
        } while (chon143 != 0);

        sc143.close();
    }
}
