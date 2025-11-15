import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc143 = new Scanner(System.in);
        QuanLyCBGV qlcbgv143 = new QuanLyCBGV();

        int chon143;
        do {
            System.out.println("\n===== MENU QUẢN LÝ CBGV =====");
            System.out.println("1. Nhập danh sách CBGV");
            System.out.println("2. Hiển thị toàn bộ danh sách");
            System.out.println("3. Hiển thị CBGV có lương >= 8 triệu");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            chon143 = Integer.parseInt(sc143.nextLine());

            switch (chon143) {
                case 1 -> qlcbgv143.nhapDanhSach143(sc143);
                case 2 -> qlcbgv143.hienThiTatCa143();
                case 3 -> qlcbgv143.hienThiLuongTren8Tr143();
                case 0 -> System.out.println("Thoát chương trình.");
                default -> System.out.println("⚠ Lựa chọn không hợp lệ!");
            }
        } while (chon143 != 0);

        sc143.close();
    }
}